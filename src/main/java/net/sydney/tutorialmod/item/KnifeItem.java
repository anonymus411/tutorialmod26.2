package net.sydney.tutorialmod.item;
import net.fabricmc.fabric.api.event.player.UseBlockCallback;
import net.fabricmc.fabric.api.item.v1.EnchantingContext;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.Holder;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.EquipmentSlotGroup;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.component.ItemAttributeModifiers;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.CakeBlock;
import net.minecraft.world.level.block.CarvedPumpkinBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import net.sydney.tutorialmod.ModItems;
import net.sydney.tutorialmod.refabricated.ItemAbility;
import net.sydney.tutorialmod.tag.ModTags;
import net.sydney.tutorialmod.utility.ItemUtils;


import java.util.Set;

public class KnifeItem extends Item
{
    /**
     * This action is used on cutting recipes which need a knife.
     */
    public static final ItemAbility KNIFE_DIG = ItemAbility.KNIFE_DIG;
    /**
     * This action is used in gameplay interactions where something is harvested.
     */
    public static final ItemAbility KNIFE_HARVEST = ItemAbility.KNIFE_HARVEST;

    public static final Set<ItemAbility> KNIFE_ACTIONS = Set.of(ItemAbility.SHEARS_CARVE, ItemAbility.SWORD_DIG, KNIFE_DIG, KNIFE_HARVEST);

    public KnifeItem(Properties properties) {
        super(properties);
    }



    public static ItemAttributeModifiers createAttributes(ToolMaterial material, float attackDamage, float attackSpeed) {
        return ItemAttributeModifiers.builder()
                .add(Attributes.ATTACK_DAMAGE, new AttributeModifier(BASE_ATTACK_DAMAGE_ID, attackDamage + material.attackDamageBonus(), AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.MAINHAND)
                .add(Attributes.ATTACK_SPEED, new AttributeModifier(BASE_ATTACK_SPEED_ID, attackSpeed, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.MAINHAND)
                .build();
    }

    @Override
    public boolean canBeEnchantedWith(ItemStack stack, Holder<Enchantment> enchantment, EnchantingContext context) {
        if (enchantment.is(Enchantments.SWEEPING_EDGE)) {
            return false;
        }
        return super.canBeEnchantedWith(stack, enchantment, context);
    }

    public static class KnifeEvents
    {
        public static double onKnifeKnockback(double strength, LivingEntity entity) {
            LivingEntity attacker = entity.getKillCredit();
            ItemStack toolStack = attacker != null ? attacker.getItemInHand(InteractionHand.MAIN_HAND) : ItemStack.EMPTY;
            if (toolStack.getItem() instanceof KnifeItem) {
                strength = strength - 0.1F;
            }
            return strength;
        }


    }

    @Override
    public InteractionResult useOn(UseOnContext context) {
        Level level = context.getLevel();
        ItemStack toolStack = context.getItemInHand();
        BlockPos pos = context.getClickedPos();
        BlockState state = level.getBlockState(pos);
        Direction facing = context.getClickedFace();

        if (state.getBlock() == Blocks.PUMPKIN && toolStack.is(ModTags.Items.KNIVES)) {
            Player player = context.getPlayer();
            if (player != null && !level.isClientSide()) {
                Direction direction = facing.getAxis() == Direction.Axis.Y ? player.getDirection().getOpposite() : facing;
                level.playSound(null, pos, SoundEvents.PUMPKIN_CARVE, SoundSource.BLOCKS, 1.0F, 1.0F);
                level.setBlock(pos, Blocks.CARVED_PUMPKIN.defaultBlockState().setValue(CarvedPumpkinBlock.FACING, direction), 11);
                ItemEntity itemEntity = new ItemEntity(level, (double) pos.getX() + 0.5D + (double) direction.getStepX() * 0.65D, (double) pos.getY() + 0.1D, (double) pos.getZ() + 0.5D + (double) direction.getStepZ() * 0.65D, new ItemStack(Items.PUMPKIN_SEEDS, 4));
                itemEntity.setDeltaMovement(0.05D * (double) direction.getStepX() + level.getRandom().nextDouble() * 0.02D, 0.05D, 0.05D * (double) direction.getStepZ() + level.getRandom().nextDouble() * 0.02D);
                level.addFreshEntity(itemEntity);
                toolStack.hurtAndBreak(1, player, context.getHand().asEquipmentSlot());
            }
            return level.isClientSide() ? InteractionResult.SUCCESS : InteractionResult.CONSUME;
        } else {
            return InteractionResult.PASS;
        }
    }
}

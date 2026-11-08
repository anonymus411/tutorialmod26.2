package net.sydney.tutorialmod;


import net.minecraft.client.color.block.BlockTintSource;
import net.minecraft.client.color.block.BlockTintSources;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;


import java.util.function.Consumer;




public class ClientFunctions {

    public BlockTintSource registerLeafColors() {
        return BlockTintSources.foliage();
    }

    /*public ItemColor registerItemColors() {
        return (stack, tintIndex) -> {
            BlockState blockstate = ((BlockItem)stack.getItem()).getBlock().defaultBlockState();
            return Minecraft.getInstance().getBlockColors().getColor(blockstate, null, null, tintIndex);
        };
    }*/


}

package net.sydney.tutorialmod.client.model;

import com.google.auto.service.AutoService;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.BlockModelResolver;
import net.minecraft.client.renderer.block.dispatch.BlockStateModel;
import net.sydney.tutorialmod.client.TutorialModClientFabric;


@AutoService(ModelAccess.class)
public class FabricModelAccess implements ModelAccess {
    @Override
    public BlockStateModel getModel(String name, BlockModelResolver blockRenderDispatcher) {
        return Minecraft.getInstance().getModelManager().getModel(TutorialModClientFabric.EXTRA_MODELS.get(name));
    }
}
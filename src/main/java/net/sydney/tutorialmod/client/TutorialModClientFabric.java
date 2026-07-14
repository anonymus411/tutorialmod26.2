package net.sydney.tutorialmod.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.model.loading.v1.ExtraModelKey;
import net.fabricmc.fabric.api.client.model.loading.v1.ModelLoadingPlugin;
import net.fabricmc.fabric.api.client.particle.v1.ParticleProviderRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.ModelLayerRegistry;
import net.minecraft.client.renderer.block.dispatch.BlockStateModel;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderers;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.sydney.tutorialmod.TutorialMod;
import org.jspecify.annotations.NonNull;

import java.util.HashMap;
import java.util.Map;

import static net.fabricmc.fabric.api.client.model.loading.v1.SimpleUnbakedExtraModel.blockStateModel;

@Environment(EnvType.CLIENT)
public class TutorialModClientFabric implements ClientModInitializer, ModelLoadingPlugin {

    public static final Map<String, ExtraModelKey<BlockStateModel>> EXTRA_MODELS = new HashMap<>();

    @Override
    public void onInitializeClient() {
        TutorialModClient.onInitialize();
        TutorialModClient.registerEntityRenderers(EntityRenderers::register);

        ModelLoadingPlugin.register(this);
    }


    @Override
    public void initialize(Context context) {

    }
}



package eu.novagames.gemstones.items.custom.armor;

import eu.novagames.gemstones.GemStones;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class AmethystAmorModel extends AnimatedGeoModel<AmethystAmorItem> {

    @Override
    public ResourceLocation getModelLocation(AmethystAmorItem object) {
        return new ResourceLocation(GemStones.MOD_ID, "geo/amethyst_armor_1.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(AmethystAmorItem object) {
        return new ResourceLocation(GemStones.MOD_ID, "textures/models/armor/amethyst_armor_1.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(AmethystAmorItem animatable) {
        return new ResourceLocation(GemStones.MOD_ID, "animations/armor_animation.json");
    }
}
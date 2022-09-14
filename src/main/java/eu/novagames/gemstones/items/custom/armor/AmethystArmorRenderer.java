package eu.novagames.gemstones.items.custom.armor;

import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class AmethystArmorRenderer extends GeoArmorRenderer<AmethystAmorItem> {

    public AmethystArmorRenderer() {
        super(new AmethystAmorModel());

        this.headBone = "armorHead";
        this.bodyBone = "armorBody";
        this.rightArmBone = "armorRightArm";
        this.leftArmBone = "armorLeftArm";
        this.rightLegBone = "armorLeftLeg";
        this.leftLegBone = "armorRightLeg";
        this.rightBootBone = "armorLeftBoot";
        this.leftBootBone = "armorRightBoot";
    }
}
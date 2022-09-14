package eu.novagames.gemstones.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class GemStonesCommonConfigs {

    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    //public static final  ForgeConfigSpec.ConfigValue<Boolean> CUSTOM_TITLE_SCREEN;

    static {
        BUILDER.push("Configs for Gemstones");

        //CUSTOM_TITLE_SCREEN = BUILDER.comment("Whether the default Title Screen will be replaced")
                // .define("replace", true);

        BUILDER.pop();
        SPEC = BUILDER.build();
    }
}

package eu.novagames.gemstones.items;

import eu.novagames.gemstones.GemStones;
import eu.novagames.gemstones.blocks.ModBlocks;
import eu.novagames.gemstones.items.custom.BundleItem;
import eu.novagames.gemstones.items.custom.PortalOpenerItem;
import eu.novagames.gemstones.items.custom.armor.AmethystAmorItem;
import eu.novagames.gemstones.items.food.ModFood;
import eu.novagames.gemstones.items.tools.ModTiers;
import eu.novagames.gemstones.items.tools.PaxelItem;
import eu.novagames.gemstones.items.tools.armor.ModArmorMaterials;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, GemStones.MOD_ID);

    public static final RegistryObject<Item> HAMMER = ITEMS.register("hammer", () -> new Item(new Item.Properties().stacksTo(1).durability(32).tab(ModCreativeModeTab.ITEM_GEMSTONES_TAB)));
    public static final RegistryObject<Item> BUNDLE = ITEMS.register("bundle", () -> new BundleItem(new Item.Properties().stacksTo(1).durability(1).tab(ModCreativeModeTab.ITEM_GEMSTONES_TAB)));
    public static final RegistryObject<Item> PEARL = ITEMS.register("pearl", () -> new Item(new Item.Properties().stacksTo(16).tab(ModCreativeModeTab.ITEM_GEMSTONES_TAB)));
    public static final RegistryObject<Item> PEARL_SHARD = ITEMS.register("pearl_shard", ()-> new Item(new Item.Properties().stacksTo(64).tab(ModCreativeModeTab.ITEM_GEMSTONES_TAB)));
    public static final RegistryObject<Item> PORTAL_OPENER = ITEMS.register("portal_opener", PortalOpenerItem::new);
    // public static final RegistryObject<Item> TENEBRIS_STICK = ITEMS.register("tenebris_stick", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ITEM_GEMSTONES_TAB)));
    public static final RegistryObject<Item> BLUE_BERRIES = ITEMS.register("blue_berries", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOOD_GEMSTONES_TAB).food(ModFood.BLUE_BERRIES)));
    public static final RegistryObject<Item> BLUE_BERRIES_SEEDS = ITEMS.register("blue_berry_seeds", ()-> new ItemNameBlockItem(ModBlocks.BLUE_BERRIES_PLANT.get(), new Item.Properties().tab(ModCreativeModeTab.FOOD_GEMSTONES_TAB)));
    public static final RegistryObject<Item> RUBY_GEM = ITEMS.register("ruby_gem", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ITEM_GEMSTONES_TAB)));
    public static final RegistryObject<Item> SAPPHIRE_GEM = ITEMS.register("sapphire_gem", ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.ITEM_GEMSTONES_TAB)));
    public static final RegistryObject<Item> AMETHYST_GEM = ITEMS.register("amethyst_gem", ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.ITEM_GEMSTONES_TAB)));
    public static final RegistryObject<Item> CAERULA_INGOT = ITEMS.register("caerula_ingot", ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.ITEM_GEMSTONES_TAB)));
    public static final RegistryObject<Item> CAERULA_SHARD = ITEMS.register("caerula_shard", ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.ITEM_GEMSTONES_TAB)));
    public static final RegistryObject<Item> RAW_CAERULA = ITEMS.register("raw_caerula", ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.ITEM_GEMSTONES_TAB)));
    public static final RegistryObject<Item> RUBY_SWORD = ITEMS.register("ruby_sword", () -> new SwordItem(ModTiers.RUBY, 4, -2.3F, new Item.Properties().tab(ModCreativeModeTab.ITEM_GEMSTONES_TAB)));
    public static final RegistryObject<Item> RUBY_PICKAXE = ITEMS.register("ruby_pickaxe", () -> new PickaxeItem(ModTiers.RUBY, 1, -2.8F, new Item.Properties().tab(ModCreativeModeTab.ITEM_GEMSTONES_TAB)));
    public static final RegistryObject<Item> RUBY_SHOVEL = ITEMS.register("ruby_shovel", () -> new ShovelItem(ModTiers.RUBY, 1.5F, -3.0F, new Item.Properties().tab(ModCreativeModeTab.ITEM_GEMSTONES_TAB)));
    public static final RegistryObject<Item> RUBY_AXE = ITEMS.register("ruby_axe",() -> new AxeItem(ModTiers.RUBY, 5.0F, -3.0F, new Item.Properties().tab(ModCreativeModeTab.ITEM_GEMSTONES_TAB)));
    public static final RegistryObject<Item> RUBY_HOE = ITEMS.register("ruby_hoe", () -> new HoeItem(ModTiers.RUBY, -3, 0.0F, new Item.Properties().tab(ModCreativeModeTab.ITEM_GEMSTONES_TAB)));
    public static final RegistryObject<Item> RUBY_PAXEL = ITEMS.register("ruby_paxel", () -> new PaxelItem(ModTiers.RUBY, 5.0F, -2.8F, new Item.Properties().tab(ModCreativeModeTab.ITEM_GEMSTONES_TAB)));
    public static final RegistryObject<Item> RUBY_HELMET = ITEMS.register("ruby_helmet", () -> new ArmorItem(ModArmorMaterials.RUBY, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeModeTab.ITEM_GEMSTONES_TAB)));
    public static final RegistryObject<Item> RUBY_CHESTPLATE = ITEMS.register("ruby_chestplate", () -> new ArmorItem(ModArmorMaterials.RUBY, EquipmentSlot.CHEST, new Item.Properties().tab(ModCreativeModeTab.ITEM_GEMSTONES_TAB)));
    public static final RegistryObject<Item> RUBY_LEGGINGS = ITEMS.register("ruby_leggings", () -> new ArmorItem(ModArmorMaterials.RUBY, EquipmentSlot.LEGS, new Item.Properties().tab(ModCreativeModeTab.ITEM_GEMSTONES_TAB)));
    public static final RegistryObject<Item> RUBY_BOOTS = ITEMS.register("ruby_boots", () -> new ArmorItem(ModArmorMaterials.RUBY, EquipmentSlot.FEET, new Item.Properties().tab(ModCreativeModeTab.ITEM_GEMSTONES_TAB)));
    public static final RegistryObject<Item> SAPPHIRE_SWORD = ITEMS.register("sapphire_sword", () -> new SwordItem(ModTiers.SAPPHIRE, 4, -2.3F, new Item.Properties().tab(ModCreativeModeTab.ITEM_GEMSTONES_TAB)));
    public static final RegistryObject<Item> SAPPHIRE_PICKAXE = ITEMS.register("sapphire_pickaxe", () -> new PickaxeItem(ModTiers.SAPPHIRE, 1, -2.8F, new Item.Properties().tab(ModCreativeModeTab.ITEM_GEMSTONES_TAB)));
    public static final RegistryObject<Item> SAPPHIRE_SHOVEL = ITEMS.register("sapphire_shovel", () -> new ShovelItem(ModTiers.SAPPHIRE, 1.5F, -3.0F, new Item.Properties().tab(ModCreativeModeTab.ITEM_GEMSTONES_TAB)));
    public static final RegistryObject<Item> SAPPHIRE_AXE = ITEMS.register("sapphire_axe",() -> new AxeItem(ModTiers.SAPPHIRE, 5.0F, -3.0F, new Item.Properties().tab(ModCreativeModeTab.ITEM_GEMSTONES_TAB)));
    public static final RegistryObject<Item> SAPPHIRE_HOE = ITEMS.register("sapphire_hoe", () -> new HoeItem(ModTiers.SAPPHIRE, -3, 0.0F, new Item.Properties().tab(ModCreativeModeTab.ITEM_GEMSTONES_TAB)));
    public static final RegistryObject<Item> SAPPHIRE_PAXEL = ITEMS.register("sapphire_paxel", () -> new PaxelItem(ModTiers.SAPPHIRE, 5.0F, -2.8F, new Item.Properties().tab(ModCreativeModeTab.ITEM_GEMSTONES_TAB)));
    public static final RegistryObject<Item> SAPPHIRE_HELMET = ITEMS.register("sapphire_helmet", () -> new ArmorItem(ModArmorMaterials.SAPPHIRE, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeModeTab.ITEM_GEMSTONES_TAB)));
    public static final RegistryObject<Item> SAPPHIRE_CHESTPLATE = ITEMS.register("sapphire_chestplate", () -> new ArmorItem(ModArmorMaterials.SAPPHIRE, EquipmentSlot.CHEST, new Item.Properties().tab(ModCreativeModeTab.ITEM_GEMSTONES_TAB)));
    public static final RegistryObject<Item> SAPPHIRE_LEGGINGS = ITEMS.register("sapphire_leggings", () -> new ArmorItem(ModArmorMaterials.SAPPHIRE, EquipmentSlot.LEGS, new Item.Properties().tab(ModCreativeModeTab.ITEM_GEMSTONES_TAB)));
    public static final RegistryObject<Item> SAPPHIRE_BOOTS = ITEMS.register("sapphire_boots", () -> new ArmorItem(ModArmorMaterials.SAPPHIRE, EquipmentSlot.FEET, new Item.Properties().tab(ModCreativeModeTab.ITEM_GEMSTONES_TAB)));
    public static final RegistryObject<Item> AMETHYST_SWORD = ITEMS.register("amethyst_sword", () -> new SwordItem(ModTiers.AMETHYST, 4, -2.3F, new Item.Properties().tab(ModCreativeModeTab.ITEM_GEMSTONES_TAB)));
    public static final RegistryObject<Item> AMETHYST_PICKAXE = ITEMS.register("amethyst_pickaxe", () -> new PickaxeItem(ModTiers.AMETHYST, 1, -2.8F, new Item.Properties().tab(ModCreativeModeTab.ITEM_GEMSTONES_TAB)));
    public static final RegistryObject<Item> AMETHYST_SHOVEL = ITEMS.register("amethyst_shovel", () -> new ShovelItem(ModTiers.AMETHYST, 1.5F, -3.0F, new Item.Properties().tab(ModCreativeModeTab.ITEM_GEMSTONES_TAB)));
    public static final RegistryObject<Item> AMETHYST_AXE = ITEMS.register("amethyst_axe",() -> new AxeItem(ModTiers.AMETHYST, 5.0F, -3.0F, new Item.Properties().tab(ModCreativeModeTab.ITEM_GEMSTONES_TAB)));
    public static final RegistryObject<Item> AMETHYST_HOE = ITEMS.register("amethyst_hoe", () -> new HoeItem(ModTiers.AMETHYST, -3, 0.0F, new Item.Properties().tab(ModCreativeModeTab.ITEM_GEMSTONES_TAB)));
    // public static final RegistryObject<Item> AMETHYST_PAXEL = ITEMS.register("amethyst_paxel", () -> new PaxelItem(ModTiers.AMETHYST, 5.0F, -2.8F, new Item.Properties().tab(ModCreativeModeTab.ITEM_GEMSTONES_TAB)));
    public static final RegistryObject<Item> AMETHYST_HELMET = ITEMS.register("amethyst_helmet", () -> new ArmorItem(ModArmorMaterials.AMETHYST, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeModeTab.ITEM_GEMSTONES_TAB)));
    public static final RegistryObject<Item> AMETHYST_CHESTPLATE = ITEMS.register("amethyst_chestplate", () -> new ArmorItem(ModArmorMaterials.AMETHYST, EquipmentSlot.CHEST, new Item.Properties().tab(ModCreativeModeTab.ITEM_GEMSTONES_TAB)));
    public static final RegistryObject<Item> AMETHYST_LEGGINGS = ITEMS.register("amethyst_leggings", () -> new ArmorItem(ModArmorMaterials.AMETHYST, EquipmentSlot.LEGS, new Item.Properties().tab(ModCreativeModeTab.ITEM_GEMSTONES_TAB)));
    public static final RegistryObject<Item> AMETHYST_BOOTS = ITEMS.register("amethyst_boots", () -> new ArmorItem(ModArmorMaterials.AMETHYST, EquipmentSlot.FEET, new Item.Properties().tab(ModCreativeModeTab.ITEM_GEMSTONES_TAB)));
    // Powder
    public static final RegistryObject<Item> COAL_POWDER = ITEMS.register("coal_powder", ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.ITEM_GEMSTONES_TAB)));
    public static final RegistryObject<Item> IRON_POWDER = ITEMS.register("iron_powder", ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.ITEM_GEMSTONES_TAB)));
    public static final RegistryObject<Item> GOLD_POWDER = ITEMS.register("gold_powder", ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.ITEM_GEMSTONES_TAB)));
    public static final RegistryObject<Item> DIAMOND_POWDER = ITEMS.register("diamond_powder", ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.ITEM_GEMSTONES_TAB)));
    public static final RegistryObject<Item> EMERALD_POWDER = ITEMS.register("emerald_powder", ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.ITEM_GEMSTONES_TAB)));
    public static final RegistryObject<Item> RUBY_POWDER = ITEMS.register("ruby_powder", ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.ITEM_GEMSTONES_TAB)));
    public static final RegistryObject<Item> SAPPHIRE_POWDER = ITEMS.register("sapphire_powder", ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.ITEM_GEMSTONES_TAB)));
    public static final RegistryObject<Item> AMETHYST_POWDER = ITEMS.register("amethyst_powder", ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.ITEM_GEMSTONES_TAB)));
    public static final RegistryObject<Item> CAERULA_POWDER = ITEMS.register("caerula_powder", ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.ITEM_GEMSTONES_TAB)));
    // Lumps
    public static final RegistryObject<Item> COAL_LUMPS = ITEMS.register("coal_lumps", ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.ITEM_GEMSTONES_TAB)));
    public static final RegistryObject<Item> IRON_LUMPS = ITEMS.register("iron_lumps", ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.ITEM_GEMSTONES_TAB)));
    public static final RegistryObject<Item> GOLD_LUMPS = ITEMS.register("gold_lumps", ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.ITEM_GEMSTONES_TAB)));
    public static final RegistryObject<Item> DIAMOND_LUMPS = ITEMS.register("diamond_lumps", ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.ITEM_GEMSTONES_TAB)));
    public static final RegistryObject<Item> EMERALD_LUMPS = ITEMS.register("emerald_lumps", ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.ITEM_GEMSTONES_TAB)));
    public static final RegistryObject<Item> RUBY_LUMPS = ITEMS.register("ruby_lumps", ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.ITEM_GEMSTONES_TAB)));
    public static final RegistryObject<Item> SAPPHIRE_LUMPS = ITEMS.register("sapphire_lumps", ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.ITEM_GEMSTONES_TAB)));
    public static final RegistryObject<Item> AMETHYST_LUMPS = ITEMS.register("amethyst_lumps", ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.ITEM_GEMSTONES_TAB)));
    public static final RegistryObject<Item> CAERULA_LUMPS = ITEMS.register("caerula_lumps", ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.ITEM_GEMSTONES_TAB)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
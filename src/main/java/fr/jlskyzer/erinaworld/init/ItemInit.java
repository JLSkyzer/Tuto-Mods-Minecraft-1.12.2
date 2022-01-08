package fr.jlskyzer.erinaworld.init;

import fr.jlskyzer.erinaworld.objects.armour.ArmourBase;
import fr.jlskyzer.erinaworld.objects.items.secondItemBase;
import fr.jlskyzer.erinaworld.objects.tools.*;
import fr.jlskyzer.erinaworld.objects.items.ItemBase;
import fr.jlskyzer.erinaworld.tabs.SecondTutorialTab;
import fr.jlskyzer.erinaworld.util.Reference;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

import java.util.ArrayList;
import java.util.List;

public class ItemInit {

    // On crée la liste des items
    public static final List<Item> ITEMS = new ArrayList<Item>();

//    Materials
    public static final ToolMaterial COPPER_TOOL = EnumHelper.addToolMaterial("copper_tool", 2, 180, 5.0F, 1.5F, 5);
    public static final ArmorMaterial COPPER_ARMOR = EnumHelper.addArmorMaterial("copper_armor", Reference.MODID + ":copper", 13, new int[]{2, 5, 6, 2}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
        /* ===== TOOLS =====
        WOOD(0, 59, 2.0F, 0.0F, 15)
        STONE(1, 131, 4.0F, 1.0F, 5)
        IRON(2, 250, 6.0F, 2.0F, 14)
        DIAMOND(3, 1561, 8.0F, 3.0F, 10)
        GOLD(0, 32, 12.0F, 0.0F, 22)
        harvestLevel, maxUses, efficiency, damageVsEntity, enchantability
        */
        /* ===== ARMORS =====
        LEATHER("leather", 5, new int[]{1, 2, 3, 1}, 15, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F),
        CHAIN("chainmail", 15, new int[]{1, 4, 5, 2}, 12, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0F),
        IRON("iron", 15, new int[]{2, 5, 6, 2}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F:),
        GOLD("gold", 7, new int[]{1, 3, 5, 2}, 25, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 0.0F),
        DIAMOND("diamond", 33, new int[]{3, 6, 8, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F);

        */


    // Creation de l'item
    public static final Item COPPER_INGOT = new ItemBase("ingot_copper");
    public static final Item TUTORIAL_INGOT = new secondItemBase("tutorial_ingot");

//    Tools
    public static final Item COPPER_AXE = new ToolAxe("copper_axe", COPPER_TOOL);
    public static final Item COPPER_PICKAXE = new ToolPickaxe("copper_pickaxe", COPPER_TOOL);
    public static final Item COPPER_SWORD = new ToolSword("copper_sword", COPPER_TOOL);
    public static final Item COPPER_SHOVEL = new ToolShovel("copper_shovel", COPPER_TOOL);
    public static final Item COPPER_HOE = new ToolHoe("copper_hoe", COPPER_TOOL);

//    Armors
    public static final Item COPPER_HELMET = new ArmourBase("copper_helmet", COPPER_ARMOR, 1, EntityEquipmentSlot.HEAD);
    public static final Item COPPER_CHESTPLATE = new ArmourBase("copper_chestplate", COPPER_ARMOR, 1, EntityEquipmentSlot.CHEST);
    public static final Item COPPER_LEGGINGS = new ArmourBase("copper_leggings", COPPER_ARMOR, 2, EntityEquipmentSlot.LEGS);
    public static final Item COPPER_BOOTS = new ArmourBase("copper_boots", COPPER_ARMOR, 1, EntityEquipmentSlot.FEET);

}

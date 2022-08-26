package io.github.terslenk.exlimus.utils;

import io.github.terslenk.exlimus.ExLimus;
import io.github.terslenk.exlimus.items.tools.Hammer;
import io.github.terslenk.exlimus.items.tools.Kama;
import io.github.terslenk.exlimus.items.tools.Workbench;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class EXItems {
    public static final SlimefunItemStack WOODEN_KAMA = new SlimefunItemStack(
            "EL_WOODEN_KAMA",
            Material.WOODEN_HOE,
            "&f木制卡玛",
            "",
            "&7一种可用于采摘树叶的工具"
    );
    public static final SlimefunItemStack STONE_KAMA = new SlimefunItemStack(
            "EL_STONE_KAMA",
            Material.STONE_HOE,
            "&f石头卡玛",
            "",
            "&7一种可用于采摘树叶的工具"
    );
    public static final SlimefunItemStack IRON_KAMA = new SlimefunItemStack(
            "EL_IRON_KAMA",
            Material.IRON_HOE,
            "&f铁卡马",
            "",
            "&7一种可用于采摘树叶的工具"
    );
    public static final SlimefunItemStack STONE_HAMMER = new SlimefunItemStack(
            "EL_STONE_HAMMER",
            Material.STONE_PICKAXE,
            "&f石锤",
            "",
            "&7可用于碾压的大块石镐"
    );
    public static final SlimefunItemStack IRON_HAMMER = new SlimefunItemStack(
            "EL_REINFORCED_HAMMER",
            Material.IRON_PICKAXE,
            "&f铁锤子",
            "",
            "&7石锤的铁质版本"
    );

    static {
        ItemMeta wkamaMeta = WOODEN_KAMA.getItemMeta();
        wkamaMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        WOODEN_KAMA.setItemMeta(wkamaMeta);
        WOODEN_KAMA.addEnchantment(Enchantment.SILK_TOUCH, 1);

        ItemMeta skamaMeta = STONE_KAMA.getItemMeta();
        skamaMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        STONE_KAMA.setItemMeta(skamaMeta);
        STONE_KAMA.addEnchantment(Enchantment.SILK_TOUCH, 1);

        ItemMeta ikamaMeta = IRON_KAMA.getItemMeta();
        ikamaMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        IRON_KAMA.setItemMeta(ikamaMeta);
        IRON_KAMA.addEnchantment(Enchantment.SILK_TOUCH, 1);

        ItemMeta stoneHammerMeta = STONE_HAMMER.getItemMeta();
        stoneHammerMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        STONE_HAMMER.setItemMeta(stoneHammerMeta);
        STONE_HAMMER.addEnchantment(Enchantment.DURABILITY, 1);

        ItemMeta reinforcedHammerMeta = IRON_HAMMER.getItemMeta();
        reinforcedHammerMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        IRON_HAMMER.setItemMeta(reinforcedHammerMeta);
        IRON_HAMMER.addEnchantment(Enchantment.DURABILITY, 2);
    }

    //MISC
    public static final SlimefunItemStack DUST = new SlimefunItemStack(
            "EL_DUST",
            Material.CLAY,
            "&f灰尘",
            "",
            "&7粉碎版的沙子",
            "&7可用于筛分"
    );
    public static final SlimefunItemStack WORM = new SlimefunItemStack(
            "EL_WORM",
            Material.STRING,
            "&f虫子",
            "",
            "&7住在树叶上的生物"
    );
    public static final SlimefunItemStack COOKED_WORM = new SlimefunItemStack(
            "EL_COOKED_WORM",
            Material.STRING,
            "&f煮熟的虫子",
            "",
            "&7可食用版的虫子。",
            "&7我猜是好吃的?"
    );
    public static final SlimefunItemStack COOKED_APPLE = new SlimefunItemStack(
            "EL_COOKED_APPLE",
            Material.APPLE,
            "&f煮熟的苹果",
            "",
            "&7烧过的苹果比正常的好吗?"
    );
    //MACHINES
    public static final SlimefunItemStack ENCHANTED_WORKBENCH = new SlimefunItemStack(
            "EL_ENCHANTED_WORKBENCH",
            Material.CRAFTING_TABLE,
            "&f神奇的工作台"
    );
    public static void setup(ExLimus el){
        new Hammer(EXCategory.EL_TOOLS, STONE_HAMMER, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                null,null,null,
                null,null,null,
                null,null,null
        },1,15).register(el);
        new Hammer(EXCategory.EL_TOOLS, IRON_HAMMER, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                null,null,null,
                null,null,null,
                null,null,null
        },2,20).register(el);

        new Kama(EXCategory.EL_TOOLS, WOODEN_KAMA, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                null,null,null,
                null,null,null,
                null,null,null
        },15).register(el);
        new Kama(EXCategory.EL_TOOLS, STONE_KAMA, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                null,null,null,
                null,null,null,
                null,null,null
        },15).register(el);
        new Kama(EXCategory.EL_TOOLS, IRON_KAMA, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                null,null,null,
                null,null,null,
                null,null,null
        },15).register(el);

        new Workbench(EXCategory.EL_MACHINES, ENCHANTED_WORKBENCH, EXRecipeTypes.GRINDER,new ItemStack[]{
                null,null,null,
                null,null,null,
                null,null,null
        }).register(el);
    }
}

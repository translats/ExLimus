package io.github.terslenk.exlimus;


import io.github.mooy1.infinitylib.core.AbstractAddon;

import io.github.terslenk.exlimus.utils.config.RecipesConfig;
import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import net.md_5.bungee.api.ChatColor;
import org.bstats.bukkit.Metrics;
import org.bukkit.Bukkit;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;


public final class ExLimus extends AbstractAddon implements SlimefunAddon {
    private static ExLimus addon;
    private static RecipesConfig recipesConfig;

    public ExLimus() {
        super("TerslenK","ExLimus","master","options.auto-update");
    }
    @Override
    public void enable() {
        addon = this;
        recipesConfig = new RecipesConfig(this);
        CommandSender sender = Bukkit.getConsoleSender();

        sender.sendMessage("");
        sender.sendMessage(ChatColor.GOLD + ">--------------------- Ex Limus ---------------------<");
        sender.sendMessage(ChatColor.GREEN + " 版本: " + ChatColor.BOLD + ChatColor.BOLD + getPluginVersion());
        sender.sendMessage(ChatColor.GOLD + ">-------------------- Information -------------------<");
        sender.sendMessage(ChatColor.WHITE + " 一个由TerslenK创建的附加组件");
        sender.sendMessage("");
        sender.sendMessage(ChatColor.WHITE + " 特别感谢lucasGithuber");
        sender.sendMessage(ChatColor.GOLD + ">-------------- 问题信息链接 --------------<");
        sender.sendMessage(ChatColor.RED + " " + getBugTrackerLink());
        sender.sendMessage(ChatColor.GOLD + ">----------------------------------------------------<");
        sender.sendMessage("");

        new Metrics(this, 14604);

    }

    @Override
    public void disable() {
        // Set instance to null
        addon = null;
    }

    public static ExLimus getAddon() {
        return addon;
    }
    public String getBugTrackerLink(){
        return "https://github.com/TerslenK/ExLimus/issues";
    }
    public static FileConfiguration getRecipesConfig() {
        return recipesConfig.getConfig();
    }
}

package com.solarcraftmc.ranks;

import org.bukkit.Bukkit;
import org.bukkit.Color;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;


public class Ranks extends JavaPlugin {

	public void onEnable() {
		Bukkit.getServer().getLogger().info("SolarRanks Plugin Enabled");	
		
	}

	public void onDisable() {
		Bukkit.getServer().getLogger().info("SolarRanks Plugin Disabled");	
		
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		
	
		if (cmd.getName().equalsIgnoreCase("ranks")) { 
			sender.sendMessage(Color.AQUA + "-=SolarCraft Prison Ranks=-"
		+ "\n" + Color.GRAY + "[" + Color.SILVER + "A" + Color.GRAY + "]" + Color.ORANGE + "$1000");
			return true;	
		}
		return false;
		
	}
	
	
}

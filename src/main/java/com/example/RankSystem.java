package com.example;

import cn.nukkit.plugin.PluginBase;
import cn.nukkit.command.Command;
import cn.nukkit.command.CommandSender;

public class RankSystem extends PluginBase {

    // Placeholder for rank data
    private final HashMap<String, String> playerRanks = new HashMap<>();

    @Override
    public void onEnable() {
        getLogger().info("RankSystem has been enabled!");
        // Additional initialization code if required
    }

    @Override
    public void onDisable() {
        getLogger().info("RankSystem has been disabled!");
    }

    // Command handling
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        switch (command.getName().toLowerCase()) {
            case "setrank":
                if (args.length < 2) {
                    sender.sendMessage("Usage: /setrank <player> <rank>");
                    return true;
                }
                String player = args[0];
                String rank = args[1];
                setRank(player, rank);
                sender.sendMessage("Rank set for player " + player + " to " + rank);
                return true;
            case "getrank":
                if (args.length < 1) {
                    sender.sendMessage("Usage: /getrank <player>");
                    return true;
                }
                String targetPlayer = args[0];
                String playerRank = getRank(targetPlayer);
                sender.sendMessage("Rank of player " + targetPlayer + ": " + playerRank);
                return true;
            default:
                return false;
        }
    }

    private void setRank(String player, String rank) {
        playerRanks.put(player, rank);
    }

    private String getRank(String player) {
        return playerRanks.getOrDefault(player, "No rank");
    }
}

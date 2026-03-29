package main.java;

import java.util.HashMap;
import java.util.Map;

public class RankSystem {

    private Map<String, String> ranks;

    public RankSystem() {
        ranks = new HashMap<>();
        initializeRanks();
    }

    private void initializeRanks() {
        ranks.put("Player", "[Player]");
        ranks.put("Fly", "[Fly]");
        ranks.put("Vip", "[VIP]");
        ranks.put("Premium", "[Premium]");
        ranks.put("Moderator", "[Mod]");
        ranks.put("Admin", "[Admin]");
        ranks.put("Operator", "[Op]");
        ranks.put("Creator", "[Creator]");
        ranks.put("Owner", "[Owner]");
        ranks.put("Potentate", "[Potentate]");
        ranks.put("Sponsor", "[Sponsor]");
        ranks.put("OP", "[OP]");
        ranks.put("Mister", "[Mister]");
        ranks.put("Helper", "[Helper]");
        ranks.put("Chief Moderator", "[Chief Mod]");
    }

    public String getChatPrefix(String rank) {
        return ranks.getOrDefault(rank, "[Unknown]");
    }

    public void displayNameTag(String playerName, String rank) {
        System.out.println(getChatPrefix(rank) + " " + playerName);
    }

    // Commands for managing ranks can be added here

    public static void main(String[] args) {
        RankSystem rankSystem = new RankSystem();
        rankSystem.displayNameTag("Player1", "Admin");
    }
}
package me.flintrix;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        String[] lootTableCommon = {"gold ingot", "gem", "sword", "axe", "shield", "bow", "arrow", "magic wand", "refined gold ingot"};
        double[] commonChances = {0.8, 0.4, 0.6, 0.6, 0.3, 0.6, 0.9, 0.2, 0.1};
        lootTable(lootTableCommon, commonChances);
    }
    public static void lootTable(String[] lootTable, double[] chances){
        Random random = new Random();

        for (int i = 0; i < lootTable.length; i++){
            double roll = random.nextDouble();
            if (roll < chances[i]){
                double roll1 = random.nextDouble();
                String rarity = "common";
                if (roll1 < 0.1){
                    rarity = "legendary";
                } else if (roll1 < 0.3) {
                    rarity = "epic";
                } else if (roll1 < 0.6) {
                    rarity = "rare";
                }
                System.out.printf("you aquired a(n) %s %s%n", rarity, lootTable[i]);
            }
        }
    }
}
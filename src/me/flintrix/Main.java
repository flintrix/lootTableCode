package me.flintrix;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        String[] lootTableCommon = {"gold", "gems", "a sword", "an axe", "a shield", "a bow", "arrows", "a magic wand", "refined gold"};
        double[] commonChances = {0.8, 0.4, 0.6, 0.6, 0.3, 0.6, 0.9, 0.2, 0.1};
        lootTable(lootTableCommon, commonChances);
    }
    public static void lootTable(String[] lootTable, double[] chances){
        Random random = new Random();

        for (int i = 0; i < lootTable.length; i++){
            double roll = random.nextDouble();
            if (roll < chances[i]){
                System.out.printf("you aquired %s%n", lootTable[i]);
            }
        }
    }
}
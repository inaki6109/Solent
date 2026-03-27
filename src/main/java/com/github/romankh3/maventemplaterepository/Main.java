package com.github.romankh3.maventemplaterepository;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc = new Scanner(new File("src/main/resources/test.txt"));

        // Lire taille du plateau
        int maxX = sc.nextInt();
        int maxY = sc.nextInt();

        // Lire et traiter toutes les tondeuses
        while (sc.hasNext()) {

            int x = sc.nextInt();
            int y = sc.nextInt();
            String dir = sc.next();
            String instructions = sc.next();

            Tondeuse t = new Tondeuse(x, y, Direction.valueOf(dir), maxX, maxY);

            for (char c : instructions.toCharArray()) {
                switch (c) {
                    case 'A' -> t.avancer();
                    case 'G' -> t.setDirection('G');
                    case 'D' -> t.setDirection('D');
                }
            }

            // Afficher la position finale
            System.out.println(t.getX() + " " + t.getY() + " " + t.getDirection());
        }

        sc.close();
    }
}

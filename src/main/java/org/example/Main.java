package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Basamak Sayısı : ");
        int step = scanner.nextInt(); //take step size

        int StarCount = 2 * step - 1;
        int SpaceCount = 0;

        for (int i = 0; i < step; i++) {
            for (int j = 0; j < SpaceCount; j++) {//print spaces
                System.out.print(" ");
            }
            for (int k = 0; k < StarCount; k++) {//print stars
                System.out.print("*");
            }
            System.out.println();

            StarCount -= 2;
            SpaceCount++;
        }
    }
}

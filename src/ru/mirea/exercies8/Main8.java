package ru.mirea.exercies8;

import java.util.ArrayList;
import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        FurnitureShop shop = new FurnitureShop();
        System.out.println("Что хотите купить? 1 - wardrobe, 2 - table, 3 - all");
        int m = in.nextInt();
        switch (m){
            case(1):
                shop.add_furn( new wardrobe (5,"white wood"));
                shop.buy();
                break;
            case(2):
                shop.add_furn(new table(8,"red wood"));
                shop.buy();
                break;
            case(3):
                shop.add_furn( new wardrobe (5,"wood"));
                shop.add_furn(new table(8,"red wood"));
                shop.buy();
                break;
        }

    }
}

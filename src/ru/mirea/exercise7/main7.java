package ru.mirea.exercise7;

import java.util.ArrayList;

public class main7 {
    public static void main(String[] args){
        Plate plate = new Plate(1,10);

        Dish pan = new Pan(20,100);

        plate.calcVolume();
        ((Pan)pan).makeBorsh();

        ArrayList<Dish> allDishes = new ArrayList<>();
        allDishes.add(plate);
        allDishes.add(pan);

        gonsh gonsh = new gonsh();
        gonsh.setVoice("gav");
        gonsh.Voice();

    }
}

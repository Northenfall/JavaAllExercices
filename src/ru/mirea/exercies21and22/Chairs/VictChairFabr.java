package ru.mirea.exercies21and22.Chairs;

public class VictChairFabr implements Fabrik {
    @Override
    public Chair createChair() {

        return new VictChair();
    }
}
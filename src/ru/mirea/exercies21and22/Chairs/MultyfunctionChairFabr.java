package ru.mirea.exercies21and22.Chairs;

public class MultyfunctionChairFabr implements Fabrik{
    @Override
    public Chair createChair() {

        return new MultyfunctionChair();
    }
}

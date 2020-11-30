package ru.mirea.exercies21and22.Chairs;

public class MagicChairFabrik implements Fabrik {
    @Override
    public Chair createChair() {
        return new MagicChair();
    }
}
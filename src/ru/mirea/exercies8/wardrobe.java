package ru.mirea.exercies8;

public class wardrobe extends furniture {
    private int price;
    private String matherial;

    public wardrobe(int price, String matherial) {
        this.price = price;
        this.matherial = matherial;
    }

    @Override
        public void buy() {
            System.out.println(price + ", " + matherial);
        }

}

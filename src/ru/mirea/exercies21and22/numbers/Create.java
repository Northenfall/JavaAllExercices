package ru.mirea.exercies21and22.numbers;

public class Create implements FabrikNumb {
    @Override
    public ComplexNumbersStart createnumber() {
        double n1 = 3;
        double n2 = 2;

        return new ComplexNumbersStart(n1,n2);
    }
}
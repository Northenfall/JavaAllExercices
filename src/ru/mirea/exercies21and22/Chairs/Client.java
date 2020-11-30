package ru.mirea.exercies21and22.Chairs;

import java.util.Scanner;

public class Client  implements Chair{

    private Chair chair ;
    public Client(){
        System.out.println("Введите число: " +'\n' +
                "1 - Magic Chair" + '\n' +
                "2 - Multyfunction Chair" + '\n' +
                "3 - Vict Chair");
        Scanner scanner = new Scanner(System.in);
        int in = scanner.nextInt();
        switch (in){
            case(1):
                Fabrik magicChair = new MagicChairFabrik();
                chair = magicChair.createChair();
                break;
            case(2):
                Fabrik multyfunctionFabr = new MultyfunctionChairFabr();
                chair = multyfunctionFabr.createChair();
                break;
            case(3):
                Fabrik victorianChairFabr = new VictChairFabr();
                chair = victorianChairFabr.createChair();
                break;
        }
    }

    @Override
    public void Sit() {
        chair.Sit();
    }
}

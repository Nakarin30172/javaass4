package javabasic3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class java3 {
    public static void main(String[] args) {
        Computer com1 = new Computer(1);
        Computer com2 = new Computer(2);
        Computer com3 = new Computer(3);
        Computer com4 = new Computer(4);

        List<Computer> coms = new ArrayList<>();

        coms.add(com1);
        coms.add(com2);
        coms.add(com3);
        coms.add(com4);

        System.out.println("Num Com = " + String.valueOf(coms.size()));

        int input = 0;
        Scanner scan = new Scanner(System.in);

        while (input != -1) {

            input = scan.nextInt();

            for (int i = 0 ; i < coms.size() ; i++) {
                Computer temp = coms.get(i);
                if (temp.getID() == input) {
                    coms.remove(i);
                    System.out.println("Delete Com Num : " + String.valueOf(i + 1) + "Complete");
                    System.out.println("Num Com = " + String.valueOf(coms.size()));
                }
            }

        }
        System.exit(0);
    }
}

class Computer {

    private int ID;

    public Computer(int ID) {
        this.ID = ID;
    }

    public int getID() {
        return ID;
    }

}


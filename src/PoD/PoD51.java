package PoD;

import java.util.ArrayList;
import java.util.Scanner;

public class PoD51 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        ArrayList<Integer> num1 = new ArrayList<>();
        ArrayList<Integer> num2 = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            num1.add(scanner.nextInt());
        }

        for (int i = 0; i < size; i++) {
            num2.add(scanner.nextInt());
        }

        boolean checker = true;

        for (int i = 0; i < num1.size(); i++) {
            if (num1.get(i) +17 != num2.get(i)){
                System.out.println(num1.get(i) + " + " + "17 = " + (num1.get(i)+17) + " not " + num2.get(i)+")");
                checker = false;
                break;
            }
        }

        if (checker){
            System.out.println("It all adds up");
        }


        System.out.println("END OF OUTPUT");
    }
}

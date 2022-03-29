package PoD;

import java.util.Scanner;

public class PoD42Ranges {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = 0;
        int min =999999999;
        int[] num = new int[scanner.nextInt()];
        for (int i = 0; i < num.length; i++) {
            num[i] = scanner.nextInt();
        }
        for (int i : num) {
            if (i<min){
                min = i;
            }
            if(i>max){
                max = i;
            }
        }
        int range = max - min;

        System.out.println("Range: "+range);

    }
}

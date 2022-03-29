package Lab3;

import java.util.Scanner;

public class lab3Problem1 {
    private  static  double calculateAverage(int[] numbers){
        double totle = 0.00;
        for (int number : numbers) {
            totle = number+totle;
        }
        return totle/numbers.length;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[scanner.nextInt()];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i]=scanner.nextInt();
        }
        double ave = calculateAverage(numbers);
        System.out.printf("%.3f",ave);

    }
}

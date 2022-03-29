package Lab5;

import java.util.Scanner;

public class SailboatRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sailboatName = scanner.nextLine();
        String model = scanner.nextLine();
        int size = scanner.nextInt();
        scanner.nextLine();
        String captainName = scanner.nextLine();
        int age = scanner.nextInt();
        scanner.nextLine();
        int yoE = scanner.nextInt();
        scanner.nextLine();
        int registry = scanner.nextInt();
        scanner.nextLine();

        Sailboat sailboat = new Sailboat(size,sailboatName,model);

        System.out.println(sailboat);

        Captain captain = new Captain(age,captainName,yoE,registry);

        sailboat.assignCaptain(captain);

        System.out.println(sailboat);

        System.out.println("More details about the captain:");

        System.out.println(captain);
    }
}

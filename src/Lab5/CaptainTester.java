package Lab5;

/*
Do not modify the input part.
Create a captain object using the variables and print it after.
 */

import java.util.Scanner;

public class CaptainTester {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String name = kb.nextLine();
        int age = kb.nextInt();
        int yearsOfExperience = kb.nextInt();
        int registry = kb.nextInt();

        //Create the captain Object here
        Captain captain = new Captain(age,name,yearsOfExperience,registry);

        //Print the captain object here using toString
        System.out.println(captain);

    }
}

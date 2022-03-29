package PoD; /**
 * CSCI 1110
 * @author YourName
 */


import java.util.Scanner;

public class PoD63 {

    public static void main( String [] args ) {


        Scanner in = new Scanner(System.in);

        String firstName = in.next();
        String lastName = in.next();

        PoD63Person targetPerson = new PoD63Person(firstName, lastName);
        PoD63Person identityThief = new PoD63Person(firstName, lastName);

        //output using toString() method
        System.out.println(targetPerson);
        System.out.println(identityThief);

        System.out.print("END OF OUTPUT");
    }
}

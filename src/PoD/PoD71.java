package PoD;

/**
 * CSCI 1110
 * @author YourName
 */


import java.util.Scanner;

public class PoD71 {

    public static void main( String [] args ) {


        Scanner in = new Scanner( System.in );

        String courseName = in.nextLine();
        String instructor = in.nextLine();
        int crn = in.nextInt();
        int creditHours = in.nextInt();


        // PLEASE START YOUR CODE HERE
        // *********************************************************
        PoD71Course newCourse = new PoD71Course(crn,creditHours,courseName,instructor);


        // *********************************************************
        // PLEASE END YOUR CODE HERE


        //output using toString() method
        System.out.println(newCourse);

        System.out.print("END OF OUTPUT");
    }
}

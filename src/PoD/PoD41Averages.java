package PoD; /**
 * CSCI 1110
 * @author YourName
 * 1. PoD: Rain, rain, go away
 * Saved
 * 5 points possible
 * Instructions
 * You will be given the name of a city followed by a set of integers representing the monthly rainfall (in millimeters) that have happened in a given area over the past year. You will then calculate the average (mean) rainfall for the year.
 *
 * The mean is calculated by dividing the sum of the values in the set by the number of elements in the set.
 *
 * mean of a set = sum of all elements / number of elements
 *
 * The mean of the series 1, 2, 3, 4, 5 is:
 *
 * 1+2+3+4+5 / 5 = 15 / 5 = 3
 *
 * Output will be of the form "The average rainfall in city is mean mm"
 *
 * Write the body of the program.
 * Function Details
 * Input
 * The program reads in the following:
 *
 * A string, the name of a city
 * Twelve integers, representing the monthly rainfall (in millimeters) for the given city over the past year
 * Processing
 * You will calculate the mean rainfall.
 *
 * Output
 * Output the following where city is replaced by the name of the city and mean is replaced by the calculated average (integer) rainfall:
 *
 * The average rainfall in city is mean mm
 *
 * The text must be terminated by a new-line character.
 *
 * Sample input/output:
 * Sample Input
 * Sample Output
 * Halifax 96 69 97 98 111 108 107 97 100 125 129 118
 *  The average rainfall in Halifax is 104 mm
 */

import java.util.ArrayList;
import java.util.Scanner;

public class PoD41Averages {

    public static void main(String[] args) {

        //PLEASE START YOUR WORK HERE
        Scanner scanner = new Scanner(System.in);
        String city = scanner.next();
        ArrayList<Integer> rain = new ArrayList<>();
        while (scanner.hasNext()){
            int rainfall = scanner.nextInt();
            rain.add(rainfall);
        }
        int total = 0;
        int ave = 0;
        for (Integer i : rain) {
            total = total+i;
        }
        ave = total/rain.size();
        System.out.println("The average rainfall in "+city +" is "+ave+" mm");


        //PLEASE END YOUR WORK HERE
        System.out.print("END OF OUTPUT");
    }
}
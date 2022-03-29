package PoD; /**
 * CSCI 1110
 * @author YourName
 */

import java.util.ArrayList;
import java.util.Scanner;

public class PoD52 {

    public static void main(String[] args) {

        //Instantiate new scanner to read from the console.
        Scanner in = new Scanner( System.in );

        //PLEASE START YOUR WORK HERE
        int size = in.nextInt();
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            list1.add(in.next());
        }

        while (in.hasNext()){
            String staff = in.next();
            if(staff.equals("DONE")){
                break;
            }else {
                list2.add(staff);
            }
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < list2.size(); j++) {
                if (list1.get(i).equals(list2.get(j))){
                    list1.remove(i);
                    size = size-1;
                    i = i - 1;
                }
            }
        }

        for (String s : list1) {
            System.out.println(s);
        }



        //PLEASE END YOUR WORK HERE
    }
}
package Lab3;

import java.util.ArrayList;
import java.util.Scanner;

public class lab3Problem2 {
    public static String printRange(int[]range, int start,int end){
        StringBuilder ran= new StringBuilder("");
        ArrayList<String> re = new ArrayList<>();
        if (start>=0 && start<=end && end < range.length) {
            for (int i = start; i <= end; i++) {
               re.add(String.valueOf(range[i]));
            }
            for (String s : re) {
                ran.append(s + " ");
            }
        } else {
            ran = new StringBuilder("Invalid Range");
        }
        return String.valueOf(ran);
    }
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int[] data = new int[kb.nextInt()];

        for (int i = 0; i < data.length; i++) {
            data[i] = kb.nextInt();
        }

        for (int datum : data) {
            System.out.print(datum+" ");
        }

        int start = kb.nextInt();
        int end = kb.nextInt();

        System.out.println(printRange(data, start, end));
    }
}

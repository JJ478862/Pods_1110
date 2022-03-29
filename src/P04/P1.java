package P04;

import java.util.Scanner;

public class P1 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int numNames = kb.nextInt();

        LinkedList list = new LinkedList();
        for (int i = 0; i < numNames; i++) {
            list.addFirst(kb.next());
            System.out.println(list);
        }
    }
}

package P04.Q2;

import java.util.Scanner;

//DO NOT MODIFY THIS CLASS

public class P2 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        Stack stack = new Stack();
        int n = kb.nextInt();

        for (int i = 0; i < n; i++) {
            //Read name, and boolean (to call dequeue or not)
            Student p = new Student(kb.next());
            boolean pop = kb.nextBoolean();
            stack.push(p);
            if(pop){
                System.out.printf("Popped  %s\n", stack.pop());
            }
        }

        Student p = stack.peek();
        System.out.printf("Next person on the top is %s\n", p);
        System.out.printf("The stack size is %d\n", stack.size());


    }
}
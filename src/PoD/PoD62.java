package PoD;

import java.util.Scanner;

/**
 * CSCI 1110
 * @author YourName
 */


public class PoD62 {


    public static void main( String [] args ) {

        // PLEASE START YOUR CODE HERE
        // *********************************************************
        PoD62Taco poD62Taco = new PoD62Taco();
        Scanner scanner = new Scanner(System.in);
        boolean shell = scanner.nextBoolean();
        boolean togo = scanner.nextBoolean();
        StringBuilder ingredients = new StringBuilder(scanner.next());
        poD62Taco.setShell(shell);
        poD62Taco.setTogo(togo);
        while (scanner.hasNext()){
            ingredients.append(" ").append(scanner.next());
        }
        poD62Taco.setIngredients(String.valueOf(ingredients));
        System.out.println(poD62Taco);
        // *********************************************************
        //PLEASE END YOUR CODE HERE

        System.out.print("END OF OUTPUT");
    }
}

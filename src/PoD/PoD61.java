package PoD; /**
 * CSCI 1110
 * @author yourName
 */

import java.util.Scanner;

public class PoD61 {

    public static boolean validateBoard(String[][] gameBoard) {

        int numOfX = 0;
        int numOfO = 0;
        boolean validBoard = false;
        //PLEASE START YOUR WORK HERE
        for (String[] strings : gameBoard) {
            for (int j = 0; j < gameBoard[0].length; j++) {
                if (strings[j].equals("x")) {
                    numOfX += 1;
                }
                if (strings[j].equals("o")) {
                    numOfO += 1;
                }
            }
        }
        if (numOfX -1 == numOfO || numOfO == numOfX){
            validBoard = true;
        }




        //PLEASE END YOUR WORK HERE
        return (validBoard);
    }


    public static void main(String[] args) {

        //Instantiate new scanner to read from the console.
        Scanner in = new Scanner( System.in );
        int gamePiece;

        String[][] ticTacToeBoard = new String[3][3];

        for (int i=0; i<3; i++)
        {
            for (int j=0; j<3; j++)
            {
                //Read in board


                ticTacToeBoard[i][j] = in.next();

                //Output board
                if (j<2)
                {
                    System.out.print(ticTacToeBoard[i][j] + " ");
                }
                else
                {
                    System.out.println(ticTacToeBoard[i][j]);
                }
            }
        }


        if (validateBoard(ticTacToeBoard)) {
            System.out.println("Valid board");
        }
        else {
            System.out.println("Invalid board");
        }
    }
}
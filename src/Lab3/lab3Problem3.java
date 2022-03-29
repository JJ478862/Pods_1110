package Lab3;

import java.util.Arrays;
import java.util.Scanner;

public class lab3Problem3{

    /**
     * Method used to print all the neighbours of an element inside a 2D array.
     * The method will print each neighbour in a new line as {row,col}: value
     * @param data the 2D array
     * @param row the row coordinate of the centre (point we want to print the neighbours)
     * @param col the col coordinate of the centre (point we want to print the neighbours)
     */
    public static void printNeighbours(int[][] data, int row, int col){
        int row1 = row-1;
        int row2 = row+1;
        int col1 = col-1;
        int col2 = col+1;
        if (data.length == 1 && data[row].length==1){
            return;
        }
        if (row-1>-1 && row+1 <= data[row].length-1){
            if(col-1>-1 && col + 1 < data.length){
                System.out.println("{"+row1+","+col1+"}: "+data[row-1][col-1]);
                System.out.println("{"+row1+","+col+"}: "+data[row-1][col]);
                System.out.println("{"+row1+","+col2+"}: "+data[row-1][col+1]);
                System.out.println("{"+row+","+col1+"}: "+data[row][col-1]);
                System.out.println("{"+row+","+col2+"}: "+data[row][col+1]);
                System.out.println("{"+row2+","+col1+"}: "+data[row+1][col-1]);
                System.out.println("{"+row2+","+col+"}: "+data[row+1][col]);
                System.out.println("{"+row2+","+col2+"}: "+data[row+1][col+1]);
            }
            if (col == 0){
                System.out.println("{"+row1+","+col+"}: "+data[row-1][col]);
                System.out.println("{"+row1+","+col2+"}: "+data[row-1][col+1]);
                System.out.println("{"+row+","+col2+"}: "+data[row][col+1]);
                System.out.println("{"+row2+","+col+"}: "+data[row+1][col]);
                System.out.println("{"+row2+","+col2+"}: "+data[row+1][col+1]);
            }
            if (col == data.length-1){
                System.out.println("{"+row1+","+col1+"}: "+data[row-1][col-1]);
                System.out.println("{"+row1+","+col+"}: "+data[row-1][col]);
                System.out.println("{"+row+","+col1+"}: "+data[row][col-1]);
                System.out.println("{"+row2+","+col1+"}: "+data[row+1][col-1]);
                System.out.println("{"+row2+","+col+"}: "+data[row+1][col]);
            }
        }
        if (row == 0){
            if(col-1>-1 && col + 1 < data.length){
                System.out.println("{"+row+","+col1+"}: "+data[row][col-1]);
                System.out.println("{"+row+","+col2+"}: "+data[row][col+1]);
                System.out.println("{"+row2+","+col1+"}: "+data[row+1][col-1]);
                System.out.println("{"+row2+","+col+"}: "+data[row+1][col]);
                System.out.println("{"+row2+","+col2+"}: "+data[row+1][col+1]);
            }
            if (col == 0){
                System.out.println("{"+row+","+col2+"}: "+data[row][col+1]);
                System.out.println("{"+row2+","+col+"}: "+data[row+1][col]);
                System.out.println("{"+row2+","+col2+"}: "+data[row+1][col+1]);
            }
            if (col == data.length-1){

                System.out.println("{"+row+","+col1+"}: "+data[row][col-1]);
                System.out.println("{"+row2+","+col1+"}: "+data[row+1][col-1]);
                System.out.println("{"+row2+","+col+"}: "+data[row+1][col]);

            }
        }
        if (row == data[row].length-1){
            if(col-1>-1 && col + 1 < data.length){

                System.out.println("{"+row1+","+col1+"}: "+data[row-1][col-1]);
                System.out.println("{"+row1+","+col+"}: "+data[row-1][col]);
                System.out.println("{"+row1+","+col2+"}: "+data[row-1][col+1]);
                System.out.println("{"+row+","+col1+"}: "+data[row][col-1]);
                System.out.println("{"+row+","+col2+"}: "+data[row][col+1]);

            }
            if (col == 0){
                System.out.println("{"+row1+","+col+"}: "+data[row-1][col]);
                System.out.println("{"+row1+","+col2+"}: "+data[row-1][col+1]);
                System.out.println("{"+row+","+col2+"}: "+data[row][col+1]);

            }
            if (col == data.length-1){
                System.out.println("{"+row1+","+col1+"}: "+data[row-1][col-1]);
                System.out.println("{"+row1+","+col+"}: "+data[row-1][col]);
                System.out.println("{"+row+","+col1+"}: "+data[row][col-1]);
            }
        }
    }

    /**
     * DO NOT ALTER ME!
     * @param args NOPE!
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int[][] data = new int[5][5];
        int num = 1;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[0].length; j++) {
                data[i][j] = num;
                num++;
            }
        }

        System.out.println("The 2D Array:");
        for (int[] cols : data) {
            System.out.println(Arrays.toString(cols));
        }

        for (int i = 0; i <5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("The centre point is: %d %d (row,col)\n\n", i, j);
                printNeighbours(data, i, j);
            }
        }


    }



}
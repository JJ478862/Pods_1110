package PoD; /**
 * CSCI 1110
 * @author YourName
 */

import java.util.Scanner;

public class PoD53 {

    // PLEASE START YOUR METHOD HERE
    // *********************************************************

    private static int[] brightSpot(int[][] red, int[][] blue, int[][] green) {
        int high = red.length;
        int width  = red[0].length;
        int x = 0;
        int y = 0;
        for (int i = 0; i < high; i++) {
            for (int j = 0; j < width; j++) {
                if((red[x][y]+blue[x][y]+green[x][y])<(red[i][j]+blue[i][j]+green[i][j])){
                    x = i;
                    y = j;
                }
            }
        }
        int[] point = new int[2];
        point[0] = x;
        point[1] = y;
        return (point);
    }




    // *********************************************************
    //PLEASE END YOUR METHOD HERE


    public static void main( String [] args ) {

        Scanner in = new Scanner( System.in );

        int height, width;

        //Get picture height & width
        height = in.nextInt();
        width = in.nextInt();

        //Set up image pixel arrays
        int[][] red   = new int[height][width];
        int[][] green = new int[height][width];
        int[][] blue  = new int[height][width];

        //Read in red values
        for (int i=0; i<height; i++) {
            for (int j=0; j<width; j++) {
                red[i][j] = in.nextInt();
            }
        }

        //Read in blue values
        for (int i=0; i<height; i++) {
            for (int j=0; j<width; j++) {
                green[i][j] = in.nextInt();
            }
        }

        //Read in green values
        for (int i=0; i<height; i++) {
            for (int j=0; j<width; j++) {
                blue[i][j] = in.nextInt();
            }
        }

        int[] brightest = brightSpot(red, blue, green);

        System.out.println("The brightest spot in the image is at position ("+brightest[0]+","+brightest[1]+")");

        in.close();
        System.out.print("END OF OUTPUT");
    }


}

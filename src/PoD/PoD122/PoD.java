package PoD.PoD122;

/**
 * CSCI 1110
 * @author ASiegel
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PoD
{
    //PLEASE START WORK HERE
    //===============================================

    /**
     * @method GetName
     *
     * @param Integer : PLU code
     * @param Map<Integer, String> : HashMap of PLU to product name
     * @return String : product name
     */
    public static String GetName(Integer PLU, Map<Integer,String> PLUName){
        return PLUName.get(PLU);
    }



    /**
     * @method GetPrice
     *
     * @param Integer : PLU code
     * @param Map<Integer, Double> : HashMap of PLU to product price per kilogram
     * @return Double : product price per kilogram
     */

    public static Double GetPrice(Integer PLU, Map<Integer,Double> PLUPrice){
        return PLUPrice.get(PLU);
    }


    //===============================================
    //PLEASE END WORK HERE



    public static void main( String [] args ) {

        Scanner in = new Scanner( System.in );

        Map<Integer, String> itemNames = new HashMap<Integer, String>();
        Map<Integer, Double> itemPrices = new HashMap<Integer, Double>();

        //Number of PLUs to expect
        int numberPLUs = Integer.valueOf(in.nextLine());

        //Populate the hashmaps
        for (int i=0; i<numberPLUs; i++)
        {
            String line = in.nextLine();
            String[] groceryItem = line.split(",");
            int plu = Integer.valueOf(groceryItem[0]);
            String nameByPLU = groceryItem[1];
            Double priceByPLU = Double.valueOf(groceryItem[2]);

            itemNames.put(plu, nameByPLU);
            itemPrices.put(plu, priceByPLU);
        }


        //Scan new produce items and output details
        while (in.hasNextInt())
        {
            int pluCode = in.nextInt();
            System.out.println("PLU# " + pluCode + ": "
                    + GetName(pluCode,itemNames)
                    + " ($" + GetPrice(pluCode,itemPrices)+")");
        }

        in.close();
        System.out.print("END OF OUTPUT");
    }


}

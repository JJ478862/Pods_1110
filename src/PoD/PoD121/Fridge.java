package PoD.PoD121;

/**
 * CSCI 1110
 * @author ASiegel
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Fridge
{
    //attributes
    protected Stack<String> topShelf = new Stack<String>();
    protected Stack<String> middleShelf = new Stack<String>();
    protected Stack<String> bottomShelf = new Stack<String>();

    //constructor
    public Fridge(){}

    //PLEASE START WORK HERE
    //===============================================

    /**
     * @method addGroceries(String[] groceries, Stack<String> shelf)
     *
     * @param groceries String[]) : groceries to add to shelf
     * @param shelf (Stack<String>) : shelf to add the groceries to
     * @returns void
     *
     * Add provided groceries to front of the specified shelf
     */
    public void addGroceries(String[] groceries,Stack<String> shelf){
        for (String grocery : groceries) {
            shelf.push(grocery);
        }
    }




    /**
     * @method getIngredient(String ingredient)
     *
     * @param ingredient (String) : ingredient to obtain
     * @param shelf (Stack<String>) : shelf that the ingredient is (definitely) on.
     * @returns void
     *
     * You need a new ingredient, but it is (possibly) not at the front of the shelf.
     * Take out whatever ingredients are necessary to remove what you need and then
     * return the removed items back in the reverse order that you took them out.
     */

    public void getIngredient(String ingredient,Stack<String> shelf){
        List<String> staff = new ArrayList<>();
        for (int j = 0; j <= shelf.size()+1; j++) {
            String index = shelf.pop();
            if (index.equals(ingredient)){
                break;
            }else {
                staff.add(index);
            }
        }
        for (int i = staff.size()-1; i >= 0; i--) {
            shelf.push(staff.get(i));
        }
    }


    //===============================================
    //PLEASE END WORK HERE

    public String toString()
    {

        String fridgeContents = "--- FRIDGE CONTENTS ---\n"
                + "Top Shelf:" + topShelf + "\n"
                + "Middle Shelf:" + middleShelf + "\n"
                + "Bottom Shelf:" + bottomShelf + "\n";
        return fridgeContents;
    }
}

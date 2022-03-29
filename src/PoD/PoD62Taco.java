package PoD;

/*
 * CSCI 1110
 * @author Brandon Poole
 *
 */
public class PoD62Taco
{
    //attributes
    private boolean shell;
    private boolean togo;
    private String ingredients;

    //constructor
    public PoD62Taco()
    {
        shell = true;
        ingredients = "none";
        togo = true;
    }

    //Getters
    public boolean getShell(){return shell;}
    public boolean getTogo(){return togo;}
    public String getIngredients(){return ingredients;}

    //Setters
    public void setShell(boolean shell){this.shell = shell;}
    public void setTogo(boolean togo){this.togo = togo;}
    public void setIngredients(String ingredients){this.ingredients = ingredients;}


    public String toString()
    {
        String order = "";
        if(shell)
            order += "Shell: hard\n";
        else
            order += "Shell: soft\n";

        if(togo)
            order+= "Order: togo\n";
        else
            order+= "Order: not togo\n";

        order += "Ingredients: " + ingredients;

        return order;
    }
}
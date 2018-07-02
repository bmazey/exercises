package structures;

import java.util.ArrayList;
import java.util.List;


public class GroceryList {
    public static void main (String[] args) {

    }

    public List<String> createGroceryList() {

        ArrayList<String> GroceryList = new ArrayList<String>();

        GroceryList.add(0, "milk");
        GroceryList.add(1, "eggs");
        GroceryList.add(2,"seltzer");
        GroceryList.add(3, "cheese");
        GroceryList.add(4, "seltzer");



        //TODO - implement this method!

        return GroceryList;
    }
}

package structures;

import java.util.ArrayList;
import java.util.List;

public class GroceryList {
    public static void main (String[] args) {

    }

    public List<String> createGroceryList() {

       List<String> groceryList = new ArrayList<String>();

        groceryList.add(0, "milk");
        groceryList.add(1, "eggs");
        groceryList.add(2, "seltzer");
        groceryList.add(3, "cheese");
        groceryList.add(4, "seltzer");

        //TODO - implement this method!

        return groceryList;
    }
}

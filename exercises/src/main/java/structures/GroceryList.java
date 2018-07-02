package structures;

import java.util.ArrayList;
import java.util.List;

public class GroceryList {
    public static void main (String[] args) {

    }

    public List<String> createGroceryList() {

        //Adding strings into list
        ArrayList <String> GroceryList = new ArrayList();

        GroceryList.add("milk");
        GroceryList.add("eggs");
        GroceryList.add("seltzer");
        GroceryList.add("cheese");
        GroceryList.add("seltzer");

        return GroceryList;
    }
}

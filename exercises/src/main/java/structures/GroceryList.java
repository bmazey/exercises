package structures;

import java.util.ArrayList;
import java.util.List;

public class GroceryList {
    public static void main (String[] args) {

    }

    public List<String> createGroceryList() {
        ArrayList<String> grocerylist = new ArrayList<String>();
grocerylist.add("milk");
grocerylist.add("eggs");
grocerylist.add("seltzer");
grocerylist.add("cheese");
grocerylist.add(grocerylist.get(2));



        //TODO - implement this method!

        return grocerylist;
    }
}

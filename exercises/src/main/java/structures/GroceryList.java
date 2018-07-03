package structures;

import java.util.ArrayList;
import java.util.List;

public class GroceryList {
    public static void main (String[] args) {

    }

    public List<String> createGroceryList() {

        //TODO - implement this method!
    List<String> grocerylist = new ArrayList<String>();
    grocerylist.add("milk");
    grocerylist.add("eggs");
    grocerylist.add("seltzer");
    grocerylist.add("cheese");
    grocerylist.add("seltzer");

        return grocerylist;


    }
}


//can't create an new list <String>() so create an ArrayList<String> ()
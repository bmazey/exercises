package structures;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroceryList {
    public static void main (String[] args) {

    }

    public List<String> createGroceryList() {
        ArrayList<String> myGroceryList = new ArrayList<>();

        myGroceryList.add("milk");
        myGroceryList.add("eggs");
        myGroceryList.add("seltzer");
        myGroceryList.add("cheese");
        myGroceryList.add("seltzer");

        System.out.println(myGroceryList);


        return myGroceryList;
    }
}

package andriinozdrin.com;

import java.util.ArrayList;
import java.util.List;

public class GroceryList implements ProductMethods {

    private final List<String> myItems = new ArrayList<>();


    public List<String> getMyItems() {
        return myItems;
    }

    @Override
    public boolean addNewItem(String newItemIn) {
            if (myItems.contains(newItemIn)) {
                System.out.println("Sorry this item " + newItemIn.toUpperCase() + " is already in your list!");
            } else {
                myItems.add(newItemIn);
                System.out.println("Your item " + newItemIn.toUpperCase() + " was added to your grocery list.");
            }
            return true;
        }

    @Override
    public boolean removeItemFromList(String position) {
            if (myItems.contains(position)){
                myItems.remove(position);
                System.out.println("Your object " + position.toUpperCase() + " was successfully removed.");
                return true;
            }else
                System.out.println("Sorry we can`t fount your object " + position.toUpperCase() + " please check your");
         return false;
        }

    @Override
    public void printYourListItem() {
        System.out.println("You have " + myItems.size() + " items in your list.");
        for (int i = 0; i < myItems.size(); i++) {
            System.out.println((i + 1) + ". " + myItems.get(i));
        }
    }
}

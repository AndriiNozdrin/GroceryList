package andriinozdrin.com;


import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
        boolean spin = true;

        System.out.println("For start use application press 1:");
        while (spin){
            int option = scanner.nextInt();
            switch (option) {
                case 1 -> System.out.print("""
                        Menu command to use:\s
                        1. Open command list.\s
                        2. Add new item to your grocery list.\s
                        3. Remove old item from your list.\s
                        4. Check full grocery list.\s
                        5. Close application.
                        """);
                case 2 -> {
                    System.out.println("Please write below item which you want add to your list:");
                    boolean test = true;
                    while (test) {
                        groceryList.addNewItem(scanner.next());
                        System.out.println("Write another item. For exit and open list command press: 1 ");
                        if (scanner.hasNextInt()){
                            test = false;
                        }
                    }
                }
                case 3 -> {
                    System.out.println("Wright item to remove from list:");
                    groceryList.removeItemFromList(scanner.next());
                    System.out.println("Press 1. to open command list.");
                }
                case 4 -> {
                    groceryList.printYourListItem();
                    if (groceryList.getMyItems().size() == 0) {
                        System.out.println("Oh it`s good time to buy some food.");

                    }
                }
                case 5 -> spin = false;
            }

        }

    }
}

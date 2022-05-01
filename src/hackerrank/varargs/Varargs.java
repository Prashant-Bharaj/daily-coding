package hackerrank.varargs;

public class Varargs {

    // variable arguments
    private static void printShoppingList(String... items){
        System.out.println("Shopping List");
        for (String item : items)
            System.out.println(item);
    }

    public static void main(String[] args){
        String item_one = "Apple";
        String item_two = "Banana";
        String item_three = "Orange";

        printShoppingList(item_one, item_two);

        printShoppingList(item_one, item_two, item_three);
    }
}

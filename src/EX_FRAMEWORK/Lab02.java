package EX_FRAMEWORK;

import java.util.List;

public class Lab02 {
    public static void main(String[] args) {
        // Shopping List
        // Milk, Bread, Butter, Cheese.
        // 4 elements
        // Collection Framework -> How you can store the elements
        // 1. List (Interface) ->ArrayList, LinkedList, Vector, Stack


        List shppoing_list = List.of("Milk", "Bread", "Butter", "Cheese");
        System.out.println(shppoing_list);
        System.out.println(shppoing_list.size());

        List fruits = List.of("orange", "apple", "banana", "apple", "watermelon");
        System.out.println(fruits);
        System.out.println(fruits.size());
        System.out.println(fruits.get(0));
        System.out.println(fruits.indexOf("banana"));
        System.out.println(fruits.isEmpty());
        System.out.println(fruits);

}}

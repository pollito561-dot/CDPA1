
// ConceptDemo.java
// Maylyne Puerto
// October 31, 2026
// Demonstrates the Adapter Pattern and Java Collections.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ConceptDemo {

    public static void main(String[] args) {

        // Create an Integer array.
        Integer[] numbers = {5, 2, 9, 1, 4, 7};

        // Adapt the array into a List.
        ArrayAdapter adapter = new ArrayAdapter(numbers);
        List<Integer> numberList = adapter.toList();

        System.out.println("Before sorting: " + numberList);

        // Sort the list.
        Collections.sort(numberList);
        System.out.println("After sorting: " + numberList);

        // Remove the value 4.
        numberList.remove(Integer.valueOf(4));
        System.out.println("After removing 4: " + numberList);

        // Print the list using an unbounded wildcard.
        printList(numberList);
    }

    /**
     * Prints a list using an unbounded wildcard.
     * @param list the list to display
     */
    public static void printList(List<?> list) {
        System.out.println(
                "Printing list using unbounded wildcard: " + list
        );
    }
}

// Object Adapter class that converts an Integer array into a List.
class ArrayAdapter {

    private Integer[] array;

    public ArrayAdapter(Integer[] array) {
        this.array = array;
    }

    /**
     * Converts the array into a mutable ArrayList.
     * @return a new List<Integer>
     */
    public List<Integer> toList() {
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list, array);
        return list;
    }
}

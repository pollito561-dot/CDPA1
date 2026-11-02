# CDPA1
Module 9 programming assignment 1

/*
 * ConceptDemo.java
 * Maylyne Puerto
 * October 31, 2026
 * Demonstrates the Adapter pattern and Java Collections features.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Demonstrates Java collections, the Adapter pattern, sorting,
 * removing an element, the Diamond Operator, and unbounded wildcards.
 */
public class ConceptDemo {

    /**
     * Runs the program and demonstrates each required operation.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {

        // Create an integer array containing several values.
        Integer[] numbers = {5, 2, 9, 1, 4, 7};

        // Create an adapter to convert the array into a mutable list.
        ArrayAdapter adapter = new ArrayAdapter(numbers);

        // Obtain a new ArrayList from the adapter.
        List<Integer> numberList = adapter.toList();

        // Display the list before sorting.
        System.out.println("Before sorting: " + numberList);

        // Sort the list in ascending order.
        Collections.sort(numberList);

        // Display the sorted list.
        System.out.println("After sorting: " + numberList);

        // Remove the value 4 rather than the element at index 4.
        numberList.remove(Integer.valueOf(4));

        // Display the list after removing the value 4.
        System.out.println("After removing 4: " + numberList);

        // Demonstrate passing a List<Integer> to a wildcard method.
        System.out.print(
                "Printing list using unbounded wildcard: ");
        printList(numberList);
    }

    /**
     * Prints the contents of a list using an unbounded wildcard.
     *
     * The wildcard allows this method to accept lists containing
     * elements of any reference type.
     *
     * @param list the list whose contents will be printed
     */
    public static void printList(List<?> list) {
        System.out.println(list);
    }
}

/**
 * Adapts an Integer array to the List<Integer> interface.
 *
 * This is an object adapter because it contains an Integer array
 * and converts that array into a separate, mutable list.
 */
class ArrayAdapter {

    // The array that this adapter wraps.
    private Integer[] array;

    /**
     * Constructs an adapter around the supplied integer array.
     *
     * @param array the integer array to adapt
     */
    public ArrayAdapter(Integer[] array) {
        this.array = array;
    }

    /**
     * Creates and returns a new mutable list containing the array
     * elements.
     *
     * The Diamond Operator lets Java infer the generic type.
     *
     * @return a new ArrayList containing the array elements
     */
    public List<Integer> toList() {

        // Create a new, mutable ArrayList using the Diamond Operator.
        List<Integer> list = new ArrayList<>();

        // Copy all array elements into the list.
        Collections.addAll(list, array);

        // Return the newly created list.
        return list;
    }
}
<img width="642" height="176" alt="Screenshot 2026-11-01 at 8 41 39 PM" src="https://github.com/user-attachments/assets/f117b7b9-b4ec-472f-a8f1-3ee361a121c6" />

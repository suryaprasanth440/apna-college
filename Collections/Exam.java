package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import java.util.List;

public class Exam {

    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5); // Change this list to test
        boolean isSorted = isSorted(list, 0);
        System.out.println("Is the list sorted? " + isSorted);
    }

    // Recursive method to check if the list is sorted
    public static boolean isSorted(List<Integer> list, int index) {
        // Base case: If we reach the end of the list, it is sorted
        if (index >= list.size() - 1) {
            return true;
        }
        // Check current element with the next one
        if (list.get(index) > list.get(index + 1)) {
            return false; // If current element is greater, list is not sorted
        }
        // Recursive call to check the rest of the list
        return isSorted(list, index + 1);
    }
}


//A. Create an array with the values (1, 2, 3, 4, 5, 6, 7) and shuffle it.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShuffleArray {
    public static void main(String[] args) {
        // Create an ArrayList with the values (1, 2, 3, 4, 5, 6, 7)
        List<Integer> myList = new ArrayList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(5);
        myList.add(6);
        myList.add(7);

        // Shuffle the ArrayList
        Collections.shuffle(myList);

        // Convert the shuffled ArrayList back to an array
        Integer[] shuffledArray = myList.toArray(new Integer[0]);

        // Print the shuffled array
        for (int value : shuffledArray) {
            System.out.print(value + " ");
        }
    }
}

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        // Create a new ArrayList of integers
        List<Integer> myList = new ArrayList<>();

        // Adding elements to the list
        myList.add(10);
        myList.add(20);
        myList.add(30);
        myList.add(40);

        // Printing the elements in the list
        System.out.println("Elements in the list:");
        for (Integer num : myList) {
            System.out.println(num);
        }
    }
}

import java.util.*;

public class MainCollectionOne {

    public static void main(String[] args) {

        //Creating a list of integers and converting them into a collection
        //Find and print the number's position using the binarySearch
        List<Integer> myArrayList = Arrays.asList(0,1,2,3,4,5,10,20,50,100);
        System.out.println(Collections.binarySearch(myArrayList, 50));

        System.out.println("Full list:");

        /*Iterator method will cycle through each list in the while-loop
        * and print each list
        */
        Iterator iterator = myArrayList.iterator();
        while(iterator.hasNext()) {
            System.out.print(iterator.next() + ", ");
        }
    }
}

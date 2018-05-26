import java.util.*;

public class MainCollectionThree {

    public static void main(String[] args) {

        //Creating a queue class of integers
        /*For-loop method to print each number then added to the queue
        * to apply each method
        */
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 1; i<=10; i++) {
            queue.add(i);
        }
        //Removes the 1st queue
        System.out.println("Element in the queue: "+queue);
        int removed = queue.remove();
        System.out.println(removed + " was removed");

        //Removes the 2nd queue
        int poll = queue.poll();
        System.out.println(poll + " removes the 2nd queue");

        //Displays the 1st queue
        int top  = queue.peek();
        System.out.println("top element is: "+top);

        //Adding the numbers to the back of the line
        for(int j = 1; j < 3; j++) {
            queue.add(j);
        }
//        queue.offer(1);
//        queue.offer(2);


        System.out.println(queue);


    }
}


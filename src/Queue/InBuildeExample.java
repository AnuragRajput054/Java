package Queue;

import java.util.*;

public class InBuildeExample {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
       // queue.clear();     // Clear remove the entire data from the queue while remove() methode only remove the first element of the stack
        System.out.println(queue.peek());
        System.out.println(queue.remove());
        System.out.println(queue.peek());


    }
}

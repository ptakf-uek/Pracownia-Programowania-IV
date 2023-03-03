// // // // // // // // // // // // // // // // // // // // // // // // // // // //
//
// FIFO queue implementation using the LinkedList class from the java.util package.
//
// // // // // // // // // // // // // // // // // // // // // // // // // // // //
import java.util.LinkedList;

public class LinkedListQueue {
    // Data structure representing a FIFO queue.
    private LinkedList<Object> queue = new LinkedList<>();

    // Checks whether the list has any elements and returns the result.
    public boolean isEmpty() {
        return queue.size() == 0;
    }

    // Appends the element parameter to the end of the list.
    public void enqueue(Object element) {
        queue.add(queue.size(), element);
    }

    // Returns and removes the first element in the list.
    public Object dequeue() {
        if (isEmpty()) {
            System.out.println("Queue underflow!");
            return null;
        } else {
            return queue.remove();
        }
    }

    // Returns the first element in the list without removing it.
    public Object peek() {
        if (isEmpty()) {
            System.out.println("Queue underflow!");
            return null;
        } else {
            return queue.get(0);
        }
    }
}

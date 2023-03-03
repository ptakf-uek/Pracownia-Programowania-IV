// // // // // // // // // // // // // //
//
// FIFO queue implementation using nodes.
//
// // // // // // // // // // // // // //
public class NodeQueue {
    // Node class representing a single node in the queue.
    private class Node {
        private Object nodeValue;
        private Node nextNode;

        public Node(Object nodeValue) {
            this.nodeValue = nodeValue;
        }
    }

    private Node firstNode, lastNode;

    // Checks whether the queue has any nodes and returns the result.
    public boolean isEmpty() {
        return firstNode == null;
    }

    // Appends the new value to the end of the queue.
    public void enqueue(Object value) {
        Node newNode = new Node(value);

        if (isEmpty()) {
            lastNode = newNode;
            firstNode = lastNode;
        } else {
            lastNode.nextNode = newNode;
            lastNode = newNode;
        }
    }

    // Returns and removes the first node in the queue.
    public Object dequeue() {
        if (isEmpty()) {
            System.out.println("Queue underflow!");
            return null;
        } else {
            Node oldNode = firstNode;
            firstNode = firstNode.nextNode;

            return oldNode.nodeValue;
        }
    }

    // Returns the first node in the queue without removing it.
    public Object peek() {
        if (isEmpty()) {
            System.out.println("Queue underflow!");
            return null;
        } else {
            return firstNode.nodeValue;
        }
    }
}

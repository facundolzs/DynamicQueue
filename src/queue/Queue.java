package queue;

public class Queue {

    private Node front, rear;
    private int size;

    private class Node {

        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    /**
     * Check if the Queue is empty or not
     *
     * @return true if no items added
     */
    public boolean isEmpty() {
        return front == null;
    }

    /**
     * Returns current items number on the Queue (P.S. I was researching and it's not a primitive operation but now it's too late)
     *
     * @return number of items
     */
    public int getSize() {
        return size;
    }

    /**
     * Returns item at the front of the Queue (without removing it)
     *
     * @return front item
     */
    public int peekFront() {
        return front.data;
    }

    /**
     * Returns item at the rear of the Queue (without removing it)
     *
     * @return rear item
     */
    public int peekRear() {
        return rear.data;
    }

    /**
     * Adds a new item to the rear of the Queue
     *
     * @param value (new value to add)
     * @return added item
     */
    public int enQueue(int value) {

        Node newNode = new Node(value);

        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }

        size++;
        return value;
    }

    /**
     * Removes the front item of the Queue
     *
     * @return removed item
     */
    public int deQueue() {

        int removed = front.data;

        front = front.next;

        if (front == null) {
            rear = null;
        }

        size--;
        return removed;
    }

}

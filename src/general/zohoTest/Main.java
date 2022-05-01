package general.zohoTest;

// "static void main" must be defined in a public class.

class LinkedList{
    int data;
    LinkedList next;
    LinkedList(int data) {
        this.data = data;
        next = null;
    }
}

class MyQueue{
    // a pointer to indicate the start position
    private LinkedList front, rear;
    public MyQueue() {
        front = null;
        rear = null;
    }
    /** Insert an element into the queue. Return true if the operation is successful. */
    public void enQueue(int x) {
        // if first insertion


        if(front == null){
            front = rear = new LinkedList(x);
        } else {
            rear.next = new LinkedList(x);
            rear = rear.next;
        }
    };
    /** Delete an element from the queue. Return true if the operation is successful. */
    public boolean deQueue() {
        if (isEmpty()) {
            return false;
        }
        front = front.next;
        return true;
    }
    /** Get the front item from the queue. */
    public int Front() throws Exception {
        if(front != null){
            return front.data;
        }
        throw new Exception("Queue is Empty");
    }
    /** Checks whether the queue is empty or not. */
    public boolean isEmpty() {
        return front == null;
    }
};

public class Main {
    public static void main(String[] args) throws Exception {
        MyQueue q = new MyQueue();
        q.enQueue(5);
        q.enQueue(3);
        if (!q.isEmpty()) {
            System.out.println(q.Front());
        }
        q.deQueue();
        if (!q.isEmpty()) {
            System.out.println(q.Front());
        }
        q.deQueue();
        if (!q.isEmpty()) {
            System.out.println(q.Front());
        }
    }
}
package Queue;

public class CircularQueue {

    public static void main(String[] args) {
        CircularQueue queue = new CircularQueue(5);

        queue.insert(10);
        queue.insert(20);
        queue.insert(30);
        queue.insert(40);
        queue.insert(50);
        queue.display();
        queue.remove();
        queue.insert(69);
        queue.display();
    }
 //==============================
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    protected int end = 0;
    protected int front = 0;
    private int size = 0;

    public CircularQueue(){
        this(DEFAULT_SIZE);
    }

    public CircularQueue(int size) {
        this.data = new int[size];
    }
//======================================
    public boolean isFull() {
        return size == data.length; // ptr is at last index
    }

    public boolean isEmpty() {
        return size == 0;
    }
//==========================================
    public boolean insert(int item) {
        if (isFull()) {
            return false;
        }
        data[end++] = item;
        end = end % data.length;
        size++;
        return true;
    }

    public int remove()  {
        if (isEmpty()) {
             System.out.println("Empty Queue");
             return -1;
        }

        int removed = data[front++];
        front = front % data.length;
        size--;
        return removed;
    }

    public int front(){
        if (isEmpty()) {
              System.out.println("Empty Queue");
              return -1;
         }
        return data[front];
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Empty");
            return;
        }
        int i = front;
        do {
            System.out.print(data[i] + " -> ");
            i++;
            i %= data.length;
        } while (i != end);
        System.out.println("END");
    }

}
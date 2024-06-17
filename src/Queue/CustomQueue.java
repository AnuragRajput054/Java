package Queue;

public class CustomQueue {
    public static void main(String[] args) {

        CustomQueue queue = new CustomQueue(5);
        queue.insertElement(10);
        queue.insertElement(20);
        queue.insertElement(30);
        queue.insertElement(40);
        queue.insertElement(50);
        queue.display();
        queue.removeElement();
        queue.display();
 }


    private int[] data ;
    private static final int default_size = 10;
    int end = 0 ;
    public CustomQueue(){
        this(default_size);
    }
    public CustomQueue(int size){
        data = new int[size];
    }
//========================================
    public boolean isEmpty(){
        return (end==0) ?  true : false;
    }
    public boolean isFull(){
        return (end == data.length) ? true : false;
    }
//=======================================
    public boolean insertElement(int val){
        if(isFull()){
            System.out.println("Queue is full , We can't add a new element into it");
            return true;
        }
        data[end++] = val;
        return true;
    }
 //====================================
    public int removeElement(){
        if(isEmpty()){
            System.out.println("Queue is Empty , First add some data into it then run this funtion aggain");
            return -1;
        }
        int remove = data[0];
        for(int i = 1 ; i < end ; i++){
            data[i-1]= data[i];
        }
        end--;
        return remove;
    }
//=====================================

    public void display(){
        for (int i = 0; i < end; i++) {
            System.out.print(data[i]+" ");
        }
        System.out.println("End");
    }
    
}

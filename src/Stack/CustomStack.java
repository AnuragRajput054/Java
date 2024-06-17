package Stack;

public class CustomStack {
    public int[] data ;
    private static final int Default_Size =  10;
    int ptr = -1;
    public static void main(String[] args) {
        CustomStack stack = new CustomStack(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.display();
        System.out.println();
        System.out.println("Removed element from the stack is :"+stack.pop());
        stack.display();

    }





    public CustomStack(){
        this(Default_Size);
    }
    public CustomStack(int size){
        this.data = new int[size];
    }

    public boolean push(int val){

        if(isFull()){
            return false;
        }
            ptr++;
            data[ptr] = val;
            return true;
        
    }
    public int pop(){
        if(isEmpty()){
              System.out.println("stack is empty , We can't delete element from it");
              return -1;
        }
        int removed = data[ptr];
        ptr--;
        return removed;
    }
    public void display(){
        if (isEmpty()) {
            System.out.println("Stack is Empty , Please first add some data into it");
        }
        for (int i = ptr; i >= 0; i--) {
            System.out.print(data[i]+"  "); 
        }
    }
    public boolean isFull(){
         return (ptr==data.length-1 ? true : false);
    }
    public boolean isEmpty(){
        return (ptr==-1? true : false);
    }
}

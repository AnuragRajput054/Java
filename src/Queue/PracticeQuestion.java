package Queue;

public class PracticeQuestion {

    public static void main(String[] args) {

        MyQueue s1 = new MyQueue(5);
        s1.push(1);
        s1.push(2);
        s1.push(3);
        s1.push(4);
        s1.push(5);
       // firstStack.push(1);


       s1.display();

        MyQueue s2 = new MyQueue(5);
        copystack(s1,s2);
        System.out.println();
        s2.display();
       
    }
    public static void copystack(MyQueue s1 ,MyQueue s2){
        while(!s1.empty()){
            s2.push(s1.pop());
        }   
    }
    
}

class MyQueue {
    int[] data ; 
    static int default_size = 10;
    int size = 0 ;
    int ptr1 = -1;


    public MyQueue() {
        this(default_size);
    }
    public MyQueue(int size){
        data = new int[size];
    }
    
    public void push(int x) {
        if(ptr1 == data.length){
            System.out.println("Stack is full");
            return ;

        }
        data[++ptr1] = x ;
    }
    
    public int pop() {

        if(empty()){
            System.out.println("Stack is empty ");
            return -1;
        }
       return data[ptr1--];
        
    }

    public boolean empty() {

        if(ptr1==-1){
            return true;
        }else{
            return false;
        }
        
    }

    public void display(){
        if (empty()) {
            System.out.println("Stack is Empty , Please first add some data into it");
        }
        for (int i = ptr1; i >= 0; i--) {
            System.out.print(data[i]+"  "); 
        }
    }
}


//   Leetcode - 232 Implement queue Using stack
// class MyQueue {
//     Stack<Integer>s1;
//     Stack<Integer>s2;
//    public MyQueue() {
//        s1=new Stack<>();
//        s2=new Stack<>();
//    }
//    public void push(int x) {
//        s1.push(x);
//    }

//    public int pop() {
//        while(s1.size()>1)
//        {
//            s2.push(s1.pop());
//        }
//        int x=s1.pop();
//        while(!s2.isEmpty())
//        {
//            s1.push(s2.pop());
//        }
//        return x;
//    }
   
   
//    public int peek() {
//        while(s1.size()>1)
//        {
//            s2.push(s1.pop());
//        }
//        int x=s1.peek();
//        while(!s2.isEmpty())
//        {
//            s1.push(s2.pop());
//        }
//        return x;
//    }
   
//    public boolean empty() {
//        if(s1.isEmpty())
//            return true;
//        else
//            return false;
//    }
// }


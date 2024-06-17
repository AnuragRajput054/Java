package Stack;

import java.util.Arrays;

public class DynamicStack extends CustomStack {
    
    public DynamicStack(){
        super();
    }
    public DynamicStack(int size){
        super(size);
    }

    public static void main(String[] args) {
        DynamicStack stack = new DynamicStack(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.display();
        System.out.println();
       // System.out.println("Removed element from the stack is :"+stack.pop());
        stack.display();
        stack.push(40);
        stack.push(50);
        System.out.println();
        stack.display();
    }

    @Override
    public boolean push(int val){
        if(this.isFull()){
            int[] temp = new int[data.length * 2];
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }
            data = temp;
        }
        return super.push(val);
    }
   
}

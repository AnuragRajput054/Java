package LindedLists;

import java.util.ArrayList;

public class DoublyLinkedList {
    public static void main(String[] args) {
        
        LinkListUse2 list = new LinkListUse2();
        list.addAtFirst(1);
        list.addAtFirst(2);
        list.addAtFirst(1);
        list.addAtFirst(7);
        list.display();

    }
}

 class LinkListUse2{
  

      private Node head;
      private Node tail;
      int size;
      LinkListUse2()
       {
        size = 0 ;
       }


       public void addAtFirst(int value){

             Node node = new Node(value);
            if(head != null){
                head.previous = node;

            }
             node.previous = null;
             node.next = head;

             head = node;
             if(tail==null){
                tail = head;
             }
             size++;
            
             

       }
   
       public void display(){

       ArrayList list2 = new ArrayList<>();
       ArrayList list3 = new ArrayList<>();

         Node temp = head ;
         Node last = null;
         while(temp != null){
            System.out.print(temp.value+" -> ");
            list2.add(temp.value);
            last = temp;
            temp = temp.next;
            
         }
         System.out.println("END");

         System.out.println("List in reverse order");
         while(last != null){
            System.out.print(last.value+" <-");
            list3.add(last.value);
            last = last.previous;
         }
         System.out.println("END");
         System.out.println(list2 + " "+list3);

         if(list2.equals(list3)){
            System.out.println("Pallindrom List");
         }else{
            System.out.println("Not a pallindrom List");
         }


       }

    class Node{
        int value ;
        Node next;
        Node previous;

        Node(int value){
            this.value = value;
        }
        Node(int value , Node next , Node previous){
            this.value = value;
            this.next = next;
            this.previous =previous;
        }
    }
} 

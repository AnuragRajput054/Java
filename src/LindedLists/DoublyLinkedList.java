package LindedLists;

import java.util.ArrayList;

public class DoublyLinkedList {
    public static void main(String[] args) {
        
        LinkListUse2 list = new LinkListUse2();
        list.addAtFirst(1);
        list.addLast(2);
        list.addLast(3);
        list.addAt(4, 3);
        list.addLast(11);
        list.deleteFirst();
        list.deleteLast();
        list.display();
        System.out.println(list.size);

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


   public void addAt(int value , int index){
        if(index==0){
            addAtFirst(value);
        }else if(index==size){
            addLast(value);
        }else{
            Node temp = head;
            for (int i = 1; i < index; i++) {
                 temp = temp.next;
            }
            Node node = new Node(value,temp.next,temp);
            temp.next = node;
            size++;
        }

       
         

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

       public void addLast(int value){
        Node node = new Node(value);
        if(size==0){
            addAtFirst(value);
        }
        node.previous = tail;
        tail.next = node;
        node.next = null;
        tail = node;
        size++;
        
       }
   
       public void display(){
         Node temp = head ;
         Node last = null;
         while(temp != null){
            System.out.print(temp.value+" -> ");
            last = temp;
            temp = temp.next;
         }
         System.out.println("END");

         System.out.println("List in reverse order");
         while(last != null){
            System.out.print(last.value+" <- ");
            last = last.previous;
         }
         System.out.println("START");
       }

     public void deleteFirst(){
        head = head.next;
        head.previous = null;
        size--;
     }


     public void deleteLast(){
          
        tail = tail.previous;
        tail.next = null;
        size--;
         
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
            this.previous = previous;
        }
    }

  


     // Methode to check wheather a list is pallindrom or not
    public void pallindromList(){

        ArrayList list2 = new ArrayList<>();  
        ArrayList list3 = new ArrayList<>();
 
          Node temp = head ;
          Node last = null;

          while(temp != null){
             list2.add(temp.value);
             last = temp;
             temp = temp.next;  
          } 
          while(last != null){
             list3.add(last.value);
             last = last.previous;
          }
         
          System.out.println(list2 + " "+list3);
          if(list2.equals(list3)){
             System.out.println("Pallindrom List");
          }else{
             System.out.println("Not a pallindrom List");
          }
 
        }
} 



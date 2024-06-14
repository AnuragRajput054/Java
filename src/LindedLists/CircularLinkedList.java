package LindedLists;

public class CircularLinkedList {
    
       public static void main(String[] args) {
            
              LinkListUse3 list = new LinkListUse3();
              list.addFirst(1);
              list.addFirst(2);
              list.addFirst(3);
              list.addFirst(4);
              list.addFirst(5);
            //  list.deleteFirst();
              list.deleteFromLast(3);
              System.out.println(list.size);
              list.display();
              
       }
}

class LinkListUse3{

    private Node head ;
    private Node tail;
    int size;
    LinkListUse3(){
        this.head = null;
        this.tail = null;
        size = 0;
    }


    public void display(){
         
        Node temp = head;
       if(temp != null){
            do{
                System.out.print(temp.value+" -> ");
                temp = temp.next;
            } while(temp != head);
        }

            System.out.println("END");
       }


   public void deleteFirst(){
       
        if(head == null || tail == null){
            System.out.println("Empty List");
            return;
        }
         tail.next = head.next;
         head = head.next;
         head.previous = tail.next;
         size--;


   }

   public void deleteFromLast(int val){
   
         Node temp = head;
         if(temp==null){
            System.out.println("Empty");
            return;
         }
         if(temp.value==val){
            head = head.next;
            tail.next = head;
         }
         do{
               Node n = temp.next;
               if(n.value==val){
                temp.next = n.next;
                break;
               }
               temp = temp.next;
         }while(temp != head);

         size--;


   }

    public void addFirst(int value){
        Node node = new Node(value);
    
        if(head == null){
            head = node;
            tail = node;
        }
            tail.next = node;
            node.next = head;
            tail = node;
         
       
        size++;

    }

    class Node{
         
        int value ;
        Node next;
        Node previous ;
        Node(int value){
            this.value = value;
        }
        Node(int value , Node next , Node previous){
            this.value = value;
            this.next = next;
            this.previous = previous;
        }
    }

}

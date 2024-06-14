package LindedLists;

public class First {
    public static void main(String[] args) {
        LinkListUse<Integer> list = new LinkListUse<>();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addLast(6);
        list.addAt(100, 3);
        list.insertRec(3, 3);
         list.deleteFromFirst();

     
        list.addFirst(0);
        list.addLast(4);
        list.addFirst(2);
     //   list.deleteFromLast();
       // list.del(2);
         list.display();
        
        System.out.println(list.size);
        LinkListUse<String> list2 = new LinkListUse<>();
        list2.addFirst("Indore");
        list2.addFirst("India");
        list2.addLast("BhawerKua");
        list2.addFirst("Asia");
        list2.display();
    }
    
}


 class LinkListUse<T> {
  

    private Node<T> head;
    private Node<T> tail;
    int size;
    LinkListUse(){
        size = 0 ;
    }
    public class Node<T>{    // Creation of new  Node
       
       T value ;
       Node<T> next ;  
       Node(T value){
        this.value = value;
      }
      Node(T value , Node<T> next){
        this.value = value;
        this.next = next;
      }
     
    }
    public void addFirst(T val){    // Add New Element at the begning
        Node<T> node = new Node<>(val);
        node.next = head;
        head = node;
        if(tail==null){
            tail = head;
        }
        size += 1;
    }

    public void addLast(T val){

        if(tail==null){    // If there is no element in the list then simply add at first position
            addFirst(val);
            return;
        }
        Node<T> node = new Node<>(val);
        tail.next = node;
        tail = node;
        size += 1 ;
    }


    public void addAt(T val , int index){
         
          Node<T> temp = head;
        
          if(index == 0){
            addFirst(val);
            return;
          }
          if(index == size){
            addLast(val);
          }

          for (int i = 1; i < index; i++) {
               temp = temp.next;
          }
          Node<T> node = new Node<>(val,temp.next);
          temp.next = node;
          size++;

         
               
         
    }

    public void deleteFromFirst(){    // Delete the element from the first

        head = head.next;
        size -= 1;
    }
    public void deleteFromLast(){    // Delete the element from the last


        if(size==0){
            System.out.println("Empty List");
            return;
        }
        if (size == 1) {
            head = null;
            tail = null;
        } else{
            Node<T> temp = head;
            while(temp.next!=tail){
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
       //     
        }
        size -= 1 ;

    }



   
    public void del(T value) {
        if (size == 0) {
            System.out.println("List is empty.");
            return;
        }

        if (head.value.equals(value)) {
            head = head.next;
            if (head == null) {
                tail = null;
            }
            size -= 1;
            return;
        }

        Node<T> current = head;
        Node<T> previous = null;

        while (current != null && !current.value.equals(value)) {
            previous = current;
            current = current.next;
        }

        if (current == null) {
            System.out.println("Value not found in the list.");
            return;
        }

        previous.next = current.next;
        if (current.next == null) {
            tail = previous;
        }
        size -= 1;
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value+" -> ");
            temp= temp.next;
        }
        System.out.println("End");
    }


    
}

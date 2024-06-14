package LindedLists;

public class InsertRec {

     public static void main(String[] args) {
        LinkListUse4 listRec = new LinkListUse4();
        listRec.addFirst(1);
      
        listRec.addFirst(5);
        listRec.addFirst(4);
        listRec.addFirst(2);
        listRec.insertRec(3, 2);
        listRec.insertRec(6, 5);
        listRec.display();
       // listRec.middle(listRec.head);
     //  listRec.sortedList(listRec.head);
       listRec.reverse2(listRec.head);
       listRec.display();
    
     }
    
    
}

class LinkListUse4{

    Node head;
    Node tail;
    int size;
  public LinkListUse4(){
        this.size = 0;
    }

    public void addFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;
        if(tail==null){
           tail = head;
        }
        size++;
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value+" -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public void insertRec(int val , int index){
        head = insertRec(val,index,head);
    }

    private Node insertRec(int val , int index , Node node){
        if(index == 0){
            Node temp = new Node(val , node);
            size++;
            return temp;
        }
        node.next = insertRec(val, index-1, node.next);
        return node;
    }

    //  Cycle ditection Problem 
    public boolean hasCycle(Node head) {
        Node fast = head ; 
        Node slow = head ;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast==slow){
                return true;
            }
        }
        return false;
    }

    public void middle(Node head){
    // By using fast and slow pointer approach
          Node slow = head;
          Node fast = head;
          while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
          }
          while(slow != null){
            System.out.print(slow.value+" -> ");
            slow = slow.next;
          }
    } 
   //==================================
   // Reverse a list Using Recursion

     public void reverse(Node node){

        if(node== tail){
            node = tail;
            return;
        }
        reverse(node.next);
        tail.next = node;
        tail = node;
        tail.next = null;
     }

// USing Iteration

  public void reverse2(Node head){
  
        Node previous = null;
        Node current = head;
        while(current != null){
            Node next = current.next;
              current.next = previous;
              previous = current;
              current = next;

        }

  }
  

  // =================================== 
 //  Sort list
//     public ListNode sortList(ListNode head) {

//         if(head==null || head.next==null){
//             return head;
//         }
//         ListNode mid = middleNode(head);
//         ListNode newHead = mid.next;
//         mid.next = null;
//         ListNode left = sortList(head);
//         ListNode right = sortList(newHead);

//         return mergeTwoLists(left , right);

//         }  
    

//      public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
//         ListNode ansHead = new ListNode();
//         ListNode tail = ansHead;

//         while(list1 != null && list2 != null){
//          if(list1.val<list2.val){
//                     tail.next = list1 ;
//                     list1 = list1.next;
//                     tail = tail.next;
//               }else{
//                     tail.next = list2 ;
//                     list2 = list2.next;
//                     tail = tail.next;
//               }
//           }

//               tail.next = (list1 != null)? list1 : list2 ;
//               return ansHead.next;
//   }

//       public ListNode middleNode(ListNode head) {
//           if (head == null || head.next == null)
//             return head;
//          ListNode slow = head;
//           ListNode fast = head;
//           while(  fast.next != null && fast.next.next != null){
//             slow = slow.next;
//             fast = fast.next.next;
//           }

//           return slow;

        
//     }


    class Node {
        int value;
        Node next;
        Node(int val){
            this.value = val;
        }
        Node(int val , Node next){
            this.value = val;
            this.next = next;
        }
    }

}

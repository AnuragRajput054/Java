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
  public Node reverse2(Node head){
  
        Node previous = null;
        Node current = head;
        while(current != null){
            Node next = current.next;
              current.next = previous;
              previous = current;
              current = next;
        }
        return previous;

  }


  // ===================================
                                                                    // Reorder List

                        //   public void reorderList(ListNode head) {
                        //     if (head == null || head.next == null) {
                        //         return;
                        //     }
                        //     ListNode mid = middleNode(head);
                        //     ListNode hs = reverseList(mid);
                        //     ListNode hf = head;
                        //     while (hf != null && hs != null) {
                        //         ListNode temp = hf.next;
                        //         hf.next = hs;
                        //         hf = temp;

                        //         temp = hs.next;
                        //         hs.next = hf;
                        //         hs = temp;
                        //     }
                        //     if (hf != null) {
                        //         hf.next = null;
                        //     }
                        // }

                        //  public ListNode reverseList(ListNode head){
                        //     ListNode previous = null;
                        //     ListNode current = head;
                        //     while(current != null){
                        //         ListNode next = current.next;
                        //           current.next = previous;
                        //           previous = current;
                        //           current = next;
                        //     }
                        //     return previous;
                        // }
                        // public ListNode middleNode(ListNode head) {
                        //      ListNode slow = head;
                        //       ListNode fast = head;
                        //       while(fast != null && fast.next != null){
                        //         slow = slow.next;
                        //         fast = fast.next.next;
                        //       }
                        //       return slow;  
                        // }
                        // }
  

  // =================================== 
 //                                                         Sort list
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

//=========================================
// Reverse a list in between

//     public ListNode reverseBetween(ListNode head, int left, int right) {
    
//       if(left == right){
//         return head;
//       }
//       ListNode previous = null ;
//       ListNode current =   head;
//       for(int i = 0 ; current != null && i < left-1 ; i++){
//             previous = current ;
//             current = current.next;
//       }
//       ListNode last = previous ;
//       ListNode newEnd = current;
//       ListNode  next = current.next;
//       for(int i = 0 ; current != null && i < right-left+1 ; i++){
//             current.next = previous;
//             previous = current ;
//             current = next ;
//             if(next != null){
//                 next = next.next;
//             }
//       }

//       if(last != null){
//         last.next = previous;
//       }else{
//          head = previous;
//       }

//       newEnd.next = current;
//       return head;

//     }

// }


//======================================

//   Pallindrom list 

// public boolean isPalindrome(ListNode head) {
//     ListNode mid = middleNode(head);
//     ListNode headSecond = reverseList(mid);
//     ListNode rereverseHead = headSecond;

//     while (head != null && headSecond != null) {
//         if (head.val != headSecond.val) {
//             break;
//         }
//         head = head.next;
//         headSecond = headSecond.next;
//     }
//     reverseList(rereverseHead);

//     return head == null || headSecond == null;
// }

//     public ListNode reverseList(ListNode head) {
//     if (head == null) {
//         return head;
//     }
//     ListNode prev = null;
//     ListNode present = head;
//     ListNode next = present.next;

//     while (present != null) {
//         present.next = prev;
//         prev = present;
//         present = next;
//         if (next != null) {
//             next = next.next;
//         }
//     }
//     return prev;
// }

// public ListNode middleNode(ListNode head) {
//     ListNode s = head;
//     ListNode f = head;

//     while (f != null && f.next != null) {
//         s = s.next;
//         f = f.next.next;
//     }
//     return s;
// }


// }
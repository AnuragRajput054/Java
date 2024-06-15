package LindedLists;

public class InterviewQ {
    
}

 class ListNode {
        int val;
        ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}


//  https://leetcode.com/problems/reverse-nodes-in-k-group/?source=submission-ac

    public ListNode reverseKGroup(ListNode head, int k) {
     if (k <= 1 || head == null) {
         return head;
     }

     ListNode current = head;
     ListNode prev = null;

     int length = getLength(head);
     int count = length / k;
     while (count > 0) {
         ListNode last = prev;
         ListNode newEnd = current;

         ListNode next = current.next;
         for (int i = 0; current != null && i < k; i++) {
             current.next = prev;
             prev = current;
             current = next;
             if (next != null) {
                 next = next.next;
             }
         }

         if (last != null) {
             last.next = prev;
         } else {
             head = prev;
         }

         newEnd.next = current;

         prev = newEnd;
         count--;
     }
     return head;
 }
//====================================
 public int getLength(ListNode head) {
     ListNode node = head;
     int length = 0;
     while (node != null) {
         length++;
         node = node.next;
     }
     return length;
 }




 // ===================================
  //Reorder List

                          public void reorderList(ListNode head) {
                            if (head == null || head.next == null) {
                                return;
                            }
                            ListNode mid = middleNode(head);
                            ListNode hs = reverseList(mid);
                            ListNode hf = head;
                            while (hf != null && hs != null) {
                                ListNode temp = hf.next;
                                hf.next = hs;
                                hf = temp;

                                temp = hs.next;
                                hs.next = hf;
                                hs = temp;
                            }
                            if (hf != null) {
                                hf.next = null;
                            }
                        }

                         public ListNode reverseList(ListNode head){
                            ListNode previous = null;
                            ListNode current = head;
                            while(current != null){
                                ListNode next = current.next;
                                  current.next = previous;
                                  previous = current;
                                  current = next;
                            }
                            return previous;
                        }
                        public ListNode middleNode3(ListNode head) {
                             ListNode slow = head;
                              ListNode fast = head;
                              while(fast != null && fast.next != null){
                                slow = slow.next;
                                fast = fast.next.next;
                              }
                              return slow;  
                        }
                        
  

 // =================================== 
   //   Sort list
    public ListNode sortList(ListNode head) {

        if(head==null || head.next==null){
            return head;
        }
        ListNode mid = middleNode(head);
        ListNode newHead = mid.next;
        mid.next = null;
        ListNode left = sortList(head);
        ListNode right = sortList(newHead);

        return mergeTwoLists(left , right);

        }  
    

     public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        ListNode ansHead = new ListNode();
        ListNode tail = ansHead;

        while(list1 != null && list2 != null){
         if(list1.val<list2.val){
                    tail.next = list1 ;
                    list1 = list1.next;
                    tail = tail.next;
              }else{
                    tail.next = list2 ;
                    list2 = list2.next;
                    tail = tail.next;
              }
          }

              tail.next = (list1 != null)? list1 : list2 ;
              return ansHead.next;
  }

      public ListNode middleNode(ListNode head) {
          if (head == null || head.next == null)
            return head;
         ListNode slow = head;
          ListNode fast = head;
          while(  fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
          }

          return slow;

        
    }



//=========================================
Reverse a list in between

    public ListNode reverseBetween(ListNode head, int left, int right) {

      if(left == right){
        return head;
      }
      ListNode previous = null ;
      ListNode current =   head;
      for(int i = 0 ; current != null && i < left-1 ; i++){
            previous = current ;
            current = current.next;
      }
      ListNode last = previous ;
      ListNode newEnd = current;
      ListNode  next = current.next;
      for(int i = 0 ; current != null && i < right-left+1 ; i++){
            current.next = previous;
            previous = current ;
            current = next ;
            if(next != null){
                next = next.next;
            }
      }

      if(last != null){
        last.next = previous;
      }else{
         head = previous;
      }

      newEnd.next = current;
      return head;

    }




//======================================

//  Pallindrom list 

public boolean isPalindrome(ListNode head) {
    ListNode mid = middleNode(head);
    ListNode headSecond = reverseList(mid);
    ListNode rereverseHead = headSecond;

    while (head != null && headSecond != null) {
        if (head.val != headSecond.val) {
            break;
        }
        head = head.next;
        headSecond = headSecond.next;
    }
    reverseList(rereverseHead);

    return head == null || headSecond == null;
}

    public ListNode reverseList2(ListNode head) {
    if (head == null) {
        return head;
    }
    ListNode prev = null;
    ListNode present = head;
    ListNode next = present.next;

    while (present != null) {
        present.next = prev;
        prev = present;
        present = next;
        if (next != null) {
            next = next.next;
        }
    }
    return prev;
}
//==========================================
public ListNode middleNode2(ListNode head) {
    ListNode s = head;
    ListNode f = head;

    while (f != null && f.next != null) {
        s = s.next;
        f = f.next.next;
    }
    return s;
}

//===========================================
// Reverse in K alternative group

public ListNode reverseKGroupINAlternate(ListNode head, int k) {
    if (k <= 1 || head == null) {
        return head;
    }

    ListNode current = head;
    ListNode prev = null;

    int length = getLength(head);
    int count = length / k;
    while (count > 0) {
        ListNode last = prev;
        ListNode newEnd = current;

        ListNode next = current.next;
        for (int i = 0; current != null && i < k; i++) {
            current.next = prev;
            prev = current;
            current = next;
            if (next != null) {
                next = next.next;
            }
        }

        if (last != null) {
            last.next = prev;
        } else {
            head = prev;
        }

        newEnd.next = current;

        prev = newEnd;
        count--;
    }
    return head;
}
//====================================

public ListNode rotateRight(ListNode head, int k) {
     
    if(head == null || head.next == null || k <=0){
       return head;
    }
    ListNode last = head;
    int length = 1;
    while(last.next != null){
       last = last.next;
       length++;
    }

    last.next = head;
    int rotation = k % length;
    int skip = length - rotation;

    ListNode newLast = head;
    for(int i = 0 ; i < skip-1 ; i++){
       newLast = newLast.next;
    }
    head = newLast.next;
    newLast.next = null;
return head;

}

}

}

public class MergeSort {
   
    public Node sortList(Node head) {
        
        if (head == null || head.next == null)
              return head;
                
            // step 1. cut the list to two halves
            Node prev = null, slow = head, fast = head;
            
            while (fast != null && fast.next != null) {
              prev = slow;
              slow = slow.next;
              fast = fast.next.next;
            }
            
            prev.next = null;
            
            // step 2. sort each half
            Node l1 = sortList(head);
            Node l2 = sortList(slow);
            
            // step 3. merge l1 and l2
            return merge(l1, l2);
                
            }
            
             public static Node merge(Node list1, Node list2) {
                Node resultHead = new Node();
                Node result = resultHead;
                
                while(list1 !=null && list2 != null){
                    if(list1.val<list2.val){
                        result.next = list1;
                        list1 = list1.next;
                        result = result.next;
                    }else{
                        result.next = list2;
                        list2 = list2.next;
                        result = result.next;
                    }
                }
                
                while(list1 !=null){
                        result.next = list1;
                        list1 = list1.next;
                        result = result.next;
                }
                
                while(list2 !=null){
                        result.next = list2;
                        list2 = list2.next;
                        result = result.next;            
                }
                
                return resultHead.next;
            }
            

}

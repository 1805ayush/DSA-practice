public class LL {
    private Node head;
    private Node tail;
    private int size;

    public LL(){
        this.size = 0;
    }

    public void insertFirst(int val){
        Node temp = new Node(val);
        temp.next = head;
        head = temp;

        if(tail==null){
            tail = head;
        }

        size++;
    }

    public void insertLast(int val) {
        if(tail==null){
            insertFirst(val);
            return;
        }

        Node temp = new Node(val);
        tail.next = temp;
        tail = temp;

        size++;
    }

    public void insert(int val,int position) {

        if (position==0) {
            insertFirst(val);
            return;            
        }
        Node temp1 = new Node(val);
        Node temp2 = head;
        while (--position>0) {
            temp2= temp2.next;
        }
        temp1.next = temp2.next;
        temp2.next = temp1;
        size++;
    }

    public void insertRec(int val,int position) {
        head = insertRec(val,position,head);
    }

    private Node insertRec(int val, int index, Node node){
        if(index==0){
            Node temp = new Node(val,node.next);
            size++;
            return temp;
        }

        node.next = insertRec(val,index-1,node.next);
        return node;

    }

    public void deleteFirst() {
        int val = head.value;
        head = head.next;
        System.out.println("the deleted value is: " + val);
        size--;
    }

    public void deleteLast() {
        Node temp = head;

        while (temp.next.next != null) {
            temp = temp.next;
        }
        System.out.println("The deleted Item is: "+tail.value);
        tail = temp;
        tail.next = null;
        size--;
    }

    public void delete(int position) {

        if (position==0) {
            deleteFirst();
            return;            
        }
        
        Node temp = get(position);
        System.out.println("Deleted value is: "+temp.next.value);
        temp.next = temp.next.next ;
        size--;
        
    }

    public Node get(int position) {
        Node temp = head;
        for (int i = 1; i < position; i++) {
            temp = temp.next;
        }

        return temp;
    }

    public Node find(int val) {
        Node temp = head;
        while(temp != null) {
            if (temp.value == val){
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }


    public void displayList(){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.value+" -> ");
            temp = temp.next;
        }
        System.out.print("End");

    }

    //bubblesort 
    public void bubbleSort(int row,int column){
        if(row == 0){
            return;
        }

        if(col<row){
            Node first = get(column);
            Node second = get(column+1);

            if(first.value >second.value){
                if(first ==head){
                    head = second;
                    first.next =second.next;
                    second.next = first;
                }else if(second==tail){
                    Node previous = get(column-1);
                    prev.next = second;
                    tail = first;
                    first.next = null;
                    second.next = tail; 
                }else{
                    Node previous = get(column-1);
                    prev.next = second;
                    first.next = second.next;
                    second.next = first;
                }
            }
            bubbleSort(row,column+1);
        }else{
            bubbleSort(row-1,0);
        }
    }

    //Reversing Linked list using Recursion

    private void reverse(Node node){
        if(node==tail){
            head =tail;
            return;
        }

        reverse(node.next);
        tail.next =node;
        node = tail;
        tail.next = null;
    }

    //Inplace reversal of LinkedLists

    

    //finding the length of the cycle
    public int cycleLength(Node head){
        Node fast = head;
        node slow =head;

        while(fast != null && fast.next!= null){
            fast = fast.next.next;
            slow = slow.next;
            if (fast==slow) {
                Node temp = slow;
                int length=0;
                do {
                    temp = temp.next;
                    length++;
                } while (temp!= slow);
                return length;
            }
        }
        return -1;
    }


    private class Node{
        private int value;
        private Node next;

    public Node(int value){
        this.value = value;
    }

    public Node(int value, Node next){
        this.value = value;
        this.next = next;
    }
}
}

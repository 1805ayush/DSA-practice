public class DLL {

    Node head;

    public void insertFirst(int value){
        Node temp = new Node(value);
        temp.next = head;
        temp.prev = null;
        if (head != null) {
            head.prev = temp;
        }
        head = temp;
    }
    public void insertLast(int value){
        if (head == null) {
            insertFirst(value);
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        Node newNode = new Node(value);
        temp.next = newNode;
        newNode.prev = temp;
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
        temp1.prev = temp2;
        if (temp1.next !=null) {
            temp1.next.prev = temp1;
        }
    }

    public void display(){
        Node temp = head;
        System.out.print("Start <=> ");
        while(temp != null){
            System.out.print(temp.value+ " <=> ");
            temp = temp.next;
        }
        System.out.println("End");

    }

    public void displayReverse(){
        Node temp = head;
        Node tail = null;
        System.out.print("End <=> ");
        while(temp != null){
           // System.out.print(temp.value+ " <=> ");
           tail = temp;
            temp = temp.next;
        }
        while(tail != null){
             System.out.print(tail.value+ " <=> ");
             tail = tail.prev;
         }
        System.out.println("Start");

    }

    private class Node {
        int value;
        Node next;
        Node prev;

        public Node(int value) {
            this.value = value;
        }
        public Node(int value, Node prev,Node next) {
            this.value = value;
            this.prev = prev;
            this.next = next;
        }
    }
}

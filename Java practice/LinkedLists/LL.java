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
            node = node.next;
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

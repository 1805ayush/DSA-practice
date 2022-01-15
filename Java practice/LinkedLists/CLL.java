public class CLL {

    private Node head;
    private Node tail;

    public CLL() {
        this.head = null;
        this.tail = null;
    }

    public void insert(int val){
        Node newNode = new Node(val);
        if(head == null){
            head = newNode;
            tail = newNode;
        }

        tail.next = newNode;
        newNode.next = head;
        tail = newNode;

    }

    public void delete(int val){
        Node newNode = head;
        if(head!= null){
            do{
                if (newNode.next.value == val) {
                    newNode.next = newNode.next.next;
                    return;
                }
                newNode = newNode.next;
            }while(newNode!=head);
        }
    }

    public void display(){
        Node newNode = head;
        if(head!= null){
            do{
                System.out.print(newNode.value+" -> ");
                newNode = newNode.next;
            }while(newNode!=head);
        }
        System.out.println(head.value);
    }

    private class Node{
        int value;
        Node next;

        public Node(int value){
            this.value = value;
        }
    }
}

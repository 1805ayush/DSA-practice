public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(7);
        list.insertLast(6);
        list.insertLast(9);
        list.displayList();
        System.out.println();
        list.insert(99, 3);
        list.displayList();
        System.out.println();
        list.deleteFirst();
        list.displayList();
        System.out.println();
        list.deleteLast();
        list.displayList();
        System.out.println();
        list.delete(3);
        list.displayList();
        System.out.println();

    }
}

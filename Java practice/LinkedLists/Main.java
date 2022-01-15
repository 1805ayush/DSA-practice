public class Main {
    public static void main(String[] args) {
        // LL list = new LL();
        // list.insertFirst(3);
        // list.insertFirst(4);
        // list.insertFirst(1);
        // list.insertFirst(2);
        // list.insertFirst(7);
        // list.insertLast(6);
        // list.insertLast(9);
        // list.displayList();
        // System.out.println();
        // list.insert(99, 3);
        // list.displayList();
        // System.out.println();
        // list.deleteFirst();
        // list.displayList();
        // System.out.println();
        // list.deleteLast();
        // list.displayList();
        // System.out.println();
        // list.delete(3);
        // list.displayList();
        // System.out.println();

        // DLL newDLL = new DLL();
        // newDLL.insertFirst(12);
        // newDLL.insertFirst(1);
        // newDLL.insertFirst(2);
        // newDLL.insertFirst(4);
        // newDLL.insertFirst(99);
        // newDLL.insertFirst(100);
        // newDLL.display();
        // newDLL.displayReverse();
        // newDLL.insertLast(55);
        // newDLL.display();
        // newDLL.insert(7, 3);
        // newDLL.display();

        CLL newCLL = new CLL();
        newCLL.insert(43);
        newCLL.insert(12);
        newCLL.insert(1);
        newCLL.insert(3);
        newCLL.insert(4);
        newCLL.insert(25);

        newCLL.display();

        newCLL.delete(1);
        newCLL.display();

    }
}

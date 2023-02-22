public class Main {
    public static void main(String[] args) {
        // Teszteljük a lista létrehozását
        MyLinkedList list = new MyLinkedList();
        System.out.println("A lista mérete: " + list.getSize()); // Az eredmény: 0
        System.out.println("Az 1. elem értéke: " + list.get(0)); // Az eredmény: -1

        // Teszteljük az új elemek hozzáadását
        list.addAtHead(2);
        list.addAtTail(4);
        list.addAtIndex(1, 3);
        System.out.println("A lista elemei: ");
        for (int i = 0; i < list.getSize(); i++) {
            System.out.print(list.get(i) + " "); // Az eredmény: 2 3 4
        }
        System.out.println();

        // Teszteljük az érvénytelen indexek kezelését
        list.addAtIndex(4, 5);
        System.out.println("A lista elemei: ");
        for (int i = 0; i < list.getSize(); i++) {
            System.out.print(list.get(i) + " "); // Az eredmény: 2 3 4
        }
        System.out.println();
        list.addAtIndex(-1, 1);
        System.out.println("A lista elemei: ");
        for (int i = 0; i < list.getSize(); i++) {
            System.out.print(list.get(i) + " "); // Az eredmény: 2 3 4
        }
        System.out.println();

        // Teszteljük az elem eltávolítását
        list.deleteAtIndex(1);
        System.out.println("A lista elemei: ");
        for (int i = 0; i < list.getSize(); i++) {
            System.out.print(list.get(i) + " "); // Az eredmény: 2 4
        }
        System.out.println();
    }
}
public class MyLinkedList {

    private Node head; // A lista feje (az első elem referenciája)
    private int size; // A lista mérete (az elemek száma)

    // A Node belső osztály reprezentál egy láncolt lista elemet
    private class Node {
        int val; // Az elem értéke
        Node next; // Az elem után következő elem referenciája

        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    /**
     * Az osztály konstruktora
     */
    public MyLinkedList() {
        this.head = null;
        this.size = 0;
    }

    /**
     * Az index-edik elem értékének lekérdezése.
     * Ha az index érvénytelen (kisebb mint 0 vagy nagyobb vagy egyenlő mint a lista mérete), akkor -1 lesz az eredmény.
     */
    public int get(int index) {
        if (index < 0 || index >= size) {
            return -1;
        }
        Node curr = head;
        for (int i = 0; i < index; i++) {
            curr = curr.next;
        }
        return curr.val;
    }

    /**
     * Egy új elem hozzáadása a lista elejéhez.
     * Az új elem után az eredeti lista feje lesz.
     */
    public void addAtHead(int val) {
        Node newHead = new Node(val);
        newHead.next = head;
        head = newHead;
        size++;
    }

    /**
     * Egy új elem hozzáadása a lista végéhez.
     * Ha a lista üres, akkor az új elem lesz az első elem is.
     */
    public void addAtTail(int val) {
        Node newTail = new Node(val);
        if (head == null) {
            head = newTail;
        } else {
            Node curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = newTail;
        }
        size++;
    }

    /**
     * Egy új elem beszúrása az index-edik pozícióba.
     * Ha az index érvénytelen (kisebb mint 0 vagy nagyobb mint a lista mérete), akkor nem történik semmi.
     * Ha az index a lista végére mutat, akkor az új elem lesz az utolsó elem is.
     */
    public void addAtIndex(int index, int val) {
        if (index < 0 || index > size) {
            return;
        }
        if (index == 0) {
            addAtHead(val);
        } else if (index == size) {
            addAtTail(val);
        } else {
            Node curr = head;
            for (int i = 0; i < index - 1; i++) {
                curr = curr.next;
            }
            Node newNode = new Node(val);
            newNode.next = curr.next;
            curr.next = newNode;
            size++;
        }
    }

    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) {
            return;
        }
        if (index == 0) {
            head = head.next;
        } else {
            Node curr = head;
            for (int i = 0; i < index - 1; i++) {
                curr = curr.next;
            }
            curr.next = curr.next.next;
        }
        size--;
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}



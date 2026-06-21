class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    // Insert at end
    void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    // Display elements
    void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    // Search element
    void search(int value) {
        Node temp = head;
        int pos = 1;

        while (temp != null) {
            if (temp.data == value) {
                System.out.println(value + " found at position " + pos);
                return;
            }

            temp = temp.next;
            pos++;
        }

        System.out.println(value + " not found");
    }

    // Delete element
    void delete(int value) {
        if (head == null) {
            return;
        }

        if (head.data == value) {
            head = head.next;
            return;
        }

        Node temp = head;

        while (temp.next != null && temp.next.data != value) {
            temp = temp.next;
        }

        if (temp.next != null) {
            temp.next = temp.next.next;
        }
    }

    // Count nodes
    void count() {
        int c = 0;
        Node temp = head;

        while (temp != null) {
            c++;
            temp = temp.next;
        }

        System.out.println("Total Nodes = " + c);
    }
}

public class Main {
    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);

        System.out.println("Linked List:");
        list.display();

        list.search(30);

        list.delete(20);

        System.out.println("After deleting:");
        list.display();

        list.count();
    }
}

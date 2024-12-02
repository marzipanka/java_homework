package homework4.nodeList;

public class Main {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        System.out.println("Исходный список:");
        printList(head);

        head = reverseList(head);

        System.out.println("Развернутый список:");
        printList(head);
    }

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node reverseList(Node head) {
        Node current = head;
        Node reversed = null;

        while (current != null) {
            Node nextNode = current.next;
            current.next = reversed;
            reversed = current;
            current = nextNode;
        }

        return reversed;
    }

    public static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
//Removing/Deleting the particular value from the linkedlist 

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

class LinkedlistOperations {

    static void print(Node head) {

        Node curr = head;

        if (head == null) {
            System.out.println(head);
            return;
        }

        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println();
    }

    static Node removeElements(Node head, int val) {
        while (head != null && head.data == val) {
            head = head.next;
        }

        if (head == null) {
            return null;
        }

        Node prev = head;
        Node curr = head.next;

        while (curr != null) {
            if (curr.data == val) {
                prev.next = curr.next;
            } else {
                prev = curr;
            }
            curr = curr.next;
        }

        return head;
    }
}

public class ques15 {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(1);
        head.next.next = new Node(1);

        LinkedlistOperations.print(head);
        System.out.println("Modified");
        head = LinkedlistOperations.removeElements(head, 1);
        LinkedlistOperations.print(head);
    }
}

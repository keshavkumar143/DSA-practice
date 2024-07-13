// Odd and even positioned linked list nodes
// LINK -> https://www.naukri.com/code360/problem-of-the-day/easy

class Node { 
    public int data;
    public Node next; 
    Node(int data) {
        this.data = data; 
        this.next = null; 
    }
}

class Solution {
    public static Node oddEvenLinkedList(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        
        Node even = head.next; 
        Node odd = head; 
        Node evenHead = even; 

        while (even != null && even.next != null) {
            odd.next = even.next; 
            odd = odd.next; 
            even.next = odd.next; 
            even = even.next; 
        }

        odd.next = evenHead; 

        return head; 
    }

    // Helper method to print the list
    public static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

public class ques14 {
    public static void main(String[] args) {
        // Test case 1
        Node head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(3);
        head1.next.next.next = new Node(-4);
        head1.next.next.next.next = new Node(5);
        head1.next.next.next.next.next = new Node(6);

        System.out.println("Original list 1:");
        Solution.printList(head1);
        head1 = Solution.oddEvenLinkedList(head1);
        System.out.println("Modified list 1:");
        Solution.printList(head1);

        // Test case 2
        Node head2 = new Node(-3);

        System.out.println("Original list 2:");
        Solution.printList(head2);
        head2 = Solution.oddEvenLinkedList(head2);
        System.out.println("Modified list 2:");
        Solution.printList(head2);

        // Additional test case 3
        Node head3 = new Node(2);
        head3.next = new Node(1);
        head3.next.next = new Node(3);
        head3.next.next.next = new Node(4);
        head3.next.next.next.next = new Node(6);
        head3.next.next.next.next.next = new Node(5);

        System.out.println("Original list 3:");
        Solution.printList(head3);
        head3 = Solution.oddEvenLinkedList(head3);
        System.out.println("Modified list 3:");
        Solution.printList(head3);

        // Additional test case 4
        Node head4 = new Node(3);
        head4.next = new Node(5);
        head4.next.next = new Node(-2);
        head4.next.next.next = new Node(1);
        head4.next.next.next.next = new Node(7);
        head4.next.next.next.next.next = new Node(-1);

        System.out.println("Original list 4:");
        Solution.printList(head4);
        head4 = Solution.oddEvenLinkedList(head4);
        System.out.println("Modified list 4:");
        Solution.printList(head4);
    }
}

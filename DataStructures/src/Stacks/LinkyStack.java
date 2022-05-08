package Stacks;

public class LinkyStack {
    // [ a, b, c, d <
    Node head;

    public void push(int data) {
        Node node = new Node();
        node.data = data;

        Node current = head;

        node.next = current;
        head = node;
    }

    public void pop() {
        if (head != null)
            head = head.next;
    }

    public int peek() {
        return head.data;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void print() {
        Node current = head;

        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}

package LinkedLists;

public class LinkyList {
    Node head;

    public void insert(int data) {

        Node node = new Node();
        node.data = data;
        node.next = null;

        if (head == null) {
            head = node;
        } else {

            Node current = head;

            while (current.next != null
                // Until last node is null
            ) {
                current = current.next;
            }

            current.next = node;
        }

    }

    public void showList() {
        Node node = head;
        int c = 0;

        while (node != null) {
            System.out.println("Value of " + c + " = " + node.data);
            node = node.next;
            c++;
        }
    }

}

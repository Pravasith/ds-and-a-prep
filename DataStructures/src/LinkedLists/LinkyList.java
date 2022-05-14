package LinkedLists;

public class LinkyList {
    public Node head;

    public void insertAtEnd(int data) {

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

    public void insertAtStart(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;

        node.next = head;
        head = node;
    }

    public void insertAt(int index, int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;

        if (index == 0) {
            insertAtStart(data);
            return;
        }

        int count = 0;
        Node current = head;

        while (count < index - 1) {
            current = current.next;
            count++;
        }

        node.next = current.next;
        current.next = node;
    }

    public void delete(int index) {
        if (index == 0) {
            head = head.next;
            return;
        }

        int count = 0;
        Node current = head;

        while (count < index - 1) {
            current = current.next;
            count++;
        }

        Node temp = current.next;
        current.next = temp.next;

        System.out.println("Deleted index " + index + ", data was " + temp.data);
        System.out.println("-----------");

//        current.next = current.next.next; --> this can be used too

    }

    public void showList() {
        Node node = head;
        int c = 0;

        while (node != null) {
            System.out.println("Value of " + c + " = " + node.data);
            node = node.next;
            c++;
        }

        System.out.println("-----------");
    }

    public void reverseLinky() {
        Node prev = null;

        while (head != null) {
            Node next = head.next;
            head.next = prev; // a.b.c.d.. --> b.a
            prev = head;
            head = next;
        }

        head = prev;
    }

    public Node reverseLinkyRecursive(Node list) {
        // [a -> b -> c -> d -> e]

        if (list == null) return null;
        if (list.next == null) return list;

        Node secondElem = list.next;
        Node reverseRest = reverseLinkyRecursive(secondElem);

        secondElem.next = list;
        list.next = null;

        head = reverseRest;
        return reverseRest;
    }
}

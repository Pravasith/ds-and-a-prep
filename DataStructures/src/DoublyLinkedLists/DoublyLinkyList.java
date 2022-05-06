package DoublyLinkedLists;

public class DoublyLinkyList {
    Node head;
    Node tail;


    public void insertAtEnd(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;

        if (head != null) {
            node.prev = tail;
            tail.next = node;
            tail = tail.next;
        } else {
            head = tail = node;
        }
    }

    public void insertAtStart(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;

        if (head == null) {
            head = tail = node;
        } else {
            node.next = head;
            head.prev = node;
            head = node;
        }
    }

    public void insertAt(int index, int data) {
        if (index == 0) {
            insertAtStart(data);
        } else {
            Node node = new Node();
            node.data = data;
            node.next = null;

            Node current = head;
            int count = 0;

            while (current != null) {
                if (count == index) {
                    node.next = current;
                    node.prev = current.prev;
                    current.prev.next = node;
                    current.prev = node;
                }

                current = current.next;
                count++;
            }
        }
    }

    public void deleteAt(int index) {
        int temp = -1;

        if (index == 0) {
            temp = head.data;
            head = head.next;
            head.prev = null;

        } else {
            int count = 0;
            Node current = head;

            while (current != null) {
                if (count == index) {
                    temp = current.data;
                    current.prev.next = current.next;

                    if (current.next != null)
                        current.next.prev = current.prev;
                }

                current = current.next;
                count++;
            }
        }

        System.out.println("Deleted index " + index + ", data was " + temp);
        System.out.println("-----------");
    }

    public void showList() {
        Node current = head;
        int c = 0;

        while (current != null) {
            if (current.prev == null) {
                System.out.println("Value of " + c + " = " + current.data + " [ " + "null" + ", " + current.data + ", " + current.next.data + " ]");
            } else if (current.next == null) {
                System.out.println("Value of " + c + " = " + current.data + " [ " + current.prev.data + ", " + current.data + ", " + "null" + " ]");
            } else
                System.out.println("Value of " + c + " = " + current.data + " [ " + current.prev.data + ", " + current.data + ", " + current.next.data + " ]");
            c++;
            current = current.next;
        }

        System.out.println("-----------");
    }
}

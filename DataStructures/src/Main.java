import DoublyLinkedLists.DoublyLinkyList;
import LinkedLists.LinkyList;
import LinkedLists.Node;

import java.util.Vector;

public class Main {
    static void linkyListOps() {
        LinkyList linky = new LinkyList();

        linky.insertAtEnd(2);
        linky.insertAtEnd(4);
        linky.insertAtEnd(1);
        linky.insertAtEnd(8);

        linky.insertAtStart(24);
        linky.insertAt(0, 45);

        linky.showList();

        linky.delete(4);

        linky.showList();

        linky.reverseLinky();

        linky.showList();
    }

    static void doublyLinkyListOps() {
        DoublyLinkyList dLinky = new DoublyLinkyList();
        dLinky.insertAtStart(20);
        dLinky.insertAtEnd(25);
        dLinky.insertAtEnd(1);
        dLinky.insertAtEnd(67);


        dLinky.insertAt(2, 82);
        dLinky.insertAt(0, 90);
        dLinky.insertAt(6, 91);

        dLinky.showList();

        dLinky.deleteAt(5);

        dLinky.showList();

    }


    public static void main(String[] args) {
//        linkyListOps();
        doublyLinkyListOps();


    }
}

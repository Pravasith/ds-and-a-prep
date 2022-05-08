import DoublyLinkedLists.DoublyLinkyList;
import LinkedLists.LinkyList;
import LinkedLists.Node;
import Stacks.ArrayStack;
import Stacks.LinkyStack;

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

    static void linkyStackOps() {
        LinkyStack linkyStack = new LinkyStack();

        linkyStack.print();

        linkyStack.push(5);
        linkyStack.push(15);
        linkyStack.push(52);

        linkyStack.pop();
        linkyStack.pop();

        System.out.println(linkyStack.peek());

        System.out.println(linkyStack.isEmpty());
        linkyStack.pop();
        System.out.println(linkyStack.isEmpty());


        linkyStack.print();

    }

    static void ArrayStackOps() {
        ArrayStack arrayStack = new ArrayStack();

        arrayStack.print();
        arrayStack.push(20);
        arrayStack.push(60);
        arrayStack.push(22);
        arrayStack.push(69);
        arrayStack.push(9);

        arrayStack.print();
        arrayStack.pop();
        arrayStack.pop();

        System.out.println(arrayStack.peek());
        arrayStack.pop();
        arrayStack.pop();
        System.out.println(arrayStack.isEmpty());
        arrayStack.pop();
        arrayStack.pop();
        arrayStack.print();

        System.out.println(arrayStack.isEmpty());
    }


    public static void main(String[] args) {
//        linkyListOps();
//        doublyLinkyListOps();

//        linkyStackOps();

        ArrayStackOps();
    }
}

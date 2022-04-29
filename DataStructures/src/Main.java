import LinkedLists.LinkyList;
import LinkedLists.Node;

public class Main {
    public static void main(String[] args) {
//        System.out.println("HELLO WORLD!");

        LinkyList linky = new LinkyList();

        linky.insertAtEnd(2);
        linky.insertAtEnd(4);
        linky.insertAtEnd(1);
        linky.insertAtEnd(8);

        linky.insertAtStart(24);
        linky.insertAt(0, 45);

        linky.showList();

        System.out.println("----");
        linky.delete(4);

        linky.showList();


    }
}

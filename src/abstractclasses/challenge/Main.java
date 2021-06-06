package abstractclasses.challenge;

public class Main {
    public static void main(String[] args) {

        MyLinkedList list = new MyLinkedList(null);
        list.traverse(list.getRoot());

        String stringData ="czarnek chuj wosił gnój na gumowych taczkach i gumowych kaloszach";

        String[] data = stringData.split(" ");
        for(String s : data){
            list.addItem(new Node(s));
        }

        list.traverse(list.getRoot());
    }
}

import java.util.LinkedList;

public class CollectionLinkedList{ 
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        list.add(10);
        list.add(20);
        list.add(30);

        list.addFirst(5);
        list.addLast(40);

        System.out.println("List: " + list);

        list.removeFirst();
        list.removeLast();

        for (int num : list) {
            System.out.println(num);
        }
    }
}
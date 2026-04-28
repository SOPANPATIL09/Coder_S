import java.util.*;

public class CollectionLinkedList1{
    public static void main(String args[]){
        List<Integer> list=new LinkedList<>();
        
         list.add(10);
         list.add(20);
         list.add(30);
         list.add(40);
         list.add(50);
         list.add(60);
         
        System.out.println(list);
        list.remove(list.get(list.size()-1));
        list.set(1,15);
        System.out.println(list);
        for(int e:list){
            System.out.println(e);
        }
        System.out.println("size is:"+list.size());
    }
}
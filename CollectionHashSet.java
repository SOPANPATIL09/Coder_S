import java.util.*;
public class CollectionHashSet{
    public static void main(String args[]){
         Set<Integer> set=new HashSet<>();
         set.add(10);
         set.add(20);
         set.add(30);
         set.add(40);
         set.add(50);
         System.out.println(set);
         set.remove(50);
         System.out.println(set);
         Set<Integer> set1=new HashSet<>();
         
         set1.add(25);
         set1.add(35);
         set1.add(45);
         set1.add(55);
         
         set.addAll(set1);
         System.out.println(set);
         for(int e:set){
             System.out.println(e);
         }
         
        set.removeAll(set);
         System.out.println(set.isEmpty());
        
    }
}
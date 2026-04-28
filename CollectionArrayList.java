import java.util.ArrayList;
import java.util.List;
public class CollectionArrayList{
    public static void main(String args[]){
        List<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(20);
        
        
        System.out.println(list.get(1));
        list.set(1,45);
        System.out.println(list.size());
        
        System.out.println(list.remove(list.get(5)));

        System.out.println(list);
        
          
          for(int e:list){
              System.out.println(e);
          }
        
        
        
    }
}
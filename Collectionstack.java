import java.util.*;
public class Collectionstack{
    public static void main(String args[]){
        List<String> list=new Stack<>();
        
        list.add("anushka");
        list.add("sopan");
        list.add("ketki");
        list.add("sheetal");
        list.add("unkwon");
        
        
        System.out.println(list);
        list.remove("unkwon");
        list.set(1,"suzuka");
        System.out.println(list);
        for(String e:list){
            System.out.println(e);
        }
        System.out.println("size :"+list.size());
        
    }
}
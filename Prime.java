import java.util.Scanner;

public class Prime {

     public boolean prime(int num){
         boolean b=true;
         if(num==1||num==0){
             return false;
         }
         for(int i=2;i<=Math.sqrt(num);i++){
                if(num%i==0){
                    b=false;
                }
         }
         return b;
     }
     public static void main(String[] args) {
            Prime p=new Prime();
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            p.prime(n);

     }

}

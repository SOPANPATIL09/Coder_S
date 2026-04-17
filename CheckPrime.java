public class CheckPrime {

    public boolean returnPrime(int num){
        boolean b=false;
        
        if(num==1||num==0){
            return b;
        }
        
        for(int i=2; i<=num/2; i++){
            if(num%i==0){
                b=true;
            }
        }
        return !b;
    }
    public static void main(String args[]){
        CheckPrime m=new CheckPrime();
        System.out.println(m.returnPrime(11));
    }}


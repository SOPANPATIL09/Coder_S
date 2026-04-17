public class CheckPalindromeNumber{
    public boolean checkPalindrome(int num){
        int temp=num;
        int sum=0;
        while(temp!=0){
              sum*=10;
              sum+=temp%10;
              
              temp/=10;
        }
        
        return sum==num;
    }
    public static void main(String args[]){
        CheckPalindromeNumber cn=new CheckPalindromeNumber();
        System.out.println(cn.checkPalindrome(2002));
    }
} 
    


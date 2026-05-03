package Encapsulation_oops.MainBank;

public class RBI {
    public final static String Bankname="RBI KING BANK";
    private String policy;
    boolean checkpolicy =true;
    private double interestRate;

     public void setPolicy(String policy){
         if(checkpolicy==true){
         this.policy = policy;
         }
     }
     public String getPolicy(){
         if(checkpolicy==true){
         return policy;
         }
         return " ";
     }

     public void  setInterestRate(double rate){
         if(checkpolicy==true){
             this.interestRate = rate;
         }
     }
     public double getInterestRate(){
         if(checkpolicy==true){
             return interestRate;
         }
         return 0.0;
     }




}

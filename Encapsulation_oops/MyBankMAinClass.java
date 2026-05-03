package Encapsulation_oops;

import Encapsulation_oops.MainBank.RBI;
import Encapsulation_oops.otherbank.Sbi;

public class MyBankMAinClass {
    public static void main(String args[])
    {

        Sbi s = new Sbi("Muktainagar Branch", 963735614);

        s.setPolicy("Policy is fixed you cannot change our policy");
        s.setInterestRate(7.8);

        s.display();



    }
}

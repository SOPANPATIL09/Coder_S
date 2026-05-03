package Encapsulation_oops.otherbank;

import Encapsulation_oops.MainBank.RBI;

public class Sbi extends RBI {

    private String branchName;
    private long accountNo;

    public Sbi(String branchName, int accountNo) {
        this.branchName = branchName;
        this.accountNo = accountNo;
    }

    public void display() {
        System.out.println("Branch: " + branchName);
        System.out.println("Account No: " + accountNo);

        // Access RBI policy
        System.out.println("RBI Policy: " + getPolicy());
        System.out.println("RBI Interest Rate: " + getInterestRate());
        System.out.println("Bank_Name:"+Bankname);
    }
}
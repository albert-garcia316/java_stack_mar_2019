package bank_account2;

import java.util.Random;

public class BankAccount {
	private String accountNumber;
    private double checkingBalance;
    private double savingsBalance;
    public static int numberOfAcconts = 0;
    public static double vaultBalance = 0.0;

    public BankAccount(){
        this.checkingBalance = 0.0;
        this.savingsBalance = 0.0;
        this.accountNumber = this.getAccountNumber();
        numberOfAcconts ++;
    }
    private String getAccountNumber(){
        Random rand = new Random();
        String str = "";
        for(int i = 0; i < 13; i++){
            int num = rand.nextInt(9);
            str += Integer.toString(num);
        }
        return str;
    }
    public void getaccountNumber() {
    	System.out.println(this.accountNumber);
    }
    public double getCheckingBalance(){
        return this.checkingBalance;
    }
    public double getSavingsBalance(){
        return this.savingsBalance;
    }
    public void deposit(String accountType, double amount){
        accountType = accountType.toLowerCase();
        if(accountType.contains("check")){
            this.checkingBalance += amount;
            vaultBalance += amount;
        }
        this.savingsBalance += amount;
        vaultBalance += amount;
    }
    public void withdraw(String accountType, double amount){
        accountType = accountType.toLowerCase();
        if(accountType.contains("check")){
            if(this.checkingBalance > amount){
                this.checkingBalance -= amount;
                vaultBalance -= amount;
            }else {
                System.out.println("You do not have enough money in your checking account");
            }
        }
        else {
        	if(this.savingsBalance > amount){
        		this.savingsBalance -= amount;
        		vaultBalance -= amount;
        	}
        	else {
                System.out.println("You do not have enough money in your savings account");
        	}
        }
    }
    public void showBlanace(){
        double total = this.savingsBalance + this.checkingBalance;
        System.out.println(
            "Checking balance is: " + this.checkingBalance + "\n" +
            "Savings balance is: " + this.savingsBalance + "\n" +
            "Total account balance is: " + total
        );
    }
}

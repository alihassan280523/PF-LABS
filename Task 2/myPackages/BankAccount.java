package myPackages;

public class BankAccount{

    private String accountNumber;
    private double balance;

    public BankAccount(){
        accountNumber="";
        balance=0;
    }

    public BankAccount(String acctNum,double balance){
        this.accountNumber=acctNum;
        this.balance=balance;
    }

    public double showBalance(){
        return this.balance;
    }

    public void deposit(double amount){
        balance+=amount;
        System.out.println("Amount deposited successfully");
        System.out.println("Current Balance: "+showBalance());
    }

    public void withdraw(double amount){
        if(amount > balance){
            System.out.println("Insufficient funds");
            System.out.println("Current balance: "+showBalance());
            return;
        }

        balance-=amount;

        System.out.println("Withdraw successful");
        System.out.println("Currenr Balance: "+showBalance());
    }

    public String toString(){
        return "Account Number: "+this.accountNumber+"\nBalance: "+this.balance;
    }


}
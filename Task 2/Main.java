import myPackages.*;

public class Main{

    public static void main(String[] args){
        BankAccount myAccount=new BankAccount("123456789",100);

        myAccount.deposit(100);
        myAccount.withdraw(20);
        myAccount.showBalance();

        System.out.println("\nAccount details:\n"+myAccount);
    }
}
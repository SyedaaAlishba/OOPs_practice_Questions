//Write a Java program to create a class known as "BankAccount" with methods called deposit() and withdraw().
//Create a subclass called SavingsAccount that overrides the withdraw() method to prevent withdrawals
//if the account balance falls below one hundred.

import Q1.BankAccount;
import Q1.SavingsAccount;

public class Main {
    public static void main(String[] args) {
        //Ans-->1
        BankAccount my_account= new BankAccount("B1234",600);
        my_account.deposit(1222);
        my_account.withdraw(800);
        my_account.getBalance();
        SavingsAccount myBank = new SavingsAccount("S132",0);
        myBank.deposit(1099);
        myBank.withdraw(20000);
        myBank.getBalance();

    }
}
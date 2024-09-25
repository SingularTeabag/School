package Bank;
/*
 * Author:  <you>
 * Date:    9/24
 * Purpose: Create and manipulate BankAccount objects
 */

public class BankAccount {
    private String acctType;
    private int accountID;
    private double total;

    public BankAccount(String type, int id, double initialDeposit) {
        acctType = type;
        accountID = id;
        total = initialDeposit;
    }

    public int getID() {
        return accountID;
    }

    public double getTotal() {
        return total;
    }

    public void deposit(double money) {
        total += money;
    }

    public void withdraw(double money) {
        total -= money;
    }

    public String toString() {
        return "Type: " + acctType + "\n" +
               "ID: " + getID() + "   Balance: $" + 
               getTotal();
    }
}
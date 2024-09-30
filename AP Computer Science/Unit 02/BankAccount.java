/*
 * Author:  <you>
 * Date:    9/24
 * Purpose: BankAccount class definition
 */

 public class BankAccount
 {
     // declare account type, account id and balance fields
     private String acctType;
     private int accountID;
     private double total;
     private String accHolderName;

    //create a bank account with default values for all fields
     public BankAccount() {
        acctType = "Not Established";
        accountID = 0;
        total = 0.0;
        accHolderName = "Unknown";
     }
     // Create a BankAccount with given id and initial deposit
     public BankAccount(String type, int id, double initialDeposit)
     {
         acctType = type;
         accountID = id;
         total = initialDeposit;
     }

     public BankAccount(String type, String holderolderName, int id, double initialDeposit)
     {
         acctType = type;
         accHolderName = holderolderName;
         accountID = id;
         total = initialDeposit;
     }
     
     // return bank account id
     public int getID()
     {
         return accountID;
     }
     
     // return current account balance
     public double getTotal()
     {
         return total;
     }
 
     // return ACCOUNT TYPE
     public String getAccountType()
     {
         return acctType;
     }
     
    // return ACCOUNT holder
     public String getAccountHolder()
     {
         return accHolderName;
     }

     //  deposit given amount to account
     public void deposit(double money)
     {
        System.out.println("You have deposited: $" + money);
         total = total + money;
     }
     
     // withdraw given amount from account
     public void withdraw(double money)
     {
        System.out.println("You have withdrawn: $" + money);
         total = total - money;
     }
     
     //adds interest to the account
     public void addIntrest(double precentage) {
        total *= 1 + (precentage / 100);
     }

     // return formatted account details
     public String toString()
     {
         return "Type: " + acctType + "\n" +
                "Account Holder Name: " + accHolderName + "\n" + 
                "ID: " + getID() + "   Balance: $ " + 
                getTotal() + "\n";
     }
     
 
 }
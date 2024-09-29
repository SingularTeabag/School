package Bank;
/*
 * Author:  Phillip
 * Date:    9/23/24
 * Purpose: Create and manipulate BankAccount objects
 */

 public class BankAccountRunner
 {
     public static void main(String[] args)
     {
         
        // Create the following BankAcount objects:
        //   - collegeFund, "college Fund", with ID 82890 and a starting balance 
        //     of $47,500
        //   - retirementSavings, "Retirement Savings" with ID 99999 and a starting 
        //     balance of $25,000
        BankAccount collegeFund = new BankAccount("College Fund", "Sztachera, Phillip", 82890, 47500);
        BankAccount retirementSavings = new BankAccount("Savings", "Sztachera, Phillip", 99999, 25000);

        // Complete the following 2 S.o.p statements to display account 
        // details
         
        System.out.println(collegeFund.toString());
        System.out.println(retirementSavings.toString());
         
        // Deposit $597 to collegeFund
        collegeFund.deposit(597);
       // Deposit $1,000 to retirementSaving
        retirementSavings.deposit(1000);
       // Withdraw $159.95 from collegeFund
        collegeFund.withdraw(159.95);
       // Deposit $159.36 to collegeFund
        collegeFund.deposit(159.36);
       // Deposit $1,500 to retirementSavings  
        retirementSavings.deposit(1500);
       // Withdraw $250 from retirementSavings  
        retirementSavings.withdraw(250);
        // Copy/paste your S.o.p statements from above to display the current 
        // balance in each account.  TRACE the transactions for each account
        // and compare to your output
        
        System.out.println();

        System.out.println(collegeFund.toString());
        System.out.println(retirementSavings.toString());
         
 
     }    
 }
import java.util.Scanner;
public class ProcessTransactions
{
    public static void main(String[] args){
        Account acct1, acct2;           //two test accounts
        String keepGoing = "y";         //more transactions?
        String action;                  //deposit or withdraw
        double amount;                  //how much to deposit or withdraw
        int acctNumber;                //which account to access
        Scanner scan = new Scanner(System.in);
        //Create two accounts
        acct1 = new Account(1000, "Sue", 123);
        acct2 = new Account(1000, "Joe", 456);
        System.out.println("The following accounts are available:\n");
        System.out.println(acct1);
        System.out.println(acct2);
        
        while (keepGoing.equals("y") || keepGoing.equals("y"))
            {
                //get account number, what to do, and amount
                System.out.print("\nEnter the number of the account you would like to access (123 or 456): ");
                acctNumber = scan.nextInt();
                System.out.print("Would you like to make a deposit (D) or withdrawal (W)? ");
                action = scan.next();
                System.out.print("Enter the amount: ");
                amount = scan.nextDouble();
                if (amount > 0)
                    if (acctNumber == acct1.getNumAccounts())
                        if (action.equals("w") || action.equals("W"))
                            acct1.withdraw(amount);
                        else if (action.equals("d") || action.equals("D"))
                            acct1.deposit(amount);
                        else
                            System.out.println("Sorry, invalid action.");
                    else if (acctNumber == acct2.getNumAccounts())
                        if (action.equals("w") || action.equals("W"))
                            acct2.withdraw(amount);
                        else if (action.equals("d") || action.equals("D"))
                            acct2.deposit(amount);
                        else
                            System.out.println("Sorry, invalid action.");
                    else
                        System.out.println("Sorry, invalid account number.");
                else
                        System.out.println("Sorry, amount must be > 0.");
                System.out.print("\nMore transactions? (y/n)");
                keepGoing = scan.next();
            }
        //Print number of deposits
        //Print number of withdrawals
        //Print total amount of deposits
        //Print total amount of withdrawals
    }
}
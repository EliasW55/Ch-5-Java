public class Account
{
  private double balance;
  private String name;
  private int acctNum;
  private static int numAccounts;
  private static Account acct3;
  //----------------------------------------------
  //Constructor -- initializes balance, owner, and account number
  //----------------------------------------------
  public Account(double initBal, String owner, int number){
    balance = initBal;
    name = owner;
    acctNum = number;
    numAccounts++;
  }
  
  public static int getNumAccounts() {
      return numAccounts;
  }
  //----------------------------------------------
  // Checks to see if balance is sufficient for withdrawal.
  // If so, decrements balance by amount; if not, prints message.
  //----------------------------------------------
  public void withdraw(double amount){
    if (balance >= amount)
       balance -= amount;
    else
       System.out.println("Insufficient funds");
  }
  
  public static Account consolidate(Account acct1, Account acct2) {
      if(acct1.name.equals(acct2.name) && acct1.acctNum!=acct2.acctNum) {
          acct3=new Account(acct1.balance+acct2.balance, acct1.name, acct1.acctNum);
      }
      else {
          System.out.println("These accounts cannot be consolidated");
      }
      return acct3;
  }
  //----------------------------------------------
  // Adds deposit amount to balance.
  //----------------------------------------------
  public void deposit(double amount){
    balance += amount;
  }
  //----------------------------------------------
  // Returns balance.
  //----------------------------------------------
  public double getBalance(){
    return balance;
  }
  //----------------------------------------------
  // Returns a string containing the name, account number, and balance.
  //----------------------------------------------
  public String toString(){
      String statement= "";
      statement = "Name: " + this.name + "\tAccount Number: " + this.acctNum + "\tBalance: " + this.balance;
      return statement;
  }
  //----------------------------------------------
  // Deducts $10 service fee
  //----------------------------------------------
  public double chargeFee(){
      return this.balance -= 10;
  }
  //----------------------------------------------
  // Changes the name on the account
  //----------------------------------------------
  public void changeName(String newName) {
      this.name = newName;
  }
  
  public void close() {
      name="CLOSED";
      balance=0;
  }
}


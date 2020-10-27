public class BankAccount{

  public double balance = 0.0;
  public int accountID;
  public String password;

  public BankAccount(int ID, String word){
    accountID = ID;
    password = word;
  }

  public String toString(){
    return accountID+"\t"+balance;
  }

  public double getBalance(){
    return balance;
  }

  public int getAccountID(){
    return accountID;
  }

  public void setPassword(String newPass){
    password = newPass;
  }

  public boolean deposit(double amount){
    if (amount >= 0) balance += amount;
    return (amount >= 0);
  }

  public boolean withdraw(double amount){
    if (amount >= 0 && amount <= balance) balance -= amount;
    return (amount >= 0 && amount <= balance);
  }
}

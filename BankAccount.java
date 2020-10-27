public class BankAccount{

  private double balance = 0.0;
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
}

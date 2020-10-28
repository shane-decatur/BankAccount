public class BankAccount{

  public double balance = 0.0;
  public int accountID;
  public String password;

  public BankAccount(int accountID, String password){
    this.accountID = accountID;
    this.password = password;
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
    if (amount >= 0) {
      balance += amount;
      return true;
    }
    return (amount >= 0);
  }

  public boolean withdraw(double amount){
    if (amount >= 0 && amount <= balance) {
      balance -= amount;
      return true;
    }
    return (amount >= 0 && amount <= balance);
  }

  public String toString(){
    return "#"+accountID+"\t$"+balance;
  }

  private boolean authenticate(String password){
    return this.password.equals(password);
  }

  public boolean transferTo(BankAccount other, double amount, String password){
    if (authenticate(password) && withdraw(amount)){
      if (other.deposit(amount)){
        return true;
      }
    }
    return false;
  }
}

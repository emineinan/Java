public class Account {
private double balance;
private String owner;

public Account(double balance, String owner) {
 this.balance = balance;
 this.owner = owner;
}
 
 public void Withdraw(int amount)
 {
  this.balance-=amount;  
 }
 
 
 public void Deposit(int amount)
 {
  this.balance+=amount;
 }

 public double getBalance() {
  return balance;
 }

 public String getOwner() {
  return owner;
 }
 
 @Override
 public String toString() {
  return this.owner+ "'s account has a balance of " + balance+" Tl.";
 }
     
 

 
 
 
 
 
 
 
 
 
 
 
 
 
 
}

public class Bank {
   public static void transferMoney(Account account1, Account account2, int amount) 
   {
   
   if(amount<account1.getBalance())
   {
   System.out.println("Transaction Done Succesfully ");
   account1.Withdraw(amount);
   account2.Deposit(amount);
   }
   else
     System.out.println("Not Enough Money!!!");
   
   }
  
   public static void main(String[] args) {
     
   Account account1=new Account(500, "Ahmet");
   Account account2=new Account(350, "Mehmet");
       System.out.println("Begininng\n*********************************");
       System.out.println(account1.toString());
       System.out.println(account2.toString());
       System.out.println("*********************************");
       
       transferMoney(account1, account2, 250);
       System.out.println("*********************************");
       System.out.println(account1.toString());
       System.out.println(account2.toString());
       System.out.println("*********************************");
       transferMoney(account1, account2, 700);
       System.out.println(account1.toString());
       System.out.println(account2.toString());
       System.out.println("*********************************");
}
}

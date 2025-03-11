public class BankAccount {
    public String accountNumber;
    protected String accountHolder;
    private double balance;

    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        if(this.balance >= amount) this.balance -= amount;
        else System.out.println("Insufficient Balance");
    }
}
 class SavingsAccount extends BankAccount {

     public SavingsAccount(String accountNumber, String accountHolder, double balance) {
         super(accountNumber, accountHolder, balance);
     }

     public static void main(String[] args) {
         SavingsAccount account1 = new SavingsAccount("12345", "Siddharth", 500);
         System.out.println("Account holder name is : " + account1.accountHolder);
         System.out.println("Account number is : " + account1.accountNumber);
         System.out.println("Depositing 400.50 Rupees" );
         account1.deposit(400.50);
         System.out.println("Withdrawing 197.50 Rupees");
         account1.withdraw(197.70);


     }
 }

//Account holder name is : Siddharth
//Account number is : 12345
//Depositing 400.50 Rupees
//Withdrawing 197.50 Rupees
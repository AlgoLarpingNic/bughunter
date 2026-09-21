/* Skriv en klasse til at håndtere bankkonti */

public class BankAccounting{
    private int id;
    private double balance;
    private String name;

    public BankAccounting(int id, double balance, String name){
        this.id = id;
        this.balance = balance;
        this.name = name;
    }
    public void withdraw(double amount) {
        balance -= amount;
    }

    public void deposit(double amount) {
        balance += amount;
    }

}
void main() {
    BankAccounting bankAccount1 = new BankAccounting (1, 1000, "Andreas");
    bankAccount1.withdraw(1200);
    bankAccount1.deposit(100);
    IO.println(bankAccount1.balance);
    if (bankAccount1.balance < 0){
        IO.println("Du er i overtræk med: " + bankAccount1.balance);

    }
}


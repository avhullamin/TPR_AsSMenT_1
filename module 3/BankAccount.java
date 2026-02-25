class BankAccount {
    private int accountNumber;
    private double balance;

    BankAccount(int acc, double bal) {
        accountNumber = acc;
        balance = bal;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if(balance >= amount) balance -= amount;
        else System.out.println("Insufficient balance");
    }

    public void display() {
        System.out.println("Account: " + accountNumber + ", Balance: " + balance);
    }

    public static void main(String args[]) {
        BankAccount b = new BankAccount(101, 5000);
        b.deposit(2000);
        b.withdraw(3000);
        b.display();
    }
}

public class Conta {
    private int accountNumber;
    private String accountHolder;
    private double valueInAccount;

    public Conta(int accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
    }
    public Conta(int accountNumber, String accountHolder, double initialDeposit) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        deposit(initialDeposit);
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getValueInAccount() {
        return valueInAccount;
    }

    public void deposit(double amount) {
        valueInAccount += amount;
    }

    public void withdraw(double  amount) {
        valueInAccount -= amount + 5.0;
    }

    public String toString() {
        return "Account "
                + accountNumber
                + ", Holder: "
                + accountHolder
                + ", Value: $"
                + String.format("%.2f",valueInAccount);
    }
}

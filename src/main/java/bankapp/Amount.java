package bankapp;

public class Amount {
    Double balance;

    public Amount(Double balance) {
        super();
        this.balance = balance;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Amount{" +
                "balance=" + balance +
                '}';
    }
}

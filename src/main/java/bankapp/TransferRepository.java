package bankapp;

public interface TransferRepository {
    void transfer(Account accountA, Account accountB, Amount amount);
}

package bankapp;

public interface AccountRepository {
    Account findByAccountId(long accountId);
}

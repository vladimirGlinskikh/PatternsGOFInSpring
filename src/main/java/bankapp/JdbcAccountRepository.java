package bankapp;

public class JdbcAccountRepository implements AccountRepository {
    @Override
    public Account findByAccountId(long accountId) {
        return new Account(accountId, "Vladimir Glinskikh", new Amount(3000.0));
    }
}

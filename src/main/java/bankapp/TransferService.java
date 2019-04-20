package bankapp;

public interface TransferService {
    void transferAmmount(Long a, Long b, Amount amount);
}

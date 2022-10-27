package atm.transaction;

public interface ATMManager {
    double depositInCash(int accountId, int amount);
    boolean withdrow( int accountId, int amount);
    boolean converter(double amount);
    boolean pay(double amount);
    boolean transfer(int accountId, int amount);
}

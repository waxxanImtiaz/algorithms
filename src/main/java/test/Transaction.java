package test;

public interface Transaction {
    void addMoney(DigitalWallet digitalWallet,int amount) throws TransactionException;
    void payMoney(DigitalWallet digitalWallet,int amount) throws TransactionException;
}

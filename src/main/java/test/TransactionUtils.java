package test;

public class TransactionUtils {
    public static void validateTransaction(final DigitalWallet digitalWallet, final int amount) throws TransactionException {
        validateUserAndAmount(digitalWallet, amount);
        if (digitalWallet.getWalletBalance() < amount) {
            throw new TransactionException("Insufficient balance", Status.INSUFFICIENT_BALANCE.name());
        }
    }

    public static  void validateUserAndAmount(final DigitalWallet digitalWallet, final int amount)
            throws TransactionException {
        if (digitalWallet.getUserAccessToken() == null || digitalWallet.getUserAccessToken().length() == 0)
            throw new TransactionException("User not authorized", Status.USER_NOT_AUTHORIZED.name());

        if (amount <= 0)
            throw new TransactionException("Amount should be greater than zero", Status.INVALID_AMOUNT.name());

    }
}

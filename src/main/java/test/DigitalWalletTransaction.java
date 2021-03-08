package test;

import com.sun.deploy.util.StringUtils;

import java.util.Arrays;
import java.util.List;
import java.util.Map;


public
class DigitalWalletTransaction implements Transaction {

    @Override
    public void addMoney(DigitalWallet digitalWallet, int amount) throws TransactionException {
        TransactionUtils.validateUserAndAmount(digitalWallet, amount);
        digitalWallet.setWalletBalance(digitalWallet.getWalletBalance() + amount );
    }

    @Override
    public void payMoney(DigitalWallet digitalWallet, int amount) throws TransactionException {
        TransactionUtils.validateTransaction(digitalWallet, amount);
        digitalWallet.setWalletBalance( digitalWallet.getWalletBalance() - amount);

    }
}

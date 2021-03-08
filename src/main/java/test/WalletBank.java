package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WalletBank {

    private List<DigitalWallet> wallets;

    private static WalletBank ourInstance = new WalletBank();

    public static WalletBank getInstance() {
        return ourInstance;
    }

    private WalletBank() {
        wallets = new ArrayList<>();
    }

    public List<DigitalWallet> getWallets() {
        return wallets;
    }
}

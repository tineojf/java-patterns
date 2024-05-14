package facade;

import java.util.ArrayList;

public class SSAccount {

    public SSAccount() {
    }

    public Account getAccount(ArrayList<Account> db, String dni) {
        for (Account ac : db) {
            if (ac.getDni().equals(dni)) {
                return ac;
            }
        }
        return null;
    }
}

package facade;

import java.util.ArrayList;

public class SSAuth {

    public SSAuth() {
    }

    public String validateUserPass(ArrayList<Account> db, String dni, String pass) {
        for (Account ac : db) {
            if (ac.getDni().equals(dni)) {
                return ac.getPass().equals(pass) ? "200" : "203";
            }
        }
        return "404";
    }
}

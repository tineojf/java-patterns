package facade;

import java.util.ArrayList;

public class Facade {
    private final ArrayList<Account> db = new ArrayList<>();
    private final SSAuth ssAuth;
    private final SSAccount ssAccount;
    private final SSATM ssATM;

    public Facade() {
        Account p1 = new Account("1", "1");
        Account p2 = new Account("2", "1");
        Account p3 = new Account("3", "1");
        p1.setMount(100.0);
        p2.setMount(50.0);
        p3.setMount(10.0);
        db.add(p1);
        db.add(p2);
        db.add(p3);

        this.ssAuth = new SSAuth();
        this.ssAccount = new SSAccount();
        this.ssATM = new SSATM();

    }

    public void doOperation(String dni, String pass, Double mount) {
        String codeAuth = ssAuth.validateUserPass(db, dni, pass);
        switch (codeAuth) {
            case "200":
                break;
            case "203":
                System.out.println("Error password");
                return;
            case "404":
                System.out.println("Account not found");
                return;
            default:
                System.out.println("Try again");
                return;
        }

        Account ac = ssAccount.getAccount(db, dni);
        if (ac == null) {
            System.out.println("Account not found");
            return;
        }

        String codeATM = ssATM.giveMoney(ac, mount);
        String finalMessage = codeATM.equals("200") ? "Retiro exitoso" : "Saldo insuficiente";

        System.out.println(finalMessage);
    }
}

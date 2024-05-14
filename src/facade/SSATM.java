package facade;

public class SSATM {
    public String giveMoney(Account ac, Double mount) {
        if (ac.getMount() >= mount) {
            ac.setMount(ac.getMount() - mount);
            return "200";
        }
        return "400";
    }
}

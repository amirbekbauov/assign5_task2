public class Subscriber {
    private String subscriberName;
    private String phoneNumber;
    private double accountBalance;
    private Tarif tarif;

    public Subscriber(String subscriberName, String phoneNumber, double accountBalance) {
        this.subscriberName = subscriberName;
        this.phoneNumber = phoneNumber;
        this.accountBalance = accountBalance;
    }

    public String getSubscriberName() {
        return subscriberName;
    }

    public void setSubscriberName(String subscriberName) {
        this.subscriberName = subscriberName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public Tarif getTariff() {
        return tarif;
    }

    public void setTarif(Tarif tarif) {
        this.tarif = tarif;
    }

    public void replenishAccount(double amount) {
        accountBalance += amount;
    }
}
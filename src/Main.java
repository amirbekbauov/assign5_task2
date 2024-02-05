
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        Company company1 = new Company("Company 1");
        Company company2 = new Company("Company 2");

        Tarif tarif1 = new Tarif("BEELINE");
        Tarif tarif2 = new Tarif("TELE2");

        Subscriber subscriber1 = new Subscriber("CRISTIANO RONALDO", "27865292", 55.0);
        Subscriber subscriber2 = new Subscriber("LIONEL MESSI", "92322322", 100.0);
        Subscriber subscriber3 = new Subscriber("ERLING HAALAND", "77220744", 25.0);

        company1.addTariff(tarif1);
        company2.addTariff(tarif2);

        tarif1.addSubscriber(subscriber1);
        tarif1.addSubscriber(subscriber2);
        tarif2.addSubscriber(subscriber3);


        System.out.println("Subscribers of Company 1:");
        for (Tarif tariff : company1.getTarifs()) {
            for (Subscriber subscriber : tariff.getSubscribers()) {
                System.out.println("Name: " + subscriber.getSubscriberName() +
                        ", Phone Number: " + subscriber.getPhoneNumber() +
                        ", Balance: " + subscriber.getAccountBalance());
            }
        }


        subscriber2.replenishAccount(20.0);


        System.out.println("\nAfter Replenishing the Account of Subscriber 2:   ");
        for (Tarif tariff : company1.getTarifs()) {
            for (Subscriber subscriber : tariff.getSubscribers()) {
                System.out.println("Name: " + subscriber.getSubscriberName() +
                        ", Phone Number: " + subscriber.getPhoneNumber() +
                        ", Balance: " + subscriber.getAccountBalance());
            }
        }


        String phoneNumberToSearch = "987654321";
        Subscriber foundSubscriber = company2.searchSubscriberByPhoneNumber(phoneNumberToSearch);

        if (foundSubscriber != null) {
            System.out.println("\nFound Subscriber:");
            System.out.println("Name: " + foundSubscriber.getSubscriberName() +
                    ", Tarif: " + foundSubscriber.getTariff().getTarifName());
        } else {
            System.out.println("\nSubscriber not found.");
        }
    }
}
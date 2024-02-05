import java.util.ArrayList;
import java.util.List;

public class Company {
    private String companyName;
    private List<Tarif> tarifs;

    public Company(String companyName) {
        this.companyName = companyName;
        this.tarifs = new ArrayList<>();
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public List<Tarif> getTarifs() {
        return tarifs;
    }

    public void addTariff(Tarif tarif) {
        tarifs.add(tarif);
        tarif.setCompany(this);
    }

    public Subscriber searchSubscriberByPhoneNumber(String phoneNumber) {
        for (Tarif tariff : tarifs) {
            for (Subscriber subscriber : tariff.getSubscribers()) {
                if (subscriber.getPhoneNumber().equals(phoneNumber)) {
                    return subscriber;
                }
            }
        }
        return null;
    }
}
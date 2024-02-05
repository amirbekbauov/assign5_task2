import java.util.ArrayList;
import java.util.List;

public class Tarif {
    private String tarifName;
    private Company company;
    private List<Subscriber> subscribers;

    public Tarif(String tarifName) {
        this.tarifName = tarifName;
        this.subscribers = new ArrayList<>();
    }

    public String getTarifName() {
        return tarifName;
    }

    public void setTariffName(String tarifName) {
        this.tarifName = tarifName;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public List<Subscriber> getSubscribers() {
        return subscribers;
    }

    public void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
        subscriber.setTarif(this);
    }

    public void removeSubscriber(Subscriber subscriber) {
        subscribers.remove(subscriber);
        subscriber.setTarif(null);
    }

    public int getNumberOfSubscribers() {
        return subscribers.size();
    }
}
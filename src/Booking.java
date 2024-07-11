import java.time.LocalDate;
import java.util.List;

public class Booking {
    private LocalDate bookingDate;
    private List<Pet> pets;
    private List<Service> services;
    private Client client;

    public Booking(LocalDate bookingDate, List<Pet> pets, List<Service> services, Client client) {
        this.bookingDate = bookingDate;
        this.pets = pets;
        this.services = services;
        this.client = client;
    }

    public LocalDate getBookingDate() {
        return bookingDate;
    }

    public List<Pet> getPets() {
        return pets;
    }

    public void setPets(List<Pet> pets) {
        this.pets = pets;
    }

    public List<Service> getServices() {
        return services;
    }

    public void setServices(List<Service> services) {
        this.services = services;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nBooking {");
        sb.append("\n  bookingDate = ").append(bookingDate);
        sb.append("\n  pets = ").append(pets);
        sb.append("\n  services = ").append(services);
        sb.append("\n  client = ").append(client.getName());
        sb.append("\n}");
        return sb.toString();
    }

}

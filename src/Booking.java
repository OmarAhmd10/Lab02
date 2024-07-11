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

    // Getters and Setters
    public LocalDate getBookingDate() { return bookingDate; }
    public void setBookingDate(LocalDate bookingDate) { this.bookingDate = bookingDate; }

    public List<Pet> getPets() { return pets; }
    public void setPets(List<Pet> pets) { this.pets = pets; }

    public List<Service> getServices() { return services; }
    public void setServices(List<Service> services) { this.services = services; }

    public Client getClient() { return client; }
    public void setClient(Client client) { this.client = client; }

    @Override
    public String toString() {
        return "Booking{" +
                "bookingDate=" + bookingDate +
                ", pets=" + pets +
                ", services=" + services +
                ", client=" + client +
                '}';
    }
}

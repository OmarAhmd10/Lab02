import java.util.List;

public class Client {
    private String name;
    private String phoneNumber;
    private String address;
    private List<Pet> pets;
    private List<Booking> bookings;

    public Client(String name, String phoneNumber, String address, List<Pet> pets, List<Booking> bookings) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.pets = pets;
        this.bookings = bookings;
    }

    // Getters and Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public List<Pet> getPets() { return pets; }
    public void setPets(List<Pet> pets) { this.pets = pets; }

    public List<Booking> getBookings() { return bookings; }
    public void setBookings(List<Booking> bookings) { this.bookings = bookings; }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                ", pets=" + (pets != null ? pets.size() : 0) +
                ", bookings=" + (bookings != null ? bookings.size() : 0) +
                '}';
    }
}


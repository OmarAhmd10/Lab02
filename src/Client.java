import java.util.List;

public class Client {
    private String name;
    private String phone;
    private String address;
    private List<Pet> pets;
    private List<Booking> bookings;

    public Client(String name, String phone, String address, List<Pet> pets, List<Booking> bookings) {
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.pets = pets;
        this.bookings = bookings;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public List<Pet> getPets() {
        return pets;
    }

    public List<Booking> getBookings() {
        return bookings;
    }

    @Override
    public String toString() {
        return "Client { name = '" + name + '\'' +
                ", phone = '" + phone + '\'' +
                ", address = '" + address + '\'' +
                '}';
    }
}

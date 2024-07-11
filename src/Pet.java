import java.util.List;

public class Pet {
    private String name;
    private String type;
    private int age;
    private String breed;
    private String status;
    private CareProfile careProfile;
    private Client owner;
    private List<Employee> assignedEmployees;
    private List<Booking> bookings;

    public Pet(String name, String type, int age, String breed, String status, CareProfile careProfile, Client owner, List<Employee> assignedEmployees, List<Booking> bookings) {
        this.name = name;
        this.type = type;
        this.age = age;
        this.breed = breed;
        this.status = status;
        this.careProfile = careProfile;
        this.owner = owner;
        this.assignedEmployees = assignedEmployees;
        this.bookings = bookings;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getAge() {
        return age;
    }

    public String getBreed() {
        return breed;
    }

    public String getStatus() {
        return status;
    }

    public CareProfile getCareProfile() {
        return careProfile;
    }

    public Client getOwner() {
        return owner;
    }

    public List<Employee> getAssignedEmployees() {
        return assignedEmployees;
    }

    public List<Booking> getBookings() {
        return bookings;
    }

    @Override
    public String toString() {
        return "Pet{ name = '" + name + "', type = '" + type + "', age = " + age + ", breed = '" + breed + "', status = '" + status + "', careProfile = " + careProfile + ", owner = " + owner + ", assignedEmployees = " + assignedEmployees + ", bookings = " + bookings + '}';
    } 
}

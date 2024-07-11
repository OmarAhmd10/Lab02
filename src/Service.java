import java.util.List;

public class Service {
    private String serviceName;
    private String description;
    private double price;
    private List<Pet> pets;
    private List<Employee> employees;

    public Service(String serviceName, String description, double price, List<Pet> pets, List<Employee> employees) {
        this.serviceName = serviceName;
        this.description = description;
        this.price = price;
        this.pets = pets;
        this.employees = employees;
    }

    // Getters and Setters
    public String getServiceName() { return serviceName; }
    public void setServiceName(String serviceName) { this.serviceName = serviceName; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public List<Pet> getPets() { return pets; }
    public void setPets(List<Pet> pets) { this.pets = pets; }

    public List<Employee> getEmployees() { return employees; }
    public void setEmployees(List<Employee> employees) { this.employees = employees; }

    @Override
    public String toString() {
        return "Service{" +
                "serviceName='" + serviceName + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", pets=" + pets +
                ", employees=" + employees +
                '}';
    }
}

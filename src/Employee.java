import java.util.List;

public class Employee {
    private String name;
    private String role;
    private String contactInformation;
    private List<Pet> assignedPets;
    private Employee manager;
    private List<Employee> subordinates;

    public Employee(String name, String role, String contactInformation, List<Pet> assignedPets, Employee manager, List<Employee> subordinates) {
        this.name = name;
        this.role = role;
        this.contactInformation = contactInformation;
        this.assignedPets = assignedPets;
        this.manager = manager;
        this.subordinates = subordinates;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public String getContactInformation() {
        return contactInformation;
    }

    public List<Pet> getAssignedPets() {
        return assignedPets;
    }

    public Employee getManager() {
        return manager;
    }

    public List<Employee> getSubordinates() {
        return subordinates;
    }

    @Override
    public String toString() {
        return "Employee { name = '" + name + "', role = '" + role + "', contactInformation = '" + contactInformation + "', assignedPets = " + assignedPets + ", manager = " + manager + ", subordinates = " + subordinates + '}';
    }
}

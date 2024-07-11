import java.util.List;

public class Employee {
    private String name;
    private String role;
    private String contactInfo;
    private List<Pet> assignedPets;

    public Employee(String name, String role, String contactInfo, List<Pet> assignedPets) {
        this.name = name;
        this.role = role;
        this.contactInfo = contactInfo;
        this.assignedPets = assignedPets;
    }

    // Getters and Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }

    public String getContactInfo() { return contactInfo; }
    public void setContactInfo(String contactInfo) { this.contactInfo = contactInfo; }

    public List<Pet> getAssignedPets() { return assignedPets; }
    public void setAssignedPets(List<Pet> assignedPets) { this.assignedPets = assignedPets; }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", role='" + role + '\'' +
                ", contactInfo='" + contactInfo + '\'' +
                ", assignedPets=" + (assignedPets != null ? assignedPets.size() : 0) +
                '}';
    }
}


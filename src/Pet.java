public class Pet {
    private String name;
    private String type;
    private int age;
    private String breed;
    private String condition;
    private CareProfile careProfile;

    public Pet(String name, String type, int age, String breed, String condition, CareProfile careProfile) {
        this.name = name;
        this.type = type;
        this.age = age;
        this.breed = breed;
        this.condition = condition;
        this.careProfile = careProfile;
    }

    // Getters and Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public String getBreed() { return breed; }
    public void setBreed(String breed) { this.breed = breed; }

    public String getCondition() { return condition; }
    public void setCondition(String condition) { this.condition = condition; }

    public CareProfile getCareProfile() { return careProfile; }
    public void setCareProfile(CareProfile careProfile) { this.careProfile = careProfile; }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", age=" + age +
                ", breed='" + breed + '\'' +
                ", condition='" + condition + '\'' +
                ", careProfile=" + (careProfile != null ? "exists" : "null") +
                '}';
    }
}


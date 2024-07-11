import java.util.List;

public class CareProfile {
    private Pet pet;
    private FeedingInstruction feedingInstruction;
    private List<MedicationInstruction> medicationInstructions;

    public CareProfile(Pet pet, FeedingInstruction feedingInstruction, List<MedicationInstruction> medicationInstructions) {
        this.pet = pet;
        this.feedingInstruction = feedingInstruction;
        this.medicationInstructions = medicationInstructions;
    }

    // Getters and Setters
    public Pet getPet() { return pet; }
    public void setPet(Pet pet) { this.pet = pet; }

    public FeedingInstruction getFeedingInstruction() { return feedingInstruction; }
    public void setFeedingInstruction(FeedingInstruction feedingInstruction) { this.feedingInstruction = feedingInstruction; }

    public List<MedicationInstruction> getMedicationInstructions() { return medicationInstructions; }
    public void setMedicationInstructions(List<MedicationInstruction> medicationInstructions) { this.medicationInstructions = medicationInstructions; }

    @Override
    public String toString() {
        return "CareProfile{" +
                "pet=" + (pet != null ? pet.getName() : "null") +
                ", feedingInstruction=" + feedingInstruction +
                ", medicationInstructions=" + (medicationInstructions != null ? medicationInstructions.size() : 0) +
                '}';
    }
}

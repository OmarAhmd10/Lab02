public class CareProfile {
    private String feedingInstructions;
    private String medicationList;
    private String medicationInstructions;

    public CareProfile(String feedingInstructions, String medicationList, String medicationInstructions) {
        this.feedingInstructions = feedingInstructions;
        this.medicationList = medicationList;
        this.medicationInstructions = medicationInstructions;
    }

    public String getFeedingInstructions() {
        return feedingInstructions;
    }

    public String getMedicationList() {
        return medicationList;
    }

    public String getMedicationInstructions() {
        return medicationInstructions;
    }

    @Override
    public String toString() {
        return "CareProfile { feedingInstructions = '" + feedingInstructions + "', medicationList = '" + medicationList + "', medicationInstructions = '" + medicationInstructions + "'}";
    } 
}

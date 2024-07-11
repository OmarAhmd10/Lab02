public class MedicationInstruction {
    private Medication medication;
    private String dosage;
    private String applicationMethod;
    private String schedule;

    public MedicationInstruction(Medication medication, String dosage, String applicationMethod, String schedule) {
        this.medication = medication;
        this.dosage = dosage;
        this.applicationMethod = applicationMethod;
        this.schedule = schedule;
    }

    // Getters and Setters
    public Medication getMedication() { return medication; }
    public void setMedication(Medication medication) { this.medication = medication; }

    public String getDosage() { return dosage; }
    public void setDosage(String dosage) { this.dosage = dosage; }

    public String getApplicationMethod() { return applicationMethod; }
    public void setApplicationMethod(String applicationMethod) { this.applicationMethod = applicationMethod; }

    public String getSchedule() { return schedule; }
    public void setSchedule(String schedule) { this.schedule = schedule; }

    @Override
    public String toString() {
        return "MedicationInstruction{" +
                "medication=" + medication +
                ", dosage='" + dosage + '\'' +
                ", applicationMethod='" + applicationMethod + '\'' +
                ", schedule='" + schedule + '\'' +
                '}';
    }
}


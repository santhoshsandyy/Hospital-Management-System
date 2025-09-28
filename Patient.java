public class Patient extends Person {
    private static int counter = 1;
    private int patientId;
    private String bloodGroup;

    public Patient(String name, int age, String gender, String bloodGroup) {
        super(name, age, gender);
        this.bloodGroup = bloodGroup;
        this.patientId = counter++;
    }

    public int getPatientId() { return patientId; }
    public String getBloodGroup() { return bloodGroup; }

    @Override
    public String toString() {
        return "PatientID: " + patientId + " | " + super.toString() + " | Blood Group: " + bloodGroup;
    }
}

public class Doctor extends Person {
    private static int counter = 1;
    private int doctorId;
    private String specialization;

    public Doctor(String name, int age, String gender, String specialization) {
        super(name, age, gender);
        this.specialization = specialization;
        this.doctorId = counter++;
    }

    public int getDoctorId() { return doctorId; }
    public String getSpecialization() { return specialization; }

    @Override
    public String toString() {
        return "DoctorID: " + doctorId + " | " + super.toString() + " | Specialization: " + specialization;
    }
}

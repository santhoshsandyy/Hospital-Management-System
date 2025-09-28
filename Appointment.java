public class Appointment {
    private static int counter = 1;
    private int appointmentId;
    private Doctor doctor;
    private Patient patient;
    private String dateTime;

    public Appointment(Doctor doctor, Patient patient, String dateTime) {
        this.doctor = doctor;
        this.patient = patient;
        this.dateTime = dateTime;
        this.appointmentId = counter++;
    }

    @Override
    public String toString() {
        return "AppointmentID: " + appointmentId +
               " | Patient: " + patient.getName() +
               " | Doctor: " + doctor.getName() +
               " | Date/Time: " + dateTime;
    }
}

import java.util.*;

public class HospitalService {
    private List<Doctor> doctors = new ArrayList<>();
    private List<Patient> patients = new ArrayList<>();
    private List<Appointment> appointments = new ArrayList<>();

    // Add doctor
    public Doctor addDoctor(String name, int age, String gender, String specialization) {
        Doctor d = new Doctor(name, age, gender, specialization);
        doctors.add(d);
        return d;
    }

    // Add patient
    public Patient addPatient(String name, int age, String gender, String bloodGroup) {
        Patient p = new Patient(name, age, gender, bloodGroup);
        patients.add(p);
        return p;
    }

    // Book appointment
    public Appointment bookAppointment(Doctor doctor, Patient patient, String dateTime) {
        Appointment a = new Appointment(doctor, patient, dateTime);
        appointments.add(a);
        return a;
    }

    // Show all doctors
    public void showDoctors() {
        doctors.forEach(System.out::println);
    }

    // Show all patients
    public void showPatients() {
        patients.forEach(System.out::println);
    }

    // Show all appointments
    public void showAppointments() {
        appointments.forEach(System.out::println);
    }

    // Search doctor by specialization
    public void searchDoctorBySpecialization(String specialization) {
        System.out.println("\n🔍 Doctors specialized in " + specialization + ":");
        doctors.stream()
               .filter(d -> d.getSpecialization().equalsIgnoreCase(specialization))
               .forEach(System.out::println);
    }

    // Search patient by name
    public void searchPatientByName(String name) {
        System.out.println("\n🔍 Searching patient: " + name);
        patients.stream()
                .filter(p -> p.getName().equalsIgnoreCase(name))
                .forEach(System.out::println);
    }
}

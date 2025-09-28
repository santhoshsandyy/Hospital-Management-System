public class Main {
    public static void main(String[] args) {
        HospitalService service = new HospitalService();

        // Add Doctors
        Doctor d1 = service.addDoctor("Dr. Meera", 45, "F", "Cardiologist");
        Doctor d2 = service.addDoctor("Dr. Arjun", 50, "M", "Orthopedic");

        // Add Patients
        Patient p1 = service.addPatient("Reshma", 21, "F", "O+");
        Patient p2 = service.addPatient("Kiran", 32, "M", "A+");

        // Book Appointments
        service.bookAppointment(d1, p1, "2025-08-20 10:00 AM");
        service.bookAppointment(d2, p2, "2025-08-21 11:30 AM");

        System.out.println("\n===== 🏥 Hospital Management System Report =====");
        System.out.println("\n--- Doctors ---");
        service.showDoctors();

        System.out.println("\n--- Patients ---");
        service.showPatients();

        System.out.println("\n--- Appointments ---");
        service.showAppointments();

        // Search examples
        service.searchDoctorBySpecialization("Cardiologist");
        service.searchPatientByName("Reshma");

        System.out.println("\n===== ✅ End of Report =====");
    }
}

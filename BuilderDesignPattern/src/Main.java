public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        PatientBuilder builder = new PatientBuilder();
        Patient patient =builder.setPatientId(111).setAddress("Medha, jaoli").setFirstName("Bhiku").setLastName("Shinde").build();
        System.out.println(patient.toString());
    }
}
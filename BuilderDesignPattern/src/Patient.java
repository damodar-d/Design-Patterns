public class Patient {
    int patientId;
    String firstName;
    String lastName;
    String address;
    char gender;
    String referredByDoctor;
    String day;

   public Patient( PatientBuilder builder){
       this.patientId = builder.getPatientId();
       this.firstName = builder.getFirstName();
       this.lastName = builder.getLastName();
       this.address = builder.getAddress();
       this.gender = builder.getGender();
       this.referredByDoctor = builder.getReferredByDoctor();
       this.day = builder.getDay();
   }

    @Override
    public String toString() {
        return "Patient{" +
                "patientId=" + patientId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", gender=" + gender +
                ", referredByDoctor='" + referredByDoctor + '\'' +
                ", day='" + day + '\'' +
                '}';
    }
}

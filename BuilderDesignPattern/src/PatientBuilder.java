public class PatientBuilder {
    int patientId;
    String firstName;
    String lastName;
    String address;
    char gender;
    String referredByDoctor;
    String day;

    public int getPatientId() {
        return patientId;
    }

    public PatientBuilder setPatientId(int patientId) {
        this.patientId = patientId;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public PatientBuilder setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public PatientBuilder setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public PatientBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public char getGender() {
        return gender;
    }

    public PatientBuilder setGender(char gender) {
        this.gender = gender;
        return this;
    }

    public String getReferredByDoctor() {
        return referredByDoctor;
    }

    public PatientBuilder setReferredByDoctor(String referredByDoctor) {
        this.referredByDoctor = referredByDoctor;
        return this;
    }

    public String getDay() {
        return day;
    }

    public PatientBuilder setDay(String day) {
        this.day = day;
        return this;
    }

    public Patient build(){
        return new Patient(this);
    }
}

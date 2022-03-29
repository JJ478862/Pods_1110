package Lab6;

public class GeneralPractitioner extends Doctor {
    String practiceName;
    String address;

    public GeneralPractitioner(String fullName, String registruNumber, String specialty, String practiceName, String address) {
        super(fullName, registruNumber, specialty);
        this.practiceName = practiceName;
        this.address = address;
    }


    @Override
    public String toString() {
        return super.toString() + ", Practice: " + practiceName;
    }
}

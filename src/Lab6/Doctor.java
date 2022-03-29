package Lab6;


public class Doctor {

    private String fullName;
    private String registruNumber;
    private String specialty;


    public Doctor(String fullName, String registruNumber, String specialty) {
        this.fullName = fullName;
        this.registruNumber = registruNumber;
        this.specialty = specialty;
    }

    public String getName() {
        String[] temp;
        String delimiters = " ";
        temp = fullName.split(delimiters);
        return temp[1];
    }

    public String getRegistruNumber() {
        return registruNumber;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setName(String Name) {
        String[] temp;
        String delimiters = " ";
        temp = fullName.split(delimiters);
        temp[1] = Name;
    }


    public boolean equals(Doctor doctor){
        return this.registruNumber.equals(doctor.registruNumber);
    }

    @Override
    public String toString() {
        return "Dr. "+ fullName + ", Specialty: " + specialty;
    }
}

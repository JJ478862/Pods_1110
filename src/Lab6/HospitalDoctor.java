package Lab6;

public class HospitalDoctor extends Doctor{
    String staffNumber;
    String pagerNumber;


    public HospitalDoctor(String fullName, String registruNumber, String specialty, String staffNumber,String pagerNumber) {
        super(fullName, registruNumber, specialty);
        this.staffNumber = staffNumber;
        this.pagerNumber = pagerNumber;
    }

    @Override
    public String toString() {
        return super.toString()+ ", Pager: "+pagerNumber;
    }


}

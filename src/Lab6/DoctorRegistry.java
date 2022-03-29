package Lab6;

import java.util.ArrayList;

public class DoctorRegistry implements Cloneable{
    private String province;
    private final ArrayList<Doctor> doctors = new ArrayList<>();
    private boolean checker = true;
    private int num;

    public DoctorRegistry(int num,String province) {
        this.province = province;
        this.num = num;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public boolean register(Doctor doctor){

        for (Doctor doctor1 : doctors) {
            if (doctor.equals(doctor1)){
                checker = false;
            }
        }

        if (checker){
            doctors.add(doctor);
        }

        return checker;
    }

    public boolean deRegister(String registryNumber){

        boolean checker2 = false;
        for (Doctor doctor : doctors) {
            if (doctor.getRegistruNumber().equals(registryNumber)){
                doctor = null;
                checker2 =true;
            }
        }
        return checker2;
    }

    public ArrayList<Doctor> getDoctorList() {
        return doctors;
    }
}

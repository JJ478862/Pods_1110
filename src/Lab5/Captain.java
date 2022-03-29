package Lab5;

import java.util.Objects;

public class Captain {
    private final int age;
    private final String name;
    private final int yearsOfExperience;
    private final int registryNumber;

    public Captain(int age, String name, int yearsOfExperience, int registryNumber) {
        this.age = age;
        this.name = name;
        this.yearsOfExperience = yearsOfExperience;
        this.registryNumber = registryNumber;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public boolean equals(Captain captain){
        boolean checker = false;
        if (Objects.equals(captain.name, this.name) && Objects.equals(captain.registryNumber, this.registryNumber)){
            checker=true;
        }
        return checker;
    }

    @Override
    public String toString() {
        return name + ", age: " + age +"\n"+
                "YoE: " + yearsOfExperience +"\n"+
                "Registry: " + registryNumber;

    }

}

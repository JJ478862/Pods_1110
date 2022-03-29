package P04.Q3;

public class Car implements Comparable{
    private String make;
    private String model;
    private String licensePlate;

    /***
     * Creates new car objects.
     * @param make the make of the car
     * @param model the car's model
     * @param licensePlate the unique license plate;
     */
    public Car(String make, String model, String licensePlate)
    {
        this.make = make;
        this.model = model;
        this.licensePlate = licensePlate;
    }

    /***
     * getter method for the licensePlace
     * @return the car's license plate
     */
    public String getLicensePlate()
    {
        return licensePlate;
    }

    @Override
    public String toString() {
        return String.format("Model: %s, Make: %s", model, make);
    }

    @Override
    public int hashCode() {
        return licensePlate.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        Car p = (Car)obj;
        if(licensePlate.equals(p.licensePlate))
            return true;
        return false;


    }

    @Override
    public int compareTo(Object o) {
        Car car = (Car)o;
        if(car.licensePlate.compareTo(licensePlate)>0)
            return 1;
        else if(car.licensePlate.compareTo(licensePlate)<0)
            return -1;
        return 0;
    }
}
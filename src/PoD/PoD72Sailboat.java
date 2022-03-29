package PoD;

public class PoD72Sailboat {
    private String boatName;
    private static int count;
    private int dockSpace;


    public PoD72Sailboat(String boatName) {
        this.boatName = boatName;
        count += 1;
        dockSpace =count;
    }

    @Override
    public String toString() {
        return boatName + " is at dock space " +dockSpace;
    }
}

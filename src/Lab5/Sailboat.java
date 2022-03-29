package Lab5;

import java.util.Objects;

public class Sailboat {
    private final int size;
    private final String name;
    private final String model;
    private Captain captain=null;

    public Sailboat(int size, String name, String model) {
        this.size = size;
        this.name = name;
        this.model = model;
    }

    public boolean assignCaptain(Captain captain){
        boolean checker = false;
        if (this.captain==null){
            this.captain = captain;
            checker = true;
        }
        if (this.captain.getAge()<captain.getAge()){
            this.captain = captain;
            checker = true;
        }
        return checker;
    }

    public Captain getCaptain() {
        return captain;
    }

    public boolean equals(Sailboat sailboat){
        boolean checker = false;
        if (Objects.equals(sailboat.name, this.name) && Objects.equals(sailboat.captain, this.captain)){
            checker=true;
        }
        return checker;
    }

    @Override
    public String toString() {
        StringBuilder p = new StringBuilder();
        String r = null;
        if (captain==null){
            p.append(name).append(" is a ").append(size).append(" feet ").append(model).append(" sailboat with no captain =/");
            r = String.valueOf(p);
        }
        else {
            p.append(name).append(" is a ").append(size).append(" feet ").append(model).append(" sailboat;").append(" her captain is: ").append(captain.getName());
            r = String.valueOf(p);
        }
        return r;
    }
}

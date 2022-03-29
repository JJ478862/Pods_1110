package P04.Q3;

import java.util.List;
import java.util.ListIterator;

public class P3 {
    public static void main(String[] args) {
        List<Car> fleet = new P1().getCollection();

        ListIterator<Car> listIterator = fleet.listIterator(0);

        // Implement your code below

        while (listIterator.hasNext()) {
            Car car = listIterator.next();
            System.out.println(car.toString());
        }

    }

}

}
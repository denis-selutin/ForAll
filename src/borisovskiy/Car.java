package borisovskiy;

import java.io.Serializable;

public class Car extends Transport implements Serializable {
    public Car(String name, int number, double mileage, boolean isTankFull) {
        super(name, number, mileage, isTankFull);
    }
}

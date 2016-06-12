package ForAll.src.mironov;

import java.io.*;

public class Car implements Serializable {
    private final String name;
    private final int number;
    private transient final double mileage;
    private transient final boolean isFullTank;

    public Car(String name, int number, double mileage, boolean isFullTank) {
        this.name = name;
        this.number = number;
        this.mileage = mileage;
        this.isFullTank = isFullTank;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public double getMileage() {
        return mileage;
    }

    public boolean isFullTank() {
        return isFullTank;
    }
}
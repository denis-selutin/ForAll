package ForAll.src.mironov;

import java.io.*;

public class CarExtern implements Externalizable {
    private String name;
    private int number;
    private transient double mileage;
    private transient boolean isFullTank;

    public CarExtern(String name, int number, double mileage, boolean isFullTank) {
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

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(name);
        out.writeObject(number);
        out.writeObject(mileage);
        out.writeObject(isFullTank);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        name = (String) in.readObject();
        number = (int) in.readObject();
        mileage = (double) in.readObject();
        isFullTank = (boolean) in.readObject();
    }

    public CarExtern() {
    }
}
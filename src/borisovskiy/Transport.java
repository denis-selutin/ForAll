package borisovskiy;

public class Transport {

    private String name;
    private int number;
    private transient double mileage;
    private transient boolean isTankFull;

    public Transport() {
    }

    public Transport(String name, int number, double mileage, boolean isTankFull) {
        this.name = name;
        this.number = number;
        this.mileage = mileage;
        this.isTankFull = isTankFull;
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

    public boolean isTankFull() {
        return isTankFull;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public void setIsTankFull(boolean tankFull) {
        isTankFull = tankFull;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "name='" + name + '\'' +
                ", number=" + number +
                ", mileage=" + mileage +
                ", isTankFull=" + isTankFull +
                '}';
    }

}

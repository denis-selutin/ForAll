package borisovskiy;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class CarExtern extends Transport implements Externalizable {

    public CarExtern(String name, int number, double mileage, boolean isTankFull) {
        super(name, number, mileage, isTankFull);
    }

    public CarExtern() {
//        super();
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(super.getName());
        out.writeObject(super.getNumber());
        out.writeObject(super.getMileage());
        out.writeObject(super.isTankFull());
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        super.setName((String) in.readObject());
        super.setNumber((int) in.readObject());
        super.setMileage((double) in.readObject());
        super.setIsTankFull((boolean) in.readObject());
    }


}

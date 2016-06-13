package vadimslatin;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class CarExt implements Externalizable{
	private String carModel;  
	private String carNumber; 
	private transient int km;
	private transient String transmission;
	
	public CarExt() {}
	
	public CarExt(String carModel, String carNumber, int km, String transmission) {
		this.carModel = carModel;
		this.carNumber = carNumber;
		this.km = km;
		this.transmission = transmission;
	}
	
	public String getCarModel() { return carModel; }
		
	public String getCarNumber() { return carNumber; }
	
	public int getKm() { return km; }
	
	public String getTransmission() { return transmission; }
	
	public void cardesc() {
		System.out.println("Модель: "+getCarModel()
		+"\nНомер: "+getCarNumber()
		+"\nПробег: "+getKm()
		+"\nТипКПП: "+getTransmission());
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(carModel);
        out.writeObject(carNumber);
        out.writeObject(km);
        out.writeObject(transmission);		
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		carModel = (String) in.readObject();
		carNumber = (String) in.readObject();
		km = (int) in.readObject();
		transmission = (String) in.readObject();
	}

}

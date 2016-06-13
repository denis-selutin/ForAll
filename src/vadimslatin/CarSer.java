package vadimslatin;

import java.io.Serializable;

public class CarSer implements Serializable {
	private String carModel;  
	private String carNumber; 
	private transient final int km;
	private transient final String transmission;
	
	public CarSer(String carModel, String carNumber, int km, String transmission) {
		super();
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
	
}

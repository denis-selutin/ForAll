package vadimslatin;

import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		System.out.println("Создаем машинку 1: ");
		CarSer car1 = new CarSer("Ford","XA123AX",30000,"Manual");
		car1.cardesc();
		
		System.out.println("\nСохраняем объект Serializable...");
		ObjectOutputStream oos1 = new ObjectOutputStream(new FileOutputStream(new File("fileSer.ser")));
        oos1.writeObject(car1);
        oos1.close();
        
        System.out.println("\nВосстановливаем объект(только два первых поля): ");
        ObjectInputStream ois1 = new ObjectInputStream(new FileInputStream(new File("fileSer.ser")));
        CarSer FromFile1 = (CarSer)ois1.readObject();
        FromFile1.cardesc();
        ois1.close();
        
        System.out.println("\n---------------------\nСоздаем машинку 2: ");
        ObjectOutputStream oos2 = new ObjectOutputStream(new FileOutputStream(new File("fileEx.ser")));
        CarExt car2 = new CarExt("Opel","XA111AX",40000,"Automatic");
        car2.cardesc();
        
        System.out.println("\nСохраняем объект Externalizable...");
        car2.writeExternal(oos2);
        oos2.close();
        
        System.out.println("\nВосстановливаем объект: ");
        ObjectInputStream ois2 = new ObjectInputStream(new FileInputStream(new File("fileEx.ser")));
        CarExt FromFile2 = new CarExt();
        FromFile2.readExternal(ois2);
        FromFile2.cardesc();
                
	}
}

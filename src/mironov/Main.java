package ForAll.src.mironov;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Car car = new Car("OPEL", 12345, 4500, true);
        System.out.println("Before serialization");
        print(car);
        ObjectOutputStream writer = new ObjectOutputStream(new FileOutputStream(new File("/Car.txt")));
        writer.writeObject(car);
        writer.close();

        ObjectInputStream reader = new ObjectInputStream(new FileInputStream("/Car.txt"));
        Car desCar = (Car) reader.readObject();
        System.out.println("\nAfter deserialization");
        print(desCar);


        CarExtern carExtern = new CarExtern("OPEL", 12345, 4500, true);
        System.out.println("Before serialization");
        print(carExtern);
        ObjectOutputStream writerExtern = new ObjectOutputStream(new FileOutputStream(new File("/CarExtern.txt")));
        writerExtern.writeObject(carExtern);
        writerExtern.close();

        ObjectInputStream readerExtern = new ObjectInputStream(new FileInputStream("/CarExtern.txt"));
        CarExtern desCarExtern = (CarExtern) readerExtern.readObject();
        System.out.println("\nAfter deserialization");
        print(desCarExtern);
    }

    private static void print(Car car) {
        System.out.println("Name:\t\t\t" + car.getName() + "\nNumber:\t\t\t" + car.getNumber() + "\nMileage:\t\t" + car.getMileage() + "\nEnough fuel: \t" + car.isFullTank());
    }

    private static void print(CarExtern car) {
        System.out.println("Name:\t\t\t" + car.getName() + "\nNumber:\t\t\t" + car.getNumber() + "\nMileage:\t\t" + car.getMileage() + "\nEnough fuel: \t" + car.isFullTank());
    }
}
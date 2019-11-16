package borisovskiy;

import java.io.*;

public class Main {
    private static final String PATH = "C:\\Java_General\\Java_Lections_SourceIT\\tasks\\ionio\\Car.txt";
    private static final String PATH_EXTERNALIZATION = "C:\\Java_General\\Java_Lections_SourceIT\\tasks\\ionio\\CarExtern.txt";

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Car car = new Car("BMW", 12345, 55300, true);
        System.out.println("-----Before serialization-----");
        print(car);
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(PATH))) {
            out.writeObject(car);
        }
        System.out.println("-----After deserialization-----");
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(PATH))) {
            Car desCar = (Car) in.readObject();
            print(desCar);
        }

        System.out.println("-----Before serialization with EXTERNALIZATION-----");
        CarExtern carExtern = new CarExtern("Audi", 335566, 12900, false);
        print(carExtern);
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(PATH_EXTERNALIZATION))) {
            out.writeObject(carExtern);
        }

        System.out.println("-----After serialization with EXTERNALIZATION-----");
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(PATH_EXTERNALIZATION))) {
            CarExtern desCarExtern = (CarExtern) in.readObject();
            print(desCarExtern);
        }
    }

    private static void print(Car car) {
        System.out.println(car);
    }

    private static void print(CarExtern car) {
        System.out.println(car);
    }

}

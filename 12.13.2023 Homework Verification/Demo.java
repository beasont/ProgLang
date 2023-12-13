package verif3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


class Vehicle implements Serializable {
    private String Model, Producer;
    private int ProductionYear;
    private static final long serialVersionUID = -4592211204831552115L;
    
    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public int getProductionYear() {
        return ProductionYear;
    }

    public void setProductionYear(int productionYear) {
        ProductionYear = productionYear;
    }

    public String getProducer() {
        return Producer;
    }

    public void setProducer(String producer) {
        Producer = producer;
    }

}

class Car extends Vehicle {
    private int FuelCapacity;
    private float C02;
    private String NCAP;
    private static final long serialVersionUID = 2148717506675874818L;

    public int getFuelCapacity() {
        return FuelCapacity;
    }

    public void setFuelCapacity(int fuelCapacity) {
        FuelCapacity = fuelCapacity;
    }

    public String getNCAP() {
        return NCAP;
    }

    public void setNCAP(String nCAP) {
        NCAP = nCAP;
    }

    public float getC02() {
        return C02;
    }

    public void setC02(float c02) {
        C02 = c02;
    }
    
    @Override
    public String toString() {
        return "Car{" +
                "Model='" + getModel() + '\'' +
                ", Producer='" + getProducer() + '\'' +
                ", ProductionYear=" + getProductionYear() +
                ", FuelCapacity=" + getFuelCapacity() +
                ", C02=" + getC02() +
                ", NCAP='" + getNCAP() + '\'' +
                '}';
    }
}

public class Demo {

    public static void main(String[] args) {

        Car car = new Car();

        car.setModel("2024 Camaro");
        car.setProducer("Chevrolet");
        car.setProductionYear(2024);
        car.setFuelCapacity(72);
        car.setC02(42.8f);
        car.setNCAP("5 Stars");

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Cars.txt"))) {
            oos.writeObject(car);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Cars.txt"))) {
            Car deserializedCar = (Car) ois.readObject();
            System.out.println(deserializedCar);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

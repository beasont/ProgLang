package exercise2;

public class Vehicle {
    public static void main(String[] args) {
        Car car1 = new Car("BMW", 5, "Gasoline", "Black");
        Car car2 = new Car();
        car2.setType("Mercedes");
        car2.setNo_seats(4);
        car2.setFuel("Diesel");
        car2.setBody_color("White");

        System.out.println("Car 1: Type: " + car1.getType() + ", No. of seats: " + car1.getNo_seats() + ", Fuel: " + car1.getFuel() + ", Body color: " + car1.getBody_color());
        System.out.println("Car 2: Type: " + car2.getType() + ", No. of seats: " + car2.getNo_seats() + ", Fuel: " + car2.getFuel() + ", Body color: " + car2.getBody_color());

        spec(car1);
        spec(car2);

        if (car1.getNo_seats() > car2.getNo_seats()) {
            System.out.println("Car 1 has more passenger seats.");
            
        } else if (car1.getNo_seats() < car2.getNo_seats()) {
            System.out.println("Car 2 has more passenger seats.");
            
        } else {
            System.out.println("Both cars have the same number of passenger seats.");
        }
    }

    static void spec(Car c) {
        System.out.println(c.getType() + ": Type: " + c.getType() + ", No. of seats: " + c.getNo_seats() + ", Fuel: " + c.getFuel() + ", Body color: " + c.getBody_color());
    }
}

class Car {
    private String type;
    private int no_seats;
    private String fuel;
    private String body_color;

    public Car() {
        type = "";
        no_seats = 0;
        fuel = "";
        body_color = "";
    }

    public Car(String type, int no_seats, String fuel, String body_color) {
        this.type = type;
        this.no_seats = no_seats;
        this.fuel = fuel;
        this.body_color = body_color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNo_seats() {
        return no_seats;
    }

    public void setNo_seats(int no_seats) {
        this.no_seats = no_seats;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public String getBody_color() {
        return body_color;
    }

    public void setBody_color(String body_color) {
        this.body_color = body_color;
    }
}

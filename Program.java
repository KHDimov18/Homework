import java.util.ArrayList;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Car car1 = new Car("Mercedes", "Gt63s", 2020, 300, 20);
        Car car2 = new Car("Audi", "Rs7", 2021, 200, 15);
        Car car3 = new Car("Bmw", "M5cs", 2021, 100, 17);
        Car car4 = new Car("Bugatti", "Chiron", 2020, 200, 40);
        Car[] cars = new Car[]{car1, car2, car3, car4};


        Scanner sc = new Scanner(System.in);

        System.out.println("Garage:");

        Garage garage = new Garage();
        garage.addCar(car1);
        garage.addCar(car2);
        garage.addCar(car3);
        garage.addCar(car4);

        garage.removeCar(car3);
        garage.showGarage();

        System.out.println(garage.getCount());

    }
}

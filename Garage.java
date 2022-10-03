import java.util.ArrayList;

public class Garage {
    private ArrayList<Car> cars;
    public Garage() {
        cars = new ArrayList<Car>();
    }
    public void addCar(Car car) {
        cars.add(car);
    }
    public int getCount() {
        return cars.size();
    }
    public void removeCar(Car car)
    {
        cars.remove(car);
    }
    public void showGarage() {
        for(Car car : cars) {
            System.out.println(car);
        }
    }

}

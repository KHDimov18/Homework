public class Car {
    private String brand;
    private String model;
    private int year;
    private int fuelQuantity;
    private int fuelConsumption;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getFuelQuantity() {
        return fuelQuantity;
    }

    public void setFuelQuantity(int fuelQuantity) {
        this.fuelQuantity = fuelQuantity;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public Car(String brand, String model, int year, int fuelQuantity, int fuelConsumption) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.fuelQuantity = fuelQuantity;
        this.fuelConsumption = fuelConsumption;
    }

    @Override
    public String toString() {
        return "Car: " +
                "brand:" + brand +
                ", model:" + model +
                ", year:" + year +
                ", fuelQuantity:" + fuelQuantity +
                ", fuelConsumption:" + fuelConsumption;
    }
}

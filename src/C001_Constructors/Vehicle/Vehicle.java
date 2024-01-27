package C001_Constructors.Vehicle;

public class Vehicle {
    private String brand;
    private String model;
    private int km;
    private double engineVolume;
    private boolean automatic;

    public Vehicle() {
    }

    public Vehicle(String brand, String model, int km, double engineVolume, boolean automatic) {
        this.brand = brand;
        this.model = model;
        this.km = km;
        this.engineVolume = engineVolume;
        this.automatic = automatic;
    }

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

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public boolean isAutomatic() {
        return automatic;
    }

    public void setAutomatic(boolean automatic) {
        this.automatic = automatic;
    }

    @Override
    public String toString() {
        return "VehicleRunner;" +
                "\nbrand='" + brand + '\'' +
                "\nmodel='" + model + '\'' +
                "\nkm=" + km +
                "\nengineVolume=" + engineVolume +
                "\nautomatic=" + automatic;
    }
}

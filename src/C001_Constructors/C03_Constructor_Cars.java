package C001_Constructors;

public class C03_Constructor_Cars {
    String brand;
    String model;
    int km;
    double engineVolume;
    boolean automatic;
    boolean secondHand;

    public static void main(String[] args) {
        C03_Constructor_Cars car01;
        car01 = new C03_Constructor_Cars();
        car01.brand = "Volvo";
        car01.model = "S80";
        car01.km = 24000;
        car01.engineVolume = 2.0;
        car01.automatic = true;
        car01.secondHand = true;

//        System.out.println(car01.brand);
//        System.out.println(car01.model);
//        System.out.println(car01.km);
//        System.out.println(car01.engineVolume);
//        System.out.println(car01.automatic);
//        System.out.println(car01.secondHand);

        System.out.println(car01);


        C03_Constructor_Cars car02 = new C03_Constructor_Cars();
        car02.brand = "Nissan";
        car02.model = "Maxima";
        car02.km = 12000;
        car02.engineVolume = 1.8;
        car02.automatic = false;
        car02.secondHand = false;

        System.out.println(car02);

        C03_Constructor_Cars car03 = new C03_Constructor_Cars();
        car03.brand = "Toyota";
        car03.model = "Corolla";
        car03.km = 15000;
        car03.engineVolume = 1.6;
        car03.automatic = true;
        car03.secondHand = false;

        System.out.println(car03);


    }

    @Override
    public String toString() {
        return brand + " " + model + " " + km + " " + engineVolume + " " + automatic + " " + secondHand;
    }
}

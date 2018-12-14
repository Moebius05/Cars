public abstract class Car{

    public static String getGear;
    private String gear;
    private String brand;

    public Car(String gear, String brand) {
        this.gear = gear;
        this.brand = brand;
    }

    public abstract String drive();

    protected String getGear() {
        return gear;
    }

    protected String getBrand() {
        return brand;
    }


}
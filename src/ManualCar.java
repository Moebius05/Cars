public class ManualCar extends Car {
    public ManualCar(String gear, String brand) {
        super(gear, brand);
    }

    @Override
    public String drive() {
        return "I love this " + getGear() + getBrand();
    }
}

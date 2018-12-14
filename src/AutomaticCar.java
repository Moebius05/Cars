public class AutomaticCar extends Car {
    public AutomaticCar(String gear, String brand) {
        super(gear, brand);
    }

    @Override
    public String drive() {
        return "I love this " + getGear() + getBrand();
    }
}

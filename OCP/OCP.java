public class OCP {
    public static void main(String[] args) {
        Car ferrari = new Car(300, "major");
        Bus yellowBus = new Bus(140, "school");
        System.out.println(ferrari.calculateAllowedSpeed());
        System.out.println(yellowBus.calculateAllowedSpeed());
    }
}


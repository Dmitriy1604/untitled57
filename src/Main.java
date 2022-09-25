public class Main {
    public static void main(String[] args) {
        Car car = new Car("Ларгус", 4);
        Truck truck = new Truck("Белаз", 8);
        Bicycle bicycle = new Bicycle("Хака",2);


        ServiceStation station = new ServiceStation();
        station.check(car);
        System.out.println();
        station.check(bicycle);
        System.out.println();
        station.check(truck);

    }
}
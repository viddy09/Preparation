package Prototype;

public class Client {

    public static void fillRegistry(CarRegistry registry){
        Car car = new Car();
        car.setName("Alto");
        car.setType("SUV");
        registry.register(car.getName(), car);
        //System.out.println(registry.get(car.getName()+"-"+car.getType()).getType());
    }
    public static void main(String[] args) {
        CarRegistry carRegistry = new CarRegistry();
        fillRegistry(carRegistry);

        Car car = carRegistry.getEntry("Alto").clone();
        car.setModelNumber("123");
        car.setColor("Yellow");
        System.out.println(car.getName());
    }
}

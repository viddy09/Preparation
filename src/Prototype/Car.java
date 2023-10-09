package Prototype;

public class Car implements Prototype<Car>{
    private String name;
    private String type;
    private String color;
    private String modelNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }
    Car(){

    }

    Car(Car car){
        this.name=car.name;
        this.color=car.color;
        this.type=car.type;
        this.modelNumber=car.modelNumber;
    }

    @Override
    public Car clone(){
        return new Car(this);
    }

}

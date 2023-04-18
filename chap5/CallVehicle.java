package chap5;

public class CallVehicle {

    public static void main(String[] args) {
        Car car = new Car();
        Car c= new Car();
        car.color = "black";
        car.brand = "TOYOTA";
        car.size = "medium";
        System.out.println("--attribute--");
        System.out.println("Color : "+car.color);
        System.out.println("Brand : "+car.brand);
        System.out.println("Size : "+car.size);
        System.out.println("Car : Size > "+c.size);        
        System.out.println("--method--");
        car.start();
        car.stop();
        car.move();
        car.pause();
        System.out.print("Car : move() = ");
        c.move();
    }
}

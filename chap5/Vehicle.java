package chap5;

public class Vehicle {

    protected String color;
    protected String brand;
    protected String size;

    void start() {
        System.out.println("start()");
    }

    void stop() {
        System.out.println("stop()");
    }

    void pause() {
        System.out.println("pause()");
    }

    void move() {
        System.out.println("move()");
    }
}//end Vehicle

class Car extends Vehicle {
    String series;
    String size = "super";
    void changeGear(){ 
       System.out.println("changeGear()"); 
    }

    @Override
    void move() {
        System.out.println("drive on the road"); 
    }
    
}//end Car

class Boat extends Vehicle {
}//end Boat

class Plane extends Vehicle {
}//end Plane

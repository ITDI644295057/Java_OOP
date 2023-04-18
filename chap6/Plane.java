package chap6;

public abstract class Plane {
    void takeoff(){
        System.out.println("Plane : takeoff");
    }
    void landing(){
        System.out.println("Plane : landing");
    }
    abstract void fly(); //แมททอด1อันไม่สมบูรณ์ ใส่หน้าคลาสด้วย
}//end

class Boeing extends Plane{
    @Override
    void fly() {
        System.out.println("Boeing : fly()");
    }
    
}

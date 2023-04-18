package chap3;

public class CallCircle {

    public static void main(String[] args) {
        // create Circle object
        Circle cl = new Circle(3.9);

        // call non-static variable
        System.out.println("Radius : " + cl.getRadius());

        // call non-static methods
        System.out.println("Area : " + cl.computeArea());
        System.out.println("Circumference : " + cl.computeCircumference());
        System.out.println("Diameter : " + cl.computeDiameter());
    }
}

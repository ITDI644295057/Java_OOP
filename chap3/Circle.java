package chap3;

public class Circle {
    private  double radius;
    public Circle(double rad) {
        radius = rad;
    }

    public double getRadius() {
        return radius;
    }

    public double computeArea() {
        return Math.ceil(Math.PI * Math.pow(radius, 2));
    }

    public double computeCircumference() {
        return Math.ceil(2 * Math.PI * radius);
    }

    public double computeDiameter() {
        return 2 * radius;
    }
}//end

package chap5;

public class LivingThing {

    protected String name = "LivingThing";

    public void grow() {
        System.out.println("LivingThing : grow");
    }

    public void reproduce() {
        System.out.println("LivingThing : reproduce");
    }
}//end LivingThing

class Animal extends LivingThing {

    private String color;
    protected int leg;

    public void move() {

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {

    }
}//end Animal

class Plant extends LivingThing {
}//end Plant

class Dog extends Animal {

    protected int leg = 4;
    
    public void bark() {
        System.out.println("Dog : bark");
    }

    @Override
    public void move() {
        super.move();
        System.out.println("Dog : move");
    }

}//end Dog

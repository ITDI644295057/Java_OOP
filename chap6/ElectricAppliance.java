package chap6;

public abstract class  ElectricAppliance {
    public abstract void on();
    public abstract void off();
    public abstract void work();
}//end


abstract class Fan1 extends ElectricAppliance{
    @Override
    public void on() {
        System.out.println("Fan1 : on");
    }

    @Override
    public void off() {
        System.out.println("Fan1 : off");
    }   
}//end Fan1


class Fan2 extends Fan1{
    @Override
    public void work() {
        System.out.println("Fan2 : work");
    }   
}//end Fan2
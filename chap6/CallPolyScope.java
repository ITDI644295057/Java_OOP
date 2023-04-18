package chap6;

public class CallPolyScope  {
    public static void main(String[] args) {
        Boat st = new Submarine();
        ((Submarine)st).move();//วิธี 1
        Submarine sm = (Submarine)st;//วิธี 2
        sm.move();
    }
}//end

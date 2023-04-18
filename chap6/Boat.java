package chap6;

public class Boat {
    String owner = "someone";
    void showOwner(){
        System.out.println("Boat : owner = "+owner);
    }
}//end

class Rowboat extends Boat{
    String owner = "Joey";

    @Override
    void showOwner() {
        System.out.println("Boat : owner = "+owner);
    }
    
    
}
package chap6;

public class CallPoly {
    static void printBoatOwner(Boat boatOject){
        boatOject.showOwner();
    }
    
    public static void main(String[] args) {
        Boat bt = new Boat();
        printBoatOwner(bt);
        Boat rt = new Rowboat();
        printBoatOwner(rt);
    }
}//end

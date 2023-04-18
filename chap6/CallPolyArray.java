package chap6;

public class CallPolyArray {

    static void printBoatOwner(Boat boatOject[]) {
        for (int i = 0; i < boatOject.length; i++) {
            boatOject[i].showOwner();
        }
    }

    public static void main(String[] args) {
        Boat bt[] = new Boat[2];
        bt[0] = new Boat();
        bt[1] = new Rowboat();
        printBoatOwner(bt);

    }
}//end

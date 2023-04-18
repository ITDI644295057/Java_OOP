package chap6;

public class HotelBooking extends Payment implements Booking{
    private String name;
    private String address;
    private String telephone;

    @Override
    public void printReceipt() {
        System.out.println("printReceipt()");
    }

    @Override
    public boolean cancelBooking(int id){
        System.out.println("cancelBooking(id)");
        return true;
    }

    @Override
    public void newBooking() {
        System.out.println("newBooking() ");
    }

    @Override
    public boolean updateBooking(int id) {
        System.out.println("updateBooking(id)");
        return true;
    }
    
    public String getName(){
        System.out.println("getName()");
        return "getName";
    }
    
}//end HotelBooking

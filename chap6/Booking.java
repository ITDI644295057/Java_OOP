package chap6;

public interface Booking {
  public boolean cancelBooking(int id);
  public void newBooking();
  public boolean updateBooking(int id);
}//end Booking

abstract class Payment {
    abstract public void printReceipt();
}//end Payment
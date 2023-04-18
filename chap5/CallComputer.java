package chap5;

public class CallComputer {
    public static void main(String[] args) {
        Computer com = new Computer();
        com.setCasee(new Case(" Tower "));
        com.setMonitor(new Monitor(" 19 inch"));
        System.out.println("Case > "+com.getCasee());
        System.out.println("Monitor > "+com.getMonitor());
    }
}

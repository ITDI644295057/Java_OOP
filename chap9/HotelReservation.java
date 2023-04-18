package chap9;

import java.util.Scanner;

public class HotelReservation {

    public static void main(String[] args) {
        String resuit = "";
        int price = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ID : ");
        String id = sc.next();
        System.out.print("Enter Name : ");
        String name = sc.next();
        System.out.print("Enter Surname : ");
        String surname = sc.next();
        System.out.print("Enter Room Type : ");
        String roomType = sc.next();
        System.out.print("Enter Period : ");
        String period = sc.next();
        System.out.print("Enter Days : ");
        int days = sc.nextInt();

        if (roomType.equals("Superior")) {
            resuit = "Superior";
            if (period.equals("Weekday(Sun-Thu)")) {
                price = 2090;
            } else if (period.equals("Weekend(Fri-Sat)")) {
                price = 2490;
            } else {//LongWeekend
                price = 3390;
            }
        } else if (roomType.equals("Deluxe")) {
            resuit = "Deluxe";
            if (period.equals("Weekday(Sun-Thu)")) {
                price = 2290;
            } else if (period.equals("Weekend(Fri-Sat)")) {
                price = 2790;
            } else {//LongWeekend
                price = 3690;
            }
        } else if (roomType.equals("GrandDeluxe")) {
            resuit = "Grand Deluxe";
            if (period.equals("Weekday(Sun-Thu)")) {
                price = 3890;
            } else if (period.equals("Weekend(Fri-Sat)")) {
                price = 4490;
            } else {//LongWeekend
                price = 5390;
            }
        } else if (roomType.equals("JuniorSuit")) {
            resuit = "Junior Suit";
            if (period.equals("Weekday(Sun-Thu)")) {
                price = 3190;
            } else if (period.equals("Weekend(Fri-Sat)")) {
                price = 3890;
            } else {//LongWeekend
                price = 4790;
            }
        } else if (roomType.equals("FamilyJuniorSuit")) {
            resuit = "Family Junior Suit";
            if (period.equals("Weekday(Sun-Thu)")) {
                price = 3990;
            } else if (period.equals("Weekend(Fri-Sat)")) {
                price = 4690;
            } else {//LongWeekend
                price = 5690;
            }
        } else if (roomType.equals("GrandFamilySuite")) {
            resuit = "Grand Family Suite";
            if (period.equals("Weekday(Sun-Thu)")) {
                price = 4690;
            } else if (period.equals("Weekend(Fri-Sat)")) {
                price = 5590;
            } else {//LongWeekend
                price = 6490;
            }
        } else {
            resuit = "No Room Type";
        }

        System.out.println("รหัสลูกค้า : " + id);
        System.out.println("ชื่อ : " + name);
        System.out.println("นามสกุล : " + surname);
        System.out.println("ประเภทห้องพัก : " + resuit);
        System.out.println("ช่วงที่เข้าพัก : " + period);
        System.out.println("จำนวนวัน : " + days + " วัน");
        System.out.println("ราคารวม : " + (price * days) + " บาท");
    }

}//end

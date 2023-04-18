package chap9;

import java.util.Scanner;

public class EmployeeBonus {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ID : ");
        String id = sc.next();
        System.out.print("Enter Name : ");
        String name = sc.next();
        System.out.print("Enter Surname : ");
        String surname = sc.next();
        System.out.print("Enter Position Type : ");
        int type = sc.nextInt();
        System.out.print("Enter Salary : ");
        double salary = sc.nextDouble();
        System.out.println("-------------------------------------------");
        System.out.println("ID : " + id);
        System.out.println("Name : " + name);
        System.out.println("Surname : " + surname);
        System.out.println("Position : " + positionName(type));
        System.out.println("Salary : " + (int)salary);
        System.out.println("Bonus : " + (int)calculateBonus(type, salary) + " baht");

    }//end method main

    public static String positionName(int num) {
        //method เปลี่ยนตัวเลขเป็นชื่อตำแหน่ง รับค่าตำแหน่ง / คืนค่าชื่อตำแหน่ง    
        String position = "";
        switch (num) {
            case 1:
                position = "Manager";
                break;
            case 2:
                position = "Assistant Manager";
                break;
            case 3:
                position = "General";
                break;
            default:
                position = "No Position";
        }
        return position;
    }

    public static double calculateBonus(int posi, double sala) {
        //method คำนวณโบนัส รับค่าตำแหน่งและเงินดือน / คืนค่าโบนัส
        double bonus = 0;
        double salary = sala;
        switch (posi) {
            case 1:
                if (salary < 10000) {
                    bonus = salary * 0.05;
                }
                if (salary >= 10000) {
                    bonus = salary * 0.10;
                }
                break;
            case 2:
                if (salary < 10000) {
                    bonus = salary * 0.15;
                }
                if (salary >= 10000) {
                    bonus = salary * 0.20;
                }
                break;
            case 3:
                if (salary < 10000) {
                    bonus = salary * 0.25;
                }
                if (salary >= 10000) {
                    bonus = salary * 0.30;
                }
                break;
            default:
                bonus = 0;
        }
        return bonus;
    }

}//end class


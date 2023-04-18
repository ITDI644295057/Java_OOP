package chap4;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeBonus {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menu = 0;
        ArrayList<Employee> list = new ArrayList<Employee>();
        do {
            printMenu();
            System.out.print("Please Enter Menu [0-2] : ");
            menu = sc.nextInt();
            switch (menu) {
                case 1:
                    Employee em = new Employee();
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
                    em.setId(id);
                    em.setName(name);
                    em.setSurname(surname);
                    em.setPosition(type);
                    em.setSalary(salary);
                    list.add(em);
                    break;
                case 2:
                    double salaryTotal = 0;
                    double bonusTotal = 0;
                    System.out.println("Show Data");
                    for (Employee emp : list) {
                        System.out.print("ID : " + emp.getId() + "\t");
                        System.out.print("Name : " + emp.getName() + "\t");
                        System.out.print("Surname : " + emp.getSurname() + "\t");
                        System.out.print("Position : " + positionName(emp.getPosition()) + "\t");
                        System.out.print("Salary : " + emp.getSalary() + "\t");
                        salaryTotal = salaryTotal + emp.getSalary();
                        System.out.print("Bonus : " + calculateBonus(emp.getPosition(), emp.getSalary()) + " baht");
                        bonusTotal = bonusTotal + calculateBonus(emp.getPosition(), emp.getSalary());
                        System.out.println("");
                    }//end for_ecah
                    System.out.println("Summary");
                    System.out.println("Employee Count : " + list.size());
                    System.out.println("Salary Total : " + (int) salaryTotal + " baht");
                    System.out.println("Bonus Total : " + (int) bonusTotal + " baht");
                    break;
                default:
                    if (menu != 0) {
                        System.out.println("\n--> Enter the new menu again. <--");
                    }
            }//end switch-case
            System.out.println("");
        } while (menu != 0);
    }//end method main

    public static void printMenu() {
        System.out.println("-------- Menu --------");
        System.out.println("0 : Exit");
        System.out.println("1 : Employee Information Entry");
        System.out.println("2 : Employee Summary");
        System.out.println("----------------------");
    }

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


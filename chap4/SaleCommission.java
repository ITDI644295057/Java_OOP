package chap4;

import java.util.ArrayList;
import java.util.Scanner;

public class SaleCommission {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menu = 0;
        ArrayList<Salesperson> list = new ArrayList<Salesperson>();
        do {
            printMenu();
            System.out.print("Please Enter Menu [0-2] : ");
            menu = sc.nextInt();
            switch (menu) {
                case 1:
                    Salesperson sp = new Salesperson();
                    System.out.print("Enter ID : ");
                    String id = sc.next();
                    System.out.print("Enter Name : ");
                    String name = sc.next();
                    System.out.print("Enter Surname : ");
                    String surname = sc.next();
                    System.out.print("Enter Sale Class : ");
                    int saleClass = sc.nextInt();
                    System.out.print("Enter Sale Total : ");
                    double saleTotal = sc.nextDouble();
                    sp.setId(id);
                    sp.setName(name);
                    sp.setSurname(surname);
                    sp.setSaleClass(saleClass);
                    sp.setSaleTotal(saleTotal);
                    list.add(sp);
                    break;
                case 2:
                    double commis = 0;
                    double commisTotal = 0;
                    double sumSaleTotal = 0;
                    System.out.println("Show Data");
                    for (Salesperson sale : list) {
                        System.out.print("ID : " + sale.getId() + "\t");
                        System.out.print("Name : " + sale.getName() + "\t");
                        System.out.print("Surname : " + sale.getSurname() + "\t");
                        System.out.print("Sale Class : " + sale.getSaleClass() + "\t");
                        System.out.print("Sale Total : " + (int) sale.getSaleTotal() + " baht" + "\t");
                        sumSaleTotal = sumSaleTotal + sale.getSaleTotal();
                        commis = calculateCommission(sale.getSaleClass(), sale.getSaleTotal());
                        commisTotal = commisTotal + commis;
                        System.out.print("Commission : " + (int) commis + " baht" + "\t");
                        System.out.println("");
                    }//end for_ecah
                    System.out.println("Summary");
                    System.out.println("Sale Count : " + list.size());
                    System.out.println("Sale Total : " + (int) sumSaleTotal + " baht");
                    System.out.println("Commission Total : " + (int) commisTotal + " baht");
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
        System.out.println("1 : Sale Information Entry");
        System.out.println("2 : Commission Summary");
        System.out.println("----------------------");
    }

    public static double calculateCommission(int salesNum, double salesSum) {
        //method คำนวณ Commission รับค่า Sale Class และ Sale Total / คืนค่า Commission
        double commis = 0;
        double salesTotal = salesSum;
        switch (salesNum) {
            case 1:
                if (salesTotal < 10000) {
                    commis = salesTotal * 0.05;
                }
                if (salesTotal >= 10000) {
                    commis = salesTotal * 0.10;
                }
                break;
            case 2:
                if (salesTotal < 10000) {
                    commis = salesTotal * 0.15;
                }
                if (salesTotal >= 10000) {
                    commis = salesTotal * 0.20;
                }
                break;
            case 3:
                if (salesTotal < 10000) {
                    commis = salesTotal * 0.25;
                }
                if (salesTotal >= 10000) {
                    commis = salesTotal * 0.30;
                }
                break;
            default:
                commis = 0;
        }
        return commis;
    }

}//end

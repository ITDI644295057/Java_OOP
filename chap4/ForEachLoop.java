package chap4;

import chap3.Employee;
import java.util.Arrays;

public class ForEachLoop {

    public static void main(String[] args) {
        int[] numArr = {22, 11, 33, 44, 55, 66, 99, 88, 77};
        System.out.print("Data in numarr = ");
        Arrays.sort(numArr);
        for (int num : numArr) {
            System.out.print(num + "\t");
        }
        System.out.print("\nData in strArr = ");
        String[] strArr = {"Jenny", "John", "Nadia", "Lisa", "David"};
        Arrays.sort(strArr);
        for (String name : strArr) {
            System.out.print(name + "\t");
        }
        System.out.println("\n\nMin = " + numArr[0]);
        System.out.println("Max = " + numArr[numArr.length - 1]);
        System.out.println("Size = " + numArr.length);

        //สร้าง 1 object
        Employee em = new Employee("1001", "Panuwat", "IT", 30000);

        Employee emArr[] = {
            new Employee("1002", "Kengi", "IT", 50000),
            new Employee("1003", "Ken", "IT", 30000)
        };
        for (Employee myEmp : emArr) {
            System.out.print("\n");
            System.out.println("ID : " + myEmp.getEmpId());
            System.out.println("Name : " + myEmp.getEmpName());
            System.out.println("Department : " + myEmp.getDepartment());
            System.out.println("Salary : " + myEmp.getSalary());
        }
    }

}//end

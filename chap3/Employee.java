package chap3;

public class Employee {

    private String empId;
    private String empName;
    private String department;
    private double salary;

    public Employee(String empId, String empName, String department, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.department = department;
        this.salary = salary;
    }
    
    public String getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void showEmployeeDetails() {
        System.out.println("empId : " + empId);
        System.out.println("empName : " + empName);
        System.out.println("department : " + department);
        System.out.println("salary : " + salary);
    }

    public double computeBonus() {
        double bonus = salary * 0.05;
        return bonus;

    }
}//end

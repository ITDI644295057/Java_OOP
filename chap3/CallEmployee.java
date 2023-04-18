package chap3;

public class CallEmployee {

    public static void main(String[] args) {
        //new emp object
        Employee emp = new Employee("1001", "Panuwat", "IT", 30000);
        emp.setEmpId("1001");
        emp.setEmpName("panuwat");
        emp.setDepartment("IT");
        emp.setSalary(35000.00);
        System.out.println("Id : "+emp.getEmpId());
        System.out.println("Name : "+emp.getEmpName());
        System.out.println("Department : "+emp.getDepartment());
        System.out.println("Salary : "+emp.getSalary());       
    }
}//end

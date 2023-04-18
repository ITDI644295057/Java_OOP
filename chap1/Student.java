package chap1;

public class Student {

    protected String studentId;
    protected String studentName;
    protected String faculty;
    protected String major;

   
    public Student() {
        System.out.println("Default Con");
    }

    public Student(String studentId, String studentName, String faculty, String major) {
        System.out.println("Overloading Con");
        this.studentId = studentId;
        this.studentName = studentName;
        this.faculty = faculty;
        this.major = major;
    }


    public void enrollment(String studentId) {
        System.out.println("enrollment");
    }

    public void payment(String studentId) {
        System.out.println("Mon-payment-package");
    }

    public void addCourse(String studentId) {
        System.out.println("addCourse");
    }

    public void dropCourse(String studentId) {
        System.out.println("dropCourse");
    }
    
   void print(){
         //print
        System.out.println("id : "+studentId);   
        System.out.println("name : "+studentName); 
        System.out.println("fac : "+faculty); 
        System.out.println("major : "+major); 
    }

}//end

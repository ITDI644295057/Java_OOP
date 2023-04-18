package chap1;

public class CallStudent {

    public static void main(String[] args) {
        Student panu = new Student();
        panu.studentId = "644295057";
        panu.studentName = "panuwat";
        panu.faculty = "science";
        panu.major = "infromation technology";
        panu.print();
        //overloading
        Student panuOver = new Student("101", "Panuwat Jantong", "Sci", "IT");
        panuOver.print();
        //overloading friend
        Student chaOver = new Student("644295050", "Darutnee Over", "Sci", "IT");
        chaOver.print();
        
        //print
//        System.out.println("id : "+panu.studentId);   
//        System.out.println("name : "+panu.studentName); 
//        System.out.println("fac : "+panu.faculty); 
//        System.out.println("major : "+panu.major); 

//        panu.enrollment("644295057");
//        panu.payment("644295057");
//        System.out.println("panu object = "+panu);
    

//        GraduateStudent ken = new GraduateStudent();
//        ken.studentId = "644295000";
//        ken.studentName = "kengi";
//        ken.studyLevel = "Master Degree";
   
//        ken.oraExamination("studentId");
//        ken.addCourse("0981514997");
//        System.out.println("ken object = "+ken);
//        ken.payment("644295057");
    }
}

package chap1;

public class GraduateStudent extends Student{

    public String studyLevel;
    public String thesisAdviser;

    public void oraExamination(String studentId) {
        System.out.println("oralExamination");
    }

    public void thesisExamination(String studentId) {
        System.out.println("thesisExamination");
    }
    
    public void payment(String studentId) {
        System.out.println("Son-payment-credit");
    }
    
}//end

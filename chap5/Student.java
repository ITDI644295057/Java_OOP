package chap5;

public class Student {

    private String studentId;
    private String studentName;
    private Counsellor counsellor;
    private Parent parent;

    public Student(String studentId, String studentName, Counsellor counsellor, Parent parent) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.counsellor = counsellor;
        this.parent = parent;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Counsellor getCounsellor() {
        return counsellor;
    }

    public void setCounsellor(Counsellor counsellor) {
        this.counsellor = counsellor;
    }

    public Parent getParent() {
        return parent;
    }

    public void setParent(Parent parent) {
        this.parent = parent;
    }

    public void printDetails() {
        System.out.println("StudentId : " + getStudentId());
        System.out.println("StudentName : " + getStudentName());
        System.out.println("Counsellor id : " + getCounsellor().getCounsellorId());
        System.out.println("Counsellor name : " + getCounsellor().getCounsellorName());
        System.out.println("Telephone : " + getCounsellor().getTelephoneNo());
        System.out.println("Parent name : " + getParent().getParentName());
        System.out.println("Address : " + getParent().getAddress());
        System.out.println("Telephone : " + getParent().getTelephoneNo());
    }
}//end

package chap3;

public class PassByReferenceExample {

    static void changeGirlReference(Girl girl) {
        girl.phoneNo = "0981514997";
        System.out.println("At girl"+girl);
    }

    public static void main(String[] args) {
        System.out.println("Before");
        Girl gl = new Girl("panuwat", "14523355141");
        System.out.println("BF gl"+gl);
        gl.print();
        System.err.println("After");
        changeGirlReference(gl);
        gl.print();
    }
}//end

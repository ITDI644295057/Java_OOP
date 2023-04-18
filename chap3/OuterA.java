package chap3;

public class OuterA {

    int outAtt1 = 5;
    static int outAtt2 = 10;

    void outMethod1() {
        System.out.println("outerA : outMethod1");
    }

    static void outMethod2() {
        System.out.println("outerA : outMethod2");
    }

    static class StaticInner {

        int inAtt1 = 5;
        static int inAtt2 = 10;

        void inMethod1() {
            System.out.println("StaticInner : inMethod1");
        }

        static void inMethod2() {
            System.out.println("StaticInner : inMethod2");
        }
    }//end StaticInner
}//end

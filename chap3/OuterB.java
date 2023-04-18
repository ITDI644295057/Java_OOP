package chap3;

public class OuterB {

    int outAtt1 = 5;
    static int outAtt2 = 10;

    void outMethod1() {
        System.out.println("outerA : outMethod1");
    }

    static void outMethod2() {
        System.out.println("outerA : outMethod2");
    }

    class MemberInner {//ห้ามเป็น static

        int inAtt1 = 5;

        void inMethod1() {
            System.out.println("StaticInner : inMethod1");
        }
    }
}//end

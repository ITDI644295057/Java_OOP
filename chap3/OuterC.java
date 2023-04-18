package chap3;

public class OuterC {

    int outAtt1 = 5;
    static int outAtt2 = 10;

    void outMethod1() {
        System.out.println("outerA : outMethod1");
    }

    static void outMethod2() {
        System.out.println("outerA : outMethod2");
    }
    
    void outMethod3(){
        class myLocalInner{
           void showDetails(){
               System.out.println("showDetails()");
           } 
        }//LocalInner
        new myLocalInner().showDetails();
    }//end Method
    
    void outMethod4(){
        class LocalInner{
           void showDetails(){
               System.out.println("showDetails()");
           } 
        }//LocalInner
        new LocalInner().showDetails();
    }//end Method
}

package chap6;

public class ExceptionHanding {
    public static void main(String[] args) {
        int zero = 100;
        int result = 0;
        
        try {
            result = 123/zero;    
        } catch (NullPointerException e) {
            System.out.println("หารด้วย 0 ไม่ได้ครับ"+e.getMessage());
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());        
        }

        try {
            Boat bb = null;
            bb = new Boat();
            bb.showOwner(); 
        } catch (NullPointerException e) {
            System.out.println("Error : "+e.getMessage());
        }
        
        int x[]={1,2};
        System.out.println("x[0] = "+x[0] );
        System.out.println("x[0] = "+x[1] );
        try {
            System.out.println("x[0] = "+x[2] );
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error index to = "+e.getMessage());
        }
        
        
        System.out.println("bye...");
    }     
}//end

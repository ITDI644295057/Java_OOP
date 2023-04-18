package chap6;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionHanding2 {
    
    static void readFile() throws FileNotFoundException{
        FileReader fr = new FileReader("");
//        try {
//           FileReader fr = new FileReader("");
//        } catch (FileNotFoundException e) {
//            
//        }
        
    }
    public static void main(String[] args) {
        try {
            readFile(); 
        } catch (FileNotFoundException e) {
            System.out.println("หาไฟล์ไม่เจอครับ");
        }
       
    }
}//end

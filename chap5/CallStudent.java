package chap5;

public class CallStudent {
    public static void main(String[] args) {
      Student st = new Student("644295057", "Panuwat Jantong",
              new Counsellor("189", "Dinat Lamsub", "0895998038"), 
              new Parent("Somphol Jantong", "16 Moo 2 Deeluang  Satingphra Songkhla 90190", "0927844289"));
      st.printDetails();
    }
}//end

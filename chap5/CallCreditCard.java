package chap5;

public class CallCreditCard {
    public static void main(String[] args) {
        CreditCard cd = CreditCard.createCard(20999);
        System.out.println("Object : "+cd);
        CreditCard cd1 = CreditCard.createCard(15000);
        System.out.println("Object : "+cd1);

    }
}//end

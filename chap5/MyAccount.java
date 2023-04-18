package chap5;

public class MyAccount {

    public static void main(String[] args) {
//        BankAccount bank = new BankAccount(1001, "panuwat jantong", 1000);
//        bank.printDetails();        
//        //ฝากเงิน
//        bank.deposit(500);
//        bank.printDetails();
//        //ถอนเงิน
//        bank.withdraw(200);
//        bank.printDetails();

        SavingAccount sv = new SavingAccount(1002, "Nalinee Inthamano", 100);
        System.out.println("--------------------SavingAccount--------------------");
        sv.deposit(400);
        sv.printDetails();
        System.out.println("");
        sv.withdraw(490);
        sv.printDetails();

        FixedDepositAccount fda = new FixedDepositAccount(644295057, "Panuwat Jantong", 10000);
        System.out.println("\n-----------------FixedDepositAccount-----------------");
        fda.deposit(190);
        fda.printDetails();
        System.out.println("");
        fda.withdraw(999);
        fda.printDetails();
    }
    
}//end MyAccount

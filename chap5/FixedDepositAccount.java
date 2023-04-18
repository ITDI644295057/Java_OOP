package chap5;

public class FixedDepositAccount extends BankAccount {

    public FixedDepositAccount(int accountNo, String accountName, double balance) {
        super(accountNo, accountName, balance);
    }

    @Override
    public void deposit(double amount) {
        System.out.println("ฝากเงิน : " + amount + " บาท");
        double depositResult = getBalance() + amount;
        if (amount >= 500) {
            setBalance(depositResult);
        } else {
            System.out.println("...................");
            System.out.println("ไม่สามารถฝากเงินได้ครับ ขอบคุณครับ");
            System.out.println("...................");
        }
    }

}//end FixedDepositAccount

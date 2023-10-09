package Adapter;

public interface BankAPI {

    double getBalance(String accNum);

    String sendMoney(String fromAcc, String toAcc, double money);
}

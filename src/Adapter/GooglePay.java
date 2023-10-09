package Adapter;

public class GooglePay {
    private BankAPI bankAPI;

    GooglePay(BankAPI bankAPI){
        this.bankAPI = bankAPI;
    }

    public void doSomething() throws InterruptedException{
        double balance = bankAPI.getBalance("1");
        System.out.println(balance);
    }
}

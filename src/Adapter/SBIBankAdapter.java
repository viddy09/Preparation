package Adapter;

import Adapter.thirdparty.SBIBankAPi;

public class SBIBankAdapter implements BankAPI{
    private SBIBankAPi sbiBankAPi = new SBIBankAPi();

    @Override
    public double getBalance(String accNum) {
        return this.sbiBankAPi.retrieveBalance(accNum);
    }

    @Override
    public String sendMoney(String fromAcc, String toAcc, double money) {
        try{
            return this.sbiBankAPi.moneyTransfer(fromAcc, toAcc, money);
        }
        catch(Exception ex) {
            return (String) ex.getMessage();
        }
    }
}

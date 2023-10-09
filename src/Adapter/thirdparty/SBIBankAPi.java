package Adapter.thirdparty;

import javax.management.InvalidAttributeValueException;

public class SBIBankAPi {

    public double retrieveBalance(String accNum){
        return 0.0;
    }

    public String moneyTransfer(String fromAcc, String toAcc, double money){
        if(this.retrieveBalance(fromAcc) < money){
            throw new IllegalArgumentException("Money is not sufficient");
        }
        else{
            return "Money is transferred successfully!!!";
        }
    }
}

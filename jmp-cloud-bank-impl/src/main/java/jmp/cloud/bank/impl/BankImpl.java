package jmp.cloud.bank.impl;
import jmp.bank.api.BankInterface;
import jmp.dto.*;

public class BankImpl implements BankInterface {
    @Override
    public BankCard createBankCard(User user, BankCardType bankCardType) {
        BankCard bankCard = new BankCard();
        if (bankCardType.equals(BankCardType.CREDIT)) {
            bankCard = new CreditBankCard();
        } else if(bankCardType.equals(BankCardType.DEBIT)){
            bankCard = new DeditBankCard();
        }
        return bankCard;
    }
}

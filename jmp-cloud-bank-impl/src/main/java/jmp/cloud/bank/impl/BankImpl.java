package jmp.cloud.bank.impl;
import jmp.bank.api.BankInterface;
import jmp.dto.*;

import java.time.LocalDate;

public class BankImpl implements BankInterface {
    @Override
    public BankCard createBankCard(User user, BankCardType bankCardType) {
        BankCard bankCard = new BankCard("default", new User("default", "default", LocalDate.of(2000, 1, 1)));
        if (bankCardType.equals(BankCardType.CREDIT)) {
            bankCard = new CreditBankCard();
        } else if(bankCardType.equals(BankCardType.DEBIT)){
            bankCard = new DeditBankCard();
        }
        return bankCard;
    }
}

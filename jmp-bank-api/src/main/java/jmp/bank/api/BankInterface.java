package jmp.bank.api;

import jmp.dto.BankCard;
import jmp.dto.BankCardType;
import jmp.dto.User;

//import jmp.dto.BankCard;
//import jmp.dto.BankCardType;
//import jmp.dto.User;
//
public interface BankInterface {
    public BankCard createBankCard(User user, BankCardType bankCardType);
}

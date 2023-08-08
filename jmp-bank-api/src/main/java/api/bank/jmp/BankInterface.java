package api.bank.jmp;

import dto.jmp.BankCard;
import dto.jmp.BankCardType;
import dto.jmp.User;

public interface BankInterface {
    public BankCard createBankCard(User user, BankCardType bankCardType);
}

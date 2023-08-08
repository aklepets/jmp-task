package jmp.service.api;

import jmp.dto.BankCard;
import jmp.dto.Subscription;
import jmp.dto.User;

import java.util.List;
import java.util.Optional;

public interface ServiceInterface {
    public void subscribe(BankCard bankCard);
    public Optional<Subscription> getSubscriptionByBankCardNumber(String subscription);
    public List<User> getAllUsers();
}

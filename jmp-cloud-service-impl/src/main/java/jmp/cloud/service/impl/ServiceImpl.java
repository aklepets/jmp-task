package jmp.cloud.service.impl;

import jmp.dto.BankCard;
import jmp.dto.Subscription;
import jmp.dto.User;
import jmp.service.api.ServiceInterface;

import java.util.List;
import java.util.Optional;

public class ServiceImpl implements ServiceInterface {

    @Override
    public void subscribe(BankCard bankCard) {
//        TODO
    }

    @Override
    public Optional<Subscription> getSubscriptionByBankCardNumber(String bankCardNumber) {
//        TODO
        return Optional.empty();
    }

    @Override
    public List<User> getAllUsers() {
//        TODO
        return null;
    }
}

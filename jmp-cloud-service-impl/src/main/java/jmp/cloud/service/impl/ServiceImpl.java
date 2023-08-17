package jmp.cloud.service.impl;

import jmp.dto.BankCard;
import jmp.dto.Subscription;
import jmp.dto.User;
import jmp.service.api.ServiceInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.time.LocalDate;
import java.util.stream.Collectors;

public class ServiceImpl implements ServiceInterface {

    @Override
    public void subscribe(BankCard bankCard) {
//        TODO
    }

    @Override
    public Optional<Subscription> getSubscriptionByBankCardNumber(String bankCardNumber) {
//        TODO: where to initialize this list??
        List<Subscription> subscriptionList  = new ArrayList<>(Arrays.asList(new Subscription("1", LocalDate.of(2000, 1, 1))));
                subscriptionList
                .stream()
                .filter(subscription ->
                        subscription.getBankcard().equals(bankCardNumber))
                .collect(Collectors.toList());
        Optional<Subscription> subscriptionToReturn = Optional.of(subscriptionList.get(0));
        return subscriptionToReturn;
    }

    @Override
    public List<User> getAllUsers() {
//        TODO
        return null;
    }
}

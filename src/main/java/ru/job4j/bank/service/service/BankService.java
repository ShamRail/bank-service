package ru.job4j.bank.service.service;

import ru.job4j.bank.service.model.Credit;
import ru.job4j.bank.service.model.Passport;

import java.util.Optional;

public interface BankService {
    Optional<Credit> getCredit(Passport passport, Credit creditData);
}

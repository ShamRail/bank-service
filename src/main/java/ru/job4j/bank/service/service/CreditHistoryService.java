package ru.job4j.bank.service.service;

import ru.job4j.bank.service.model.CreditHistory;
import ru.job4j.bank.service.model.Passport;

import java.util.Optional;

public interface CreditHistoryService {
    Optional<CreditHistory> getHistory(Passport passport);
}

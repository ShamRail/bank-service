package ru.job4j.history.service.service;

import ru.job4j.history.service.model.CreditHistory;
import ru.job4j.history.service.model.Passport;

public interface CreditHistoryService {
    CreditHistory findCreditHistoryByPassport(Passport passport);
}

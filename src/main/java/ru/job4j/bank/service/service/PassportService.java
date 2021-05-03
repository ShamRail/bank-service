package ru.job4j.bank.service.service;

import ru.job4j.bank.service.model.Passport;

import java.util.Optional;

public interface PassportService {
    Optional<Passport> findBySeriaAndNumber(int seria, int number);
}

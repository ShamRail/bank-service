package ru.job4j.history.service.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;
import ru.job4j.history.service.model.CreditHistory;
import ru.job4j.history.service.model.Passport;
import ru.job4j.history.service.repository.PassportRepository;
import ru.job4j.history.service.service.CreditHistoryService;

@RestController
public class CreditHistoryController {

    private CreditHistoryService creditHistoryService;

    private PassportRepository passportRepository;

    public CreditHistoryController(CreditHistoryService creditHistoryService,
                                   PassportRepository passportRepository) {
        this.creditHistoryService = creditHistoryService;
        this.passportRepository = passportRepository;
    }

    @GetMapping("/get-history")
    public CreditHistory findHistoryByPassport(
            @RequestParam int seria,
            @RequestParam int number) {
        Passport passport = passportRepository.findBySeriaAndNumber(
                seria, number
        ).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Invalid passport data"));
        return creditHistoryService.findCreditHistoryByPassport(passport);
    }

}

package ru.job4j.passport.service.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.job4j.passport.service.model.Passport;
import ru.job4j.passport.service.service.PassportService;

@RestController
public class PassportController {

    private PassportService passportService;

    public PassportController(PassportService passportService) {
        this.passportService = passportService;
    }

    @PostMapping("/checkValid")
    public String checkValid(@RequestBody Passport passport) {
        return String.valueOf(passportService.checkValid(passport.getSeria(), passport.getNumber()));
    }

}

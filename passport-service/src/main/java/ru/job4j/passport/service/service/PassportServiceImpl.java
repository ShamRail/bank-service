package ru.job4j.passport.service.service;

import org.springframework.stereotype.Service;
import ru.job4j.passport.service.model.Passport;
import ru.job4j.passport.service.repository.PassportRepository;

import javax.annotation.PostConstruct;
import java.util.Optional;

@Service
public class PassportServiceImpl implements PassportService {

    private PassportRepository passportRepository;

    public PassportServiceImpl(PassportRepository passportRepository) {
        this.passportRepository = passportRepository;
    }

    @PostConstruct
    private void initData() {
        passportRepository.save(new Passport(1111, 12345, true));
        passportRepository.save(new Passport(2222, 98765, true));
        passportRepository.save(new Passport(3333, 23456, false));
        passportRepository.save(new Passport(4444, 45678, true));
        passportRepository.save(new Passport(5555, 12859, true));
    }

    @Override
    public boolean checkValid(int seria, int number) {
        Optional<Passport> passportOptional = passportRepository.findBySeriaAndNumber(seria, number);
        if (passportOptional.isEmpty()) {
            return false;
        }
        return passportOptional.get().isActive();
    }

}

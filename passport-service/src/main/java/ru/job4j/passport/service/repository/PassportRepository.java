package ru.job4j.passport.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.job4j.passport.service.model.Passport;

import java.util.Optional;

@Repository
public interface PassportRepository extends JpaRepository<Passport, Integer> {
    Optional<Passport> findBySeriaAndNumber(int seria, int number);
}

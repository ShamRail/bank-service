package ru.job4j.history.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.job4j.history.service.model.Passport;

import java.util.Optional;

@Repository
public interface PassportRepository extends JpaRepository<Passport, Integer> {
    Optional<Passport> findBySeriaAndNumber(int seria, int number);
}

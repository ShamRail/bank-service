package ru.job4j.history.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.job4j.history.service.model.Credit;

@Repository
public interface CreditRepository extends JpaRepository<Credit, Integer> {

}

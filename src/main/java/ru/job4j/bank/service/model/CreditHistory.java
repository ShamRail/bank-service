package ru.job4j.bank.service.model;

import java.util.List;

public class CreditHistory {

    private List<Credit> credits;

    public List<Credit> getCredits() {
        return credits;
    }

    public void setCredits(List<Credit> credits) {
        this.credits = credits;
    }
}

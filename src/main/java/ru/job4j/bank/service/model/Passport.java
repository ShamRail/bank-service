package ru.job4j.bank.service.model;

public class Passport {

    private int seria;
    private int number;

    public Passport() { }

    public Passport(int seria, int number) {
        this.seria = seria;
        this.number = number;
    }

    public int getSeria() {
        return seria;
    }

    public void setSeria(int seria) {
        this.seria = seria;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}

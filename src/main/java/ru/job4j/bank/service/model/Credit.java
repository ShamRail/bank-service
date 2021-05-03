package ru.job4j.bank.service.model;

import java.time.LocalDateTime;

public class Credit {

    private LocalDateTime start;
    private LocalDateTime end;
    private LocalDateTime actualEnd;
    private long sum;
    private byte percent;

    public Credit() { }

    public Credit(LocalDateTime start, LocalDateTime end, long sum, byte percent) {
        this.start = start;
        this.end = end;
        this.sum = sum;
        this.percent = percent;
    }

    public LocalDateTime getStart() {
        return start;
    }

    public void setStart(LocalDateTime start) {
        this.start = start;
    }

    public LocalDateTime getEnd() {
        return end;
    }

    public void setEnd(LocalDateTime end) {
        this.end = end;
    }

    public LocalDateTime getActualEnd() {
        return actualEnd;
    }

    public void setActualEnd(LocalDateTime actualEnd) {
        this.actualEnd = actualEnd;
    }

    public long getSum() {
        return sum;
    }

    public void setSum(long sum) {
        this.sum = sum;
    }

    public byte getPercent() {
        return percent;
    }

    public void setPercent(byte percent) {
        this.percent = percent;
    }
}

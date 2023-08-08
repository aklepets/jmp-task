package jmp.dto;

import java.time.LocalDate;

public class Subscription {
    public String bankcard;
    public LocalDate startDate;

    public String getBankcard() {
        return bankcard;
    }

    public void setBankcard(String bankcard) {
        this.bankcard = bankcard;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Subscription that = (Subscription) o;

        if (!bankcard.equals(that.bankcard)) return false;
        return startDate.equals(that.startDate);
    }

    @Override
    public int hashCode() {
        int result = bankcard.hashCode();
        result = 31 * result + startDate.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Subscription{" +
                "bankcard='" + bankcard + '\'' +
                ", startDate=" + startDate +
                '}';
    }
}
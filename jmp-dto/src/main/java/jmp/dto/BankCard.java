package jmp.dto;

public class BankCard {
    public String number;
    public User user;

    public BankCard(String number, User user) {
        this.number = number;
        this.user = user;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BankCard bankCard = (BankCard) o;

        if (!number.equals(bankCard.number)) return false;
        return user.equals(bankCard.user);
    }

    @Override
    public int hashCode() {
        int result = number.hashCode();
        result = 31 * result + user.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "BankCard{" +
                "number='" + number + '\'' +
                ", user=" + user +
                '}';
    }
}
package jmp.dto;

import java.time.LocalDate;

public class User {
    public String name;
    public String surname;
    public LocalDate birthday;

    public User(String name, String surname, LocalDate birthday) {
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
    }

    public User(){
        int number = (int)Math.random() * 1000 + 1;
        name = "FirstName" + number;
        surname = "LastName" + number;
        int randomYear = (int)Math.random() * 50 + 1983;
        int randomMonth = (int)Math.random() * 12 + 1;
        int randomDay = (int)Math.random() * 27 + 1;
        birthday = LocalDate.of(randomYear, randomMonth, randomDay);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (!name.equals(user.name)) return false;
        if (!surname.equals(user.surname)) return false;
        return birthday.equals(user.birthday);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + surname.hashCode();
        result = 31 * result + birthday.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}
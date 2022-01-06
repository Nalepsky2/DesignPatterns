package com.company.builder;

import java.util.Date;

public class User {
    String name;
    String surname;
    int age;
    Double accountBalance;
    Date joiningDate;

    private User(String name, String surname, int age, Double accountBalance, Date joiningDate) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.accountBalance = accountBalance;
        this.joiningDate = joiningDate;
    }

    public static class Builder {
        String name;
        String surname;
        int age;
        Double accountBalance;
        Date joiningDate;

        public Builder() {
            this.name = "";
            this.surname = "";
            this.age = -1;
            this.accountBalance = (double) 0;
            this.joiningDate = new Date();
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setSurname(String surname) {
            this.surname = surname;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setAccountBalance(Double accountBalance) {
            this.accountBalance = accountBalance;
            return this;
        }

        public Builder setJoiningDate(Date joiningDate) {
            this.joiningDate = joiningDate;
            return this;
        }

        public User build () {
            return new User(name, surname, age, accountBalance, joiningDate);
        }
    }
}

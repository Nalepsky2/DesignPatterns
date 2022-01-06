package com.company.flyweight;

public class Main {

    /*Zadanie
        2pkt - zaimplementuj metodę createUser w klasie UserFactory zgodnie z założeniami flyweight.
    */

    public static void main(String[] args) {
        User u1 = UserFactory.createUser("jan", "Devil-icon.png");
        User u2 = UserFactory.createUser("adam", "Devil-icon.png");
        User u3 = UserFactory.createUser("adam", "Avengers-Loki-icon.png");

        System.out.println(u1);
    }
}

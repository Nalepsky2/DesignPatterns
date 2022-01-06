package com.company.builder;

public class Main {

    /*Zadanie
        1pkt - zaimplementuj builder dla klasy User
    */

    public static void main(String[] args) {
        User u1 = new User.Builder().setAge(23).setName("Jan").build();

        System.out.println(u1.toString());
    }
}

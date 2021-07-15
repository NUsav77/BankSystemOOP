package com.example.banksystemoop;


public class Main {
    public static void main(String[] args) {
        user.Member steven = new user.Member();
        steven.setName("Steven", "Nodalo");
        System.out.println(steven.getFullname());
        steven.setAccountNumber();
        System.out.println(steven.getAccountNumber());
    }
}

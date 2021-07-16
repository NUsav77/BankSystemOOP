package com.example.banksystemoop;


public class Main {
    public static void main(String[] args) {
        Member steven = new Member("Steven", "Nodalo");
        System.out.println(steven.getFullname());
        System.out.println(steven.getAccountNumber());
    }
}

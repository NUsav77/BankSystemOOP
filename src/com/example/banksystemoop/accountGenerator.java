package com.example.banksystemoop;


public class accountGenerator {

    public long generateAccountNum(){
        return (long) Math.floor(Math.random() * 9000000000000L) + 1000000000000L;
    }

}

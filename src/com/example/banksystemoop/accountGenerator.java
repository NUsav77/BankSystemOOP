package com.example.banksystemoop;
import java.util.Random;



public class accountGenerator {

    public int generateAccountNum(){
        Random random = new Random();
       return random.nextInt(20);
    }

}

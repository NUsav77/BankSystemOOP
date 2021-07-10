package com.example.banksystemoop;

public class BankSystemOOP {

    public static class User {

        String firstName;
        String lastName;
        int age;
        int ssn;

        public void setName(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public String getFullname() {
            return this.firstName + " " + this.lastName;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }

    public static void main(String[] args) {
    }
}

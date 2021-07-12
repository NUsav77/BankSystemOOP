package com.example.banksystemoop;


public class user {

    public static class User {

        String firstName;
        String lastName;
        int age;
        int ssn;

        public void setName(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void setSsn(int ssn) {
            if(String.valueOf(ssn).length() != 9) {
                System.out.println("Invalid SSN");
            }
            else {
                this.ssn = ssn;
            }
        }

        public String getFullname() {
            return this.firstName + " " + this.lastName;
        }

        public int getAge() {
            return this.age;
        }

        public int getSsn() {
            return this.ssn;
        }
    }

    public static class Member extends User {
        long accountNumber;
        boolean isActive;

        public void setAccountNumber() {
            this.accountNumber = new accountGenerator().generateAccountNum();
            System.out.println(this.getFullname() + "\nAccount number: " + this.accountNumber);
        }

        public long getAccountNumber() {
            return this.accountNumber;
        }
    }

    public static void main(String[] args) {
        Member steven = new Member();
        steven.setName("Steven", "Nodalo");
        System.out.println(steven.getFullname());
        steven.setAccountNumber();
        System.out.println(steven.getAccountNumber());
    }
}

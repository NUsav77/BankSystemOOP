package com.example.banksystemoop;


public class user {

    public static class User {

        String firstName;
        String lastName;
        String fullname;
        char firstInitial;
        char lastInitial;
        int age;
        int ssn;

        public void setName(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.fullname = getFullname();
            this.firstInitial = firstName.charAt(0);
            this.lastInitial = lastName.charAt(0);
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


}

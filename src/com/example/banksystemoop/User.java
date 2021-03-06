package com.example.banksystemoop;


public class User {

    String firstName;
    String lastName;
    String fullname;
    char firstInitial;
    char lastInitial;
    int age;
    int ssn;

    // CONSTRUCTOR
    public User(String firstName, String lastName) {
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

class Member extends User {
    long memberNumber;
    boolean isActive = false;
    boolean hasChecking = false;
    boolean hasSaving = false;
    boolean hasLoan = false;

    public Member(String firstName, String lastName) {
        super(firstName, lastName);
        this.memberNumber = new accountGenerator().generateAccountNum();
        System.out.println("Member: " + this.fullname + "\nAccount number: " + this.memberNumber);
    }

}


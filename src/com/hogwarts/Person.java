package com.hogwarts;

public class Person {
    private String name;
    private String surname;
    private int age;
    private boolean genderBool;


    public Person(String name, String surname, int age, boolean genderBool ) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.genderBool = genderBool;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public boolean getGenderBool() {
        return genderBool;
    }

    @Override
    public String toString() {
        return "Hi, I am "+name+" "+surname+" a " +age+ "-year-old " +(genderBool? "female": "male")+".";
    }
}
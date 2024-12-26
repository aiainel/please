package com.hogwarts;

public class Person {
    private String name;
    private String surname;
    private int age;
    private String gender;

    public Person(String name, String surname , int age, String gender) {
        this.name = name;
        this.age = age;
        this.surname = surname;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "person name=" + name + " surname=" + surname + " age=" + age + " gender=" + gender;
    }
}
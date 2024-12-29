package com.hogwarts;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File fileStudents =new File("students.txt");
        File fileTeachers =new File("teachers.txt");
        Scanner sc=new Scanner(fileStudents);
        Scanner sc2=new Scanner(fileTeachers);
        School school=new School();


        try {
            while (sc.hasNextLine()) {
                String name = sc.next();
                String surname = sc.next();
                int age = Integer.parseInt(sc.next());
                String gender = sc.next();
                boolean genderBool;
                genderBool = gender.equals("Female");
                Student student = new Student(name, surname, age, genderBool);
                while (sc.hasNextInt()) {
                    student.addGrade(Integer.parseInt(sc.next()));
                }
                school.addMember(student);
            }

        }catch(NoSuchElementException e){
            System.out.println("Input is missing.");
        }


        try {
            while (sc2.hasNextLine()) {
                String name = sc2.next();
                String surname = sc2.next();
                int age = Integer.parseInt(sc2.next());
                String gender = sc2.next();
                String subject = sc2.next();
                int yearsOfExperience = Integer.parseInt(sc2.next());
                int salary = Integer.parseInt(sc2.next());
                boolean genderBool;
                genderBool = gender.equals("Female");
                Teacher teacher = new Teacher(name, surname, age, genderBool, subject, yearsOfExperience, salary);
                school.addMember(teacher);
            }
        }catch(NoSuchElementException e){
            System.out.println("Input is missing.");
        }


        for(Person person: school.getMembers()){
            if(person instanceof Student){
                Student student=(Student)person;
                System.out.println(student.getName()+"'s GPA: " +String.format("%.2f",student.calculateGpa()));
            }
            if(person instanceof Teacher){
                Teacher teacher=(Teacher)person;
                if(teacher.getYearsOfExperience()>10){
                    System.out.println( teacher.getName()+"'s salary before rise: "+ teacher.getSalary()+ "."+"After the rise: "+teacher.giveRaise(20));
                }
            }
        }


        school.sortMembers();
        System.out.println("\nThe list of people who work or study at the school:");
        school.print();
    }
}
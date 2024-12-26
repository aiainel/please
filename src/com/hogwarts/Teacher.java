package com.hogwarts;

 class Teacher extends Person{
     private String subject ;
     private int yearsOfExperience ;
     private int salary ;

     public Teacher(String name, String surname,int age,String gender, int yearsOfExperience, int salary,String subject) {
         super(name,surname,age,gender);
         this.yearsOfExperience=yearsOfExperience;
         this.salary=salary;
         this.subject=subject;
     }
}

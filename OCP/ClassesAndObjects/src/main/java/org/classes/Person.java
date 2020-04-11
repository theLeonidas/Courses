package org.classes;

public class Person {
    String name;
    int age;
    String gender;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void print(){
        System.out.println("--------------Printing Person-----------");
        System.out.println();
        System.out.println("Person name is " + this.name);
        System.out.println("Person age is " + this.age);
        System.out.println("Person gender is " + this.gender);
        System.out.println();
    }
}
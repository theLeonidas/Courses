package org.inherit;

public class Person {
    public String name;
    public Integer age;
    public String gender;

    //Person has capacity to eat 10 fruits/day.
    //This is a private field, hence it is only visible inside of the Person class
    //And not in any of the subclasses like Employee.
    private int foodCounter;

    //Static variables from the parent class are shared
    //and ot inherited.
    public static Integer personCount;

    public void eat(){
        if(foodCounter==10)
            foodCounter = 0;
        else foodCounter++;
    }

    public void displayPerson(){
        System.out.println(combineInfo());
    }

    //This is a private method of the class.
    //This method is only available inside of the class
    //and even the inheriting class cannot access this class.
    private String combineInfo(){
        StringBuilder builder = new StringBuilder("My name is : " + this.name);
        builder.append("I am " + this.age + " years old.")
               .append("I am a " + this.gender) ;
        return builder.toString();
    }
}
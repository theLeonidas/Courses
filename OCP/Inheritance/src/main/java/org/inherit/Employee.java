package org.inherit;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;

//An employee is a person.
//In order for a class to inherit from another class
//it needs to declare it using "extends" clause.
//In java A class can extend only a single class.
public class Employee extends Person{

    //These are fields specific to Employee class
    //Apart from these Employee class also inherits fields
    //from the Person class.
    public Long empId;
    public Float monthlySalary;
    public Float monthlyAllowances;

    //Employee can have its own version of personCount Variable.
    //public static Integer personCount;

    public void calculateYearlySalary(){
        Float yearlySalary = (monthlySalary+monthlyAllowances)*12;

        //displayPerson() is a method in the Person class.
        //Since employee class inherits the Person class,
        //Hence displayPerson() is present as a member of the Employee class.
        displayPerson();
        System.out.println(this.name + "'s salary is : " + yearlySalary);
    }

    public Employee(String name, Integer age, String gender, Long empId, Float monthlySalary, Float monthlyAllowances){
        this.name = name;
        this.age = age;
        this.empId = empId;
        this.monthlySalary = monthlySalary;
        this.monthlyAllowances = monthlyAllowances;
    }

    //Default Constructor.
    public Employee(){}

    public void tryToAcessSuperClassMembers(){
        //Private methods from the super classes are not available here.
        //combineInfo();

        //Private fields from the super classes are not available here.
        //System.out.println(this.foodCounter);
    }

    public void showStaticMemberSharing(){
        Person person = new Person();
        Employee employee = new Employee();

        //Providing value to name property of person.
        person.name = "John";

        //Providing value to name property of Employee.
        employee.name = "Peter";

        //Each type of person has it own value of name.
        System.out.println("Name of person : " + person.name);
        System.out.println("Name of employee : " + employee.name);

        //Employee & Person share common copy of personCount variable
        Person.personCount = 45;
        //Employee also reflects the similar value of personCount.
        System.out.println(Employee.personCount);

        Employee.personCount = 88;
        //Person also reflects the changed value of personCount.
        System.out.println(Person.personCount);
    }

    @Override
    public void hello() throws FileNotFoundException,EOFException {
        if(1==1)
        throw new FileNotFoundException();

        if(1==1)
        throw new EOFException();
    }
}
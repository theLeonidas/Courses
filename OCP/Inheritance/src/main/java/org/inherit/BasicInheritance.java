package org.inherit;

public class BasicInheritance implements Feature{

    @Override
    public void display() throws Exception {
        //This method shows basic inheritance.
        showBasicInheritance();
        showObjectClassInheritance();

        //Show Static sharing
        Employee employee = new Employee();
        employee.showStaticMemberSharing();
    }

    public void showBasicInheritance(){
        Employee emp = new Employee();
        emp.calculateYearlySalary();
    }

    private void showObjectClassInheritance() throws CloneNotSupportedException{
        //Following shows methods from Object class.

        //Default implementation of toString() method returns
        //<Fully Qualified name of the class>@<Unique Hash Code>
        System.out.println(this.toString());

        //equals() method check the equality of object
        //In the sense whether the reference point to the same object.
        Object obj = new Object();
        System.out.println(this.equals(obj));

        //Java assigns a unique value to every object instantiated.
        //This is referred to as hashcode value.
        this.hashCode();

        //Cloning is a process, where just like in the real world where we can make a copy o f
        //certain object , similarly we make a copy of the original object.
        Object clonedObject = this.clone();

        //getClass() method returns the current class object of the object.
        //In , java every object has asscociated java.lang.Class object with it.
        //It is like a store house of metadat about the current class.
        //All instance members including methods etc.
        System.out.println(this.getClass());
    }
}
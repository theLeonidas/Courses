package org.classes;

public class InstantiatingAClass implements Feature {

    @Override
    public void displayFeature() {
        //Instantiating the class using the new operator
        MembersOfAClass membersOfAClass = new MembersOfAClass();

        //calling the instance member method of the class
        membersOfAClass.memberMethodOfClass();

        //Displaying the int member of the class.
        System.out.println("Value of the int member of the class = " + membersOfAClass.intMember);
    }
}
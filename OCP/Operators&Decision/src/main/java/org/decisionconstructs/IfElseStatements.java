package org.decisionconstructs;

import java.sql.SQLOutput;

public class IfElseStatements implements DecisionConstructs{

    boolean flag=true;

    @Override
    public void explain() {
        System.out.println("------ Lets see the use of If Else Statement ------");

        //Simple If Statement which executes single statement
        // if the flag is false nothing happens as there is no else block
        System.out.println("SINGLE STATEMENT EXECUTION");
        if(flag) System.out.println("Flag is "+flag);

        //If Statement which executes a block of statements
        System.out.println("BLOCK STATEMENT EXECUTION");
        if(flag ){
            System.out.println("Flag is "+flag);
            System.out.println("Executing multiple Statement in If Block");
        }

        if(flag); // A valid statement but does nothing

        if(flag); else ; //Again a valid statement that does nothing

        //if (flag) else ; //Compilation Error as there is no statement provided for if block
        System.out.println("IF ELSE STATEMENT");
        checkIfElse(true); // executes if block
        checkIfElse(false); // executes else block

        System.out.println("NESTED IF ELSE STATEMENT");
        nestedIfElse(9); //nested if else

        System.out.println("DANGLING ELSE SCENARIO");
        danglingElse(1);

        System.out.println("US OF ASSIGNMENT OPERATOR IN IF CONDITION");
        assignmentInIf();

        // Using pre & post increment/decrement operators in if conditions results in tricky question
        // You can see such questions in exams
        System.out.println("USE OF INCREMENT/DECREMENT OPERATOR IN IF CONDITION");
        incrementOperatorInIf(4);

    }

    private void incrementOperatorInIf(int x) {
        if(++x<5){       //value of x will be 5 and same will be used to evaluate condition , so the result will be false
            System.out.println("a) Value of X : "+ x);
        }else{
            if(x++==5){     //value of x will be 6 but 5 will be used to evaluate expression and hence the result will be true
                System.out.println("b) Value of X : "+x);
            }else{
                System.out.println("c) Value of X : "+x);
            }
        }
    }

    private void checkIfElse(boolean flag){
        if(flag) {
            System.out.println("Flag is true ... Executing If block");
        } //; // semicolon is not allowed at this position
        else {
            System.out.println("Flag is false ... Executing Else block");
        }; //semicolon allowed however it doesn't make any diffrence
    }

    private void nestedIfElse(int val){
        //Indentation helps to correctly interpret the result
       // System.out.println("--- Nested If Else ---");
        if(val>1)
            if(val<8)
                System.out.println("b");
            else
                System.out.println("c");
        else
            System.out.println("d");

    }

    private void danglingElse(int val){
       // System.out.println("--- Dangling Else ---");
        if(val==1)
        if(val==2)
            System.out.println("a");
        else        // this else belongs to the second if statement according to this rule -
                    // "Else has to be associated with the nearest if”
            System.out.println("b");

    }

    private void assignmentInIf(){
      //  System.out.println("--- Assignment Operator in If Statement ---");
        String data;
        if((data=readData())!=null){    //We can use assignment operator and method calls in if statements
            System.out.println(data);
        }
    }

    private String readData() {
        return "Dummy Data";
    }
}

package org.calculations;

//import org.random.RandomNumber;

public class Run{
    public static void main(String args[]){
        Calculator cal = new Calculator();
//        RandomNumber random = new RandomNumber();
        int operation = Integer.parseInt(args[0]),op1 = Integer.parseInt(args[1]) , op2 = Integer.parseInt(args[1]) , result=0;//(args.length>=2?Integer.parseInt(args[1]):random.getRandomNumber()),op2 = (args.length>=3?Integer.parseInt(args[2]):random.getRandomNumber()),result=0;
        
        System.out.println("Operation : " + operation);
        System.out.println("Operand 1 : " + op1);
        System.out.println("Operand 2 : " + op2);

        switch(operation){
           case 1 :  result = (int)cal.add(op1,op2);
                     break;
           case 2 :  result = (int)cal.subtract(op1,op2);
                     break;
           case 3 :  result = (int)cal.multiply(op1,op2);
                     break;
           case 4 :  result = (int)cal.divide(op1,op2);
                     break;
        }
        System.out.println("Result = " + result);
    }
}
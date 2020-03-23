package org;

import org.decisionconstructs.IfElseStatements;

import java.io.IOException;
import java.util.Scanner;

public class DecisionConstruct {
    public static void main(String[] args) {
        boolean flag=true;
        int choice=0;
        Scanner in = new Scanner(System.in);
        while(flag) {
        System.out.println("---------------Decision Constructs--------------");
        System.out.println("1. If Else Statement");
        System.out.println("2. Switch Statement");
        System.out.println("3. while Statement");
        System.out.println("4. Exit");
        System.out.println("Please Enter Your choice -");
        choice = in.nextInt();

            switch (choice) {
                case 1:
                    new IfElseStatements().explain();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    flag=false;
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Invalid Choice ! Try Again .");
            }
        }
    }
}


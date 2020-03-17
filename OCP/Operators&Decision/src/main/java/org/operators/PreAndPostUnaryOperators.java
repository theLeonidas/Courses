package org.operators;

public class PreAndPostUnaryOperators implements Operators{

    @Override
    public void testOperator() {
        int preVar = 1, postVar = 2;

        //Pre increment/decrement is first assigned and then evaluated.
        //preResult = preVar++. In this expression value of preVar is first assigned to
        //preResult and then afterwards preVar is incremented.
        System.out.println("----------------Unary Pre Increment operations -------------");
        System.out.println("Original value of pre initialization variable = " + preVar);
        int preResult = preVar++;
        System.out.println("Result of pre increment = " + preResult);
        System.out.println("Value of pre initialization variable after increment = " + preVar);

        System.out.println();

        //Post increment/decrement is first evaluated and then assigned.
        //postResult = ++postVar. In this expression value of postVar is first incremented
        //and then afterwards postVar is assigned to postResult.
        System.out.println("----------------Unary Post Increment operations -------------");
        System.out.println();
        System.out.println("Original value of post initialization variable = " + postVar);
        int postResult = ++postVar;
        System.out.println("Result of post increment = " + postResult);
        System.out.println("Value of post initialization variable after increment = " + postVar);

        System.out.println();
        //Guess the result.
        int guessVar = 1 , guessVar2 = 5;
        guessVar = guessVar++;
        System.out.println("guessVar = guessVar++; Value of guessVar = ?");

        System.out.println();

        guessVar2 = ++guessVar2;
        System.out.println("guessVar2 = ++guessVar2; Result of guessVar2 =?");

        //Guess the values
        int a = 2;
        int b = 5;
        int c = a * (a++ - --b) * a * b;
        //c = b * a * (a++ - --b) * a * b;
        System.out.println("a = ?");
        System.out.println("b = ?");
        System.out.println("c = ?");

    }
}
package org.exception;

public class ThrowingExceptions implements Feature{

    @Override
    public void display() throws Exception {
        computeSimpleInterest(0,3.5f,5);
        computeSimpleInterest(5000,0,10);
        computeSimpleInterest(10000,3.5f,0);
    }

    //This method calculates the Simple interest.
    //It accepts principal amount, rate and time and prints the simple interest.
    private void computeSimpleInterest(long principal, float rateOfInterest, int timeInYears){
        //Mandatory requirement for this method is that all the three input parameters
        // must be a non-zero, positive value
        if(principal<=0)
            throw new IllegalArgumentException("Principal must be a non-zero,positive value.");

        if(rateOfInterest<=0)
            throw new IllegalArgumentException("Rate of Interest must be a non-zero,positive value.");

        if(timeInYears<=0)
            throw new IllegalArgumentException("Time in Years must be a non-zero,positive value.");

        float simpleInterest = (principal*rateOfInterest*timeInYears)/100;
        System.out.println(simpleInterest);
    }
}
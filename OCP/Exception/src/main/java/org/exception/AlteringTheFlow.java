package org.exception;

public class AlteringTheFlow implements Feature{

    @Override
    public void display() throws Exception {
        //calculateSI();
    }

    //This method calculates  simple interest for which
    //it takes principal,rateOfInterest & timeInYears as i/p.
    private void calculateSI(long principal, float rateOfInterest, int timeInYears) {
        double product = 0;
        try{
            //First trying to calculate the product of principal,rateOfInterest & timeInYears
            product = calculateProduct(principal, rateOfInterest, timeInYears);

            //If calculateProduct function throws an exception catch it.
        }catch (IllegalArgumentException illegalArgumentsExc){
            //Print the exception
            System.out.println(illegalArgumentsExc);

            //Exit silently without printing the SI as
            //the user provided an incorrect value.
            return;
        }finally {
            System.out.println("All done.");
        }

        //In case no exception was raised that means the
        //product was calculated successfully
        //Hence we shall be calculating the SI & printing the result.
        double simpleInterest = product/100;
        System.out.println("Calculated Simple Interest is : " + simpleInterest);
    }

    private double calculateProduct(long principal, float rateOfInterest, int timeInYears) {
        //In any case the input parameter are anything other than
        //Non-zero,positive value, we throw an exception.
        if(principal<=0 || rateOfInterest <=0 || timeInYears<=0)
            throw new IllegalArgumentException("Principal or rateOfInterest or Time should be a non-zero positive value");

        //If all goes correct till here then calculate the product and return.
        return principal*rateOfInterest*timeInYears;
    }
}
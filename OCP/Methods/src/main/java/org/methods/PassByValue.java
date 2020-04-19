package org.methods;

public class PassByValue implements Feature{

    @Override
    public void display() {

        //This tests pass-by-value on primitive types.
        //passByValueOnPrimitives();

        passByValueOnReferenceTypes();
    }

    private void passByValueOnPrimitives() {
        int intValue = 50;
        System.out.println("Original value : " + intValue);

        //First calling the primitive version.
        //pass-by-value does not change the original input parameter
        //Whatever changes the method does, it does only on its own copy of the variables.
        int returnValue = iAmBeingCalled(intValue);
        System.out.println("Return Value : " + returnValue);
        System.out.println("Value of input variable after method call : " + intValue);
    }

    private int iAmBeingCalled(int intValue) {
        intValue = intValue / 2;

        //changing value of receiving parameter.
        System.out.println("Changing value of receiving variable : " + intValue);
        return intValue;
    }

    //Call by value in cacse of references copies the address of the object contained in
    //the reference variable.
    private void passByValueOnReferenceTypes() {
        //changingObject();
        nonChangingObject();
    }

    private void changingObject(){
        ComplexType refType = new ComplexType();
        refType.setIntValue(100);
        refType.setFloatValue(5.12f);

        //Another reference that points to the same object as that of the original.
        ComplexType storedRefToTheOriginalObject = refType;

        System.out.println("Original value of the reference variable : " + refType);
        System.out.println("Original value of the stored reference variable : " + storedRefToTheOriginalObject);

        //Double equals operator checks whether the two references point to the same object.
        System.out.println("Do the original and stored reference variable point to the same object : " + (refType==storedRefToTheOriginalObject));

        iAmBeingCalled(refType);

        System.out.println();

        //Since changes were done on the same object tht was pointed to by the original
        //reference, hence we can see changes in the valaue.
        System.out.println("Value of the reference variable after method call : " + refType);
        System.out.println("Value of the stored reference variable after method call : " + storedRefToTheOriginalObject);
        System.out.println("Do the original and stored reference variable point to the same object : " + (refType==storedRefToTheOriginalObject));
    }

    private void nonChangingObject(){
        ComplexType refType = new ComplexType();
        refType.setIntValue(100);
        refType.setFloatValue(5.12f);

        //Another reference that points to the same object as that of the original.
        ComplexType storedRefToTheOriginalObject = refType;

        System.out.println("Original value of the reference variable : " + refType);
        System.out.println("Original value of the stored reference variable : " + storedRefToTheOriginalObject);

        //Double equals operator checks whether the two references point to the same object.
        System.out.println("Do the original and stored reference variable point to the same object : " + (refType==storedRefToTheOriginalObject));

        System.out.println();

        iAmGettingCalled(refType);

        System.out.println();

        //Since changes were done on different object that was pointed to by the original
        //reference, hence we can see no changes in the value.
        System.out.println("Value of the reference variable after method call : " + refType);
        System.out.println("Value of the stored reference variable after method call : " + storedRefToTheOriginalObject);
        System.out.println("Do the original and stored reference variable point to the same object : " + (refType==storedRefToTheOriginalObject));
    }

    private void iAmBeingCalled(ComplexType receivingRef){
        //Through the address received in the reference variable is of same object as the
        //one which was input parameter was pointing to , hence any changes to to the object happens
        // in the same object.
        receivingRef.setIntValue(150);
        receivingRef.setFloatValue(200.45f);
    }

    private void iAmGettingCalled(ComplexType receivingRef){
        receivingRef = new ComplexType();
        System.out.println("Value of changed receiving reference variable : " + receivingRef);
    }
}
package org.methods;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class MethodOverloading implements Feature{

    @Override
    public void display() {
        short x = 10, y=20;
        add(x,y);

        //Ambiguous subtract
        //Which subtract method would be called.
        //subtract(1,2);

        methodSelectionRules();
    }

    public int add(int x,int y){
        System.out.println("primitive");
        return x+y;
    }

    //Does not work. Compile error is raise saying same method already exists.
//    public float add(int x,int y){
//        return x+y;
//    }

    public int add(int x,Integer y){
        System.out.println("Wrapper");
        return x+y;
    }

    public int add(short x,short y){
        System.out.println("Short");
        return x+y;
    }

    public int subtract(int x,Integer y){
        return x+y;
    }

    public int subtract(Integer x,int y){
        return x+y;
    }

    private void methodSelectionRules() {
        //Rule for exact match
        //exactMach();

        //Rule for specificity.
        //specificity();

        //Rule for widening.
        wideningBeforeAutoboxing();
    }

    private void exactMach() {
        //Since we are passing in a String instead of an Object
        //Hence String version is called as it matches exactly.
        show("OCP");
    }

    private void show(String message) {
        System.out.println(message);
    }

    private void show(Object obj){
        System.out.println(obj);
    }

    private void specificity() {
        //two version of this method exist,
        //one which takes list & other which takes in collection
        //Collection is the super interface of List
        //ArrayList is the subclass of List interface.
        //Neither of them is an exact match.
        //Since List is more specific to ArrayList as per hierarchy
        //Hence List version is called.
        calculateSize(new ArrayList());

        //primitive version
        //Here no exact matching method exists as per exact match rule.
        //Nearest in the hierarchy is the float version as the doublle version
        //is even higher than float in the hierarchy.
        printMe(45);
    }

    private void calculateSize(List list) {
        System.out.println("List version called ,size is : " + list.size());
    }

    private void calculateSize(Collection collection) {
        System.out.println("Collection version called, size is :" + collection.size());
    }

    private void incorrectMatch(){
        byte b = 10;
        //Since there exist no rules of hierarchy between a byte and a char
        //Hence compiler flags this
        //ambiguous(b);
    }

    private void ambiguous(char charValue){
        System.out.println(charValue);
    }

    private void printMe(float floatValue){
        System.out.println("Float Version called, value is  : " + floatValue);
    }

    private void printMe(double doubleValue){
        System.out.println("Double version is called , value is " + doubleValue);
    }

    private void wideningBeforeAutoboxing() {
        //Two versions of the method exist.
        // One that takes in float value and other that takes in wrapper Integer.
        //As per this rule widening takes priority as compared to Autoboxing.(
        callMe(34);
    }

    private void callMe(float floatValue){
        System.out.println("Primitive version called , value is " + floatValue);
    }

    private void callMe(Integer intValue){
        System.out.println("Primitive version called , value is " + intValue);
    }
}
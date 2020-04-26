package org.inherit;

public class ChildX extends ParentX{

    private Integer intValue;
    private Long longValue;

    //This is the default no-argument constructor
    public ChildX(){
        System.out.println("Child class constructor called.");
    }

    public ChildX(Integer intValue){
        //this() constructor chaining at the first line.
        this(68l);
        System.out.println("Returning from this(Integer) constructor.");
        this.intValue = intValue;
    }

    public ChildX(Long longValue){
        //First line can either be this() or super()
        //this() chaining has already been done
        //Now executing super().
        super();
        System.out.println("After super() parent constructor called.");
        System.out.println("Returning from this(Long) constructor.");
        this.longValue = longValue;
    }
}
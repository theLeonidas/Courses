package org.java;

public class ProgramExecution {
    Integer i2;
    public static void main(String[] args) {
        System.out.println("Bravo!! Finally I am running a java program.");
        ProgramExecution exec = new ProgramExecution();
        exec.call();
    }

    void call(){
        inter1 inter = ()->{
            System.out.println(this.i2  );
        };
        inter.run();
    }
}

interface inter1{
    public static Integer i1 = 100;
    public void run();
}
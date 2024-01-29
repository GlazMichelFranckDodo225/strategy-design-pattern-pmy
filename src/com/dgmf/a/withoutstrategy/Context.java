package com.dgmf.a.withoutstrategy;

public class Context {
    public void process(int type) {
        System.out.println("First Step ...");

        if(type == 1) {
            System.out.println("Intermediary Step ... | Strategy 1");
        }
        else if(type == 2) {
            System.out.println("Intermediary Step ... | Strategy 2");
        }
        else if(type == 3) {
            System.out.println("Intermediary Step ... | Strategy 3");
        }
        else {
            System.out.println("Intermediary Step ... | Default Strategy");
        }

        System.out.println("Final Step ...");
    }
}

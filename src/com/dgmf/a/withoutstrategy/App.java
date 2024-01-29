package com.dgmf.a.withoutstrategy;

import com.dgmf.a.withoutstrategy.Context;

public class App {
    public static void main(String[] args) {
        Context context = new Context();

        System.out.println("Process Started ...");
        System.out.println("----------------");
        context.process(1);
        System.out.println("----------------");
        context.process(2);
        System.out.println("----------------");
        context.process(3);
        System.out.println("----------------");
        context.process(15);
    }
}
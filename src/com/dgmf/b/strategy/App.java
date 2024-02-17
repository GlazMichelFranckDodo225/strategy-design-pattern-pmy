package com.dgmf.b.strategy;

import com.dgmf.b.strategy.context.Context;
import com.dgmf.b.strategy.interfaces.IStrategy;
import com.dgmf.b.strategy.interfaces.impl.StrategyImpl1;
import com.dgmf.b.strategy.interfaces.impl.StrategyImpl2;
import com.dgmf.b.strategy.interfaces.impl.StrategyImpl3;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Context context = new Context();
        boolean endOfProcess = false;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Process Started ...");
        System.out.println("----------------");

        while(!endOfProcess) {
            System.out.println("Give the Strategy You Want to Apply");
            String strategyClassName = scanner.nextLine();
            IStrategy strategy = (IStrategy) Class.forName(strategyClassName)
                    .newInstance();
            context.setStrategy(strategy);
            context.process();
        }
    }
}
package com.dgmf.b.strategy.context;

import com.dgmf.b.strategy.interfaces.IStrategy;
import com.dgmf.b.strategy.interfaces.impl.DefaultStrategyImpl;

public class Context {
    private IStrategy strategy;

    public Context() {
        this.strategy = new DefaultStrategyImpl();
    }

    public void process() {
        System.out.println("First Step ...");

        strategy.applyStrategy();

        System.out.println("Final Step ...");
    }

    public void setStrategy(IStrategy strategy) {
        this.strategy = strategy;
    }
}

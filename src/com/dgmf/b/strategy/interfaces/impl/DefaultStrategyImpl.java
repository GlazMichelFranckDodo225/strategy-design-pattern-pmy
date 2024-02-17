package com.dgmf.b.strategy.interfaces.impl;

import com.dgmf.b.strategy.interfaces.IStrategy;

public class DefaultStrategyImpl implements IStrategy {
    @Override
    public void applyStrategy() {
        System.out.println("Intermediary Step ... | Default Strategy");
    }
}

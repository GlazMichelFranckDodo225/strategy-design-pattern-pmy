package com.dgmf.b.strategy.interfaces.impl;

import com.dgmf.b.strategy.interfaces.IStrategy;

public class StrategyImpl1 implements IStrategy {
    @Override
    public void applyStrategy() {
        System.out.println("Intermediary Step ... | Strategy 1");
    }
}

package com.example.demo.strategy;

//上下文
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public String executeStrategy(String name,String scheme){
        return strategy.doScheme(name, scheme);
    }
}

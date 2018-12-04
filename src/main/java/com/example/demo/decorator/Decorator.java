package com.example.demo.decorator;

public class Decorator implements Sage {
    private Sage sage;

    public Decorator(Sage sage){
        this.sage = sage;
    }
    @Override
    public void change() {
        // 代码
        sage.change();
    }
}
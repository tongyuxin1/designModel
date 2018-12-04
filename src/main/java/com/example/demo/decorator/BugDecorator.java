package com.example.demo.decorator;

public class BugDecorator extends Decorator {
    public BugDecorator(Sage sage) {
        super(sage);
    }

    @Override
    public void change() {
        // 代码
        super.change();
        System.out.println("可以变成虫");
    }
}

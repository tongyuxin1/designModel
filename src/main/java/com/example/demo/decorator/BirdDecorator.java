package com.example.demo.decorator;

public class BirdDecorator extends Decorator {

    public BirdDecorator(Sage sage) {
        super(sage);
    }

    @Override
    public void change() {
        // 代码
        super.change();
        System.out.println("可以变成鸟");
    }
}

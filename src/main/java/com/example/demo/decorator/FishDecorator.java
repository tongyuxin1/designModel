package com.example.demo.decorator;

public class FishDecorator extends Decorator {

    public FishDecorator(Sage sage) {
        super(sage);
    }

    @Override
    public void change() {
        // 代码
        super.change();
        System.out.println("可以变成鱼");
    }
}

package com.example.demo.decorator;

public interface Sage {
    public void change();
}
/**
 *优点：装饰类和被装饰类可以独立发展，不会相互耦合，装饰模式是继承的一个替代模式，装饰模式可以动态扩展一个实现类的功能。

 缺点：多层装饰比较复杂。

 使用场景： 1、扩展一个类的功能。 2、动态增加功能，动态撤销。
 */
package com.example.demo.observer;

//C观察者
public class C_Student extends Observer {
    public void update(String msg) {
        System.out.println("C同学："+msg+"  "+"哎呀，书拿反了！");
    }
}
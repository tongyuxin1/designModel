package com.example.demo.observer;

//B观察者
public class B_Student extends Observer {
    public void update(String msg) {
        System.out.println("B同学："+msg+"  "+"手机收起来！");
    }
}
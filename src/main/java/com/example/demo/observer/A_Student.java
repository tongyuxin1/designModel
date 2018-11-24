package com.example.demo.observer;

//A观察者
public class A_Student extends Observer {
    public void update(String msg) {
        System.out.println("A同学："+msg+"  "+"快看书！");
    }
}

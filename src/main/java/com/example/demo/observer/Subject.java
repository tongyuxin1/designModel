package com.example.demo.observer;

import java.util.ArrayList;
import java.util.List;

//主题
public class Subject {
    private List<Observer> observers = new ArrayList<>();    //状态改变
    public void setMsg(String msg) {
        notifyAll(msg);
    }
    //订阅(注册)
    public void addAttach(Observer observer) {
        observers.add(observer);
    }
    //通知所有订阅(注册)的观察者
    private void notifyAll(String msg) {
        for (Observer observer : observers) {
            observer.update(msg);
        }
    }
}

package com.example.demo.observer;

public class Main {
    public static void main(String[] args) {
        Subject subject = new Subject();

        subject.addAttach(new A_Student());
        subject.addAttach(new B_Student());
        subject.addAttach(new C_Student());

        subject.setMsg("老师来了！");
    }
}

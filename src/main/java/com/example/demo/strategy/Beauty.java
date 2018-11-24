package com.example.demo.strategy;

//美人计
public class Beauty implements Strategy{
    @Override
    public String doScheme(String name,String scheme) {
        String all = scheme+"    "+"eg:"+name;
        return "美人计:" + all;
    }
}
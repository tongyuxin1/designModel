package com.example.demo.strategy;

//空城计
public class EmptyCity implements Strategy{

    public String doScheme(String name,String scheme) {
        String all = scheme+"    "+"eg:"+name;
        return "空城计:" + all;
    }
}
package com.example.demo.strategy;

//苦肉计
public class BitterMeat implements Strategy{
    @Override
    public String doScheme(String name,String scheme) {
        String all = scheme+"    "+"eg:"+name;
        return "苦肉计:" + all;
    }
}
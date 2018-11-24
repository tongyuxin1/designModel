package com.example.demo.strategy;

//调用策略
public class Main {
    public static void main(String[] args) {
        Context context = new Context(new EmptyCity());
        System.out.println(context.executeStrategy("诸葛亮",
                "虚而示虚的疑兵之计，是一种疑中生疑的心理战，多用于己弱而敌强的情况。"));

        context = new Context(new BitterMeat());
        System.out.println(context.executeStrategy("三十六计",
                "自己伤害自己，以蒙骗他人，从而达到预先设计好的目标。"));


        context = new Context(new Beauty());
        System.out.println(context.executeStrategy("王允,貂蝉之义父",
                "它是利用色情、出卖肉体的方法，以女性勾引男性对象，以男性勾引女性对象，进行间谍情报活动。"));
    }
}

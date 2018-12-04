package com.example.demo.decorator;

public class Main {
    public static void main(String[] args) {
        Sage sage = new Monkey();

        Sage bird = new BirdDecorator(sage);
        Sage fish = new FishDecorator(sage);
        Sage bug = new BugDecorator(sage);

        Sage fishAndBird = new FishDecorator(bird);
        Sage fishAndBirdAndBug = new BugDecorator(fishAndBird);
        System.out.println("------基类------");
        sage.change();

        System.out.println("------变鸟------");
        bird.change();

        System.out.println("------变鱼------");
        fish.change();

        System.out.println("------变虫------");
        bug.change();

        System.out.println("------先变鸟在变鱼------");
        fishAndBird.change();

        System.out.println("------先变鸟在变鱼在变虫------");
        fishAndBirdAndBug.change();
    }
}

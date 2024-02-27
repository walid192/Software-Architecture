package com.directi.training.lsp.solution;

public class Pool {
    public void run()
    {
        Quackable donaldDuck = new Duck();
        Quackable electricDuck = new ElectronicDuck();

        Swimmable donSwimmable=(Swimmable) donaldDuck;
        Swimmable electricSwimmable=(Swimmable) electricDuck;

        quack(donaldDuck, electricDuck);
        swim(donSwimmable, electricSwimmable);
    }

    void quack(Quackable... ducks)
    {
        for (Quackable duck : ducks) {
            duck.quack();
        }
    }

    void swim(Swimmable... ducks)
    {
        for (Swimmable duck : ducks) {
            duck.swim();
        }
    }

    public static void main(String[] args)
    {
        Pool pool = new Pool();
        pool.run();
    }

}

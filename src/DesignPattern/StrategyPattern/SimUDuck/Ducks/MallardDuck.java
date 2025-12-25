package DesignPattern.StrategyPattern.SimUDuck.Ducks;

import DesignPattern.StrategyPattern.SimUDuck.BehaviourImplementation.FlyBehaviours.FlyWithWings;
import DesignPattern.StrategyPattern.SimUDuck.BehaviourImplementation.QuackBehaviours.Quack;

public class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehaviour = new Quack();
        flyingBehaviour = new FlyWithWings();
    }

    public void display () {
        System.out.println("I am a real Mallard Duck");
    }
}

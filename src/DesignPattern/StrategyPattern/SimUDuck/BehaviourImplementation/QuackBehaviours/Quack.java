package DesignPattern.StrategyPattern.SimUDuck.BehaviourImplementation.QuackBehaviours;

import DesignPattern.StrategyPattern.SimUDuck.BehaviourInterfaces.QuackBehaviour;

public class Quack implements QuackBehaviour {

    @Override
    public void quack() {
        System.out.println("Quack");
    }
}

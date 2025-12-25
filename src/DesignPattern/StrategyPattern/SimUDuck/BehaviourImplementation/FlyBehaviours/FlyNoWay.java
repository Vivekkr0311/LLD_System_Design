package DesignPattern.StrategyPattern.SimUDuck.BehaviourImplementation.FlyBehaviours;

import DesignPattern.StrategyPattern.SimUDuck.BehaviourInterfaces.FlyingBehaviour;

public class FlyNoWay implements FlyingBehaviour {

    @Override
    public void fly() {
        System.out.println("I cannot fly!!");
    }
}

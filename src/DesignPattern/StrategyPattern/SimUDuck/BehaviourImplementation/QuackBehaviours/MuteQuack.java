package DesignPattern.StrategyPattern.SimUDuck.BehaviourImplementation.QuackBehaviours;

import DesignPattern.StrategyPattern.SimUDuck.BehaviourInterfaces.QuackBehaviour;

public class MuteQuack implements QuackBehaviour {

    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }
}

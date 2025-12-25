package DesignPattern.StrategyPattern.SimUDuck;

import DesignPattern.StrategyPattern.SimUDuck.Ducks.Duck;
import DesignPattern.StrategyPattern.SimUDuck.Ducks.MallardDuck;

public class MiniDuckSimulator {

    public static void main(String[] args) {
        Duck mallard = new MallardDuck();

        mallard.performQuack();
        mallard.performFly();
    }
}

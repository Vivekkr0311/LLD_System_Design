package SimUDuck.Ducks;

import SimUDuck.BehaviourImplementation.FlyBehaviours.FlyWithWings;
import SimUDuck.BehaviourImplementation.QuackBehaviours.Quack;

public class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehaviour = new Quack();
        flyingBehaviour = new FlyWithWings();
    }

    public void display () {
        System.out.println("I am a real Mallard Duck");
    }
}

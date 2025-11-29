package SimUDuck.Ducks;

import SimUDuck.BehaviourInterfaces.FlyingBehaviour;
import SimUDuck.BehaviourInterfaces.QuackBehaviour;

public abstract class Duck {
    FlyingBehaviour flyingBehaviour;
    QuackBehaviour quackBehaviour;

    public Duck () { }

    public void performFly () {
        flyingBehaviour.fly();
    }

    public void performQuack () {
        quackBehaviour.quack();
    }

    public void display() {
        System.out.println("All ducks float, even the decoys!");
    }
}

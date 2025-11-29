package SimUDuck.BehaviourImplementation.QuackBehaviours;

import SimUDuck.BehaviourInterfaces.QuackBehaviour;

public class Quack implements QuackBehaviour {

    @Override
    public void quack() {
        System.out.println("Quack");
    }
}

package SimUDuck.BehaviourImplementation.QuackBehaviours;

import SimUDuck.BehaviourInterfaces.QuackBehaviour;

public class Squeak implements QuackBehaviour {

    @Override
    public void quack() {
        System.out.println("Squeak!");
    }
}

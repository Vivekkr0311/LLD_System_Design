package SimUDuck.BehaviourImplementation.FlyBehaviours;

import SimUDuck.BehaviourInterfaces.FlyingBehaviour;

public class FlyNoWay implements FlyingBehaviour {

    @Override
    public void fly() {
        System.out.println("I cannot fly!!");
    }
}

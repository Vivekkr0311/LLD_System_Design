package SimUDuck.BehaviourImplementation.FlyBehaviours;

import SimUDuck.BehaviourInterfaces.FlyingBehaviour;

public class FlyWithWings implements FlyingBehaviour {

    @Override
    public void fly() {
        System.out.println("I am flying!!");
    }
}

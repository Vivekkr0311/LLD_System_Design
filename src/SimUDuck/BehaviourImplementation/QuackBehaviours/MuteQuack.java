package SimUDuck.BehaviourImplementation.QuackBehaviours;

import SimUDuck.BehaviourInterfaces.QuackBehaviour;

public class MuteQuack implements QuackBehaviour {

    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }
}

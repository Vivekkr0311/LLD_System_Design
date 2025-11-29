package SimUDuck;

import SimUDuck.Ducks.Duck;
import SimUDuck.Ducks.MallardDuck;

public class MiniDuckSimulator {

    public static void main(String[] args) {
        Duck mallard = new MallardDuck();

        mallard.performQuack();
        mallard.performFly();
    }
}

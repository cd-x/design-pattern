package patterns;

import org.example.strategy.Duck;
import org.example.strategy.ducks.DecoyDuck;
import org.example.strategy.ducks.MallardDuck;
import org.junit.jupiter.api.Test;

public class StrategyPatternTest {

    @Test
    void test_when_mallard_duck(){
        Duck mallard = new MallardDuck();
        mallard.fly();
        mallard.quack();
    }
    @Test
    void test_when_rocket_powered_duck(){
        Duck duck = new DecoyDuck();
        duck.quack();
        duck.fly();
    }
}

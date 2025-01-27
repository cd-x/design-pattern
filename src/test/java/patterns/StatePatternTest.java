package patterns;

import org.example.state.GumballMachine;
import org.example.state.IGumballMachine;
import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

public class StatePatternTest {
    @Test
    public void test_gumball_when_filled(){
        IGumballMachine gumballMachine = new GumballMachine(5);
        IntStream.range(0,6).forEach(i->{
            gumballMachine.insertQuarter();
            gumballMachine.turnCrank();
            gumballMachine.dispense();
        });
    }
}

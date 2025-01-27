package patterns;

import org.example.state.GumballMachine;
import org.example.state.IGumballMachine;
import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
    @Test
    void test_refill_when_serving_gumball(){
        IGumballMachine gumballMachine = new GumballMachine(2);
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.refill("123", 5);
    }
    @Test
    void test_eject_when_quarter_inserted(){
        IGumballMachine gumballMachine = new GumballMachine(3);
        gumballMachine.insertQuarter();
        gumballMachine.ejectQuarter();
    }
    @Test
    void test_refill_when_no_quarter(){
        GumballMachine gumballMachine = new GumballMachine(0);
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.dispense();
        gumballMachine.refill("123", 7);
        assertEquals(7, gumballMachine.getCount());
    }
}

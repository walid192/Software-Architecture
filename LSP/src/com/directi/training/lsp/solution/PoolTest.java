package com.directi.training.lsp.solution;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PoolTest {
    @Test
    public void testPoolRun() {
        Pool pool = new Pool();
        Duck donaldDuck = new Duck();
        ElectronicDuck electricDuck = new ElectronicDuck();

        // Run the tests for Duck and ElectronicDuck
        assertEquals("Quack...", pool.quack(donaldDuck));
        assertEquals("Electronic duck is off, can't quack", pool.quackAndSwim(electricDuck));

        assertEquals("Swim...", pool.swim(donaldDuck));
        assertEquals("Electronic duck is off, can't swim", pool.quackAndSwim(electricDuck));
    }
}

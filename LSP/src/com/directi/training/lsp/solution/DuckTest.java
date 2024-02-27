package com.directi.training.lsp.solution;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class DuckTest {
    @Test
    public void testDuckQuackAndSwim() {
        Duck duck = new Duck();
        assertEquals("Quack...", duck.quack());
        assertEquals("Swim...", duck.swim());
    }
}

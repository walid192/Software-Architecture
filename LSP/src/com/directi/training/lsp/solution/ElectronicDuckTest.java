package com.directi.training.lsp.solution;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ElectronicDuckTest {
    @Test
    public void testElectronicDuckQuackAndSwim() {
        ElectronicDuck electronicDuck = new ElectronicDuck();
        electronicDuck.turnOn();
        assertEquals("Electronic duck quack...", electronicDuck.quack());
        assertEquals("Electronic duck swim", electronicDuck.swim());
        electronicDuck.turnOff();
    }
}

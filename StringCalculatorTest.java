package is.ru.StringCalculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class StringCalculatorTest {
	org.junit.runner.JUnitCore.main("is.ru.StringCalculator.StringCalculatorTest");
}

@Test
public void testEmpty() {
	assertEquals(0, StringCalculator.add(""));
}
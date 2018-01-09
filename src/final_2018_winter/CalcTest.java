package final_2018_winter;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CalcTest {

	@Test
	public void testAdd() {
	
		MyCalc calc = new MyCalc();
		assertTrue(calc.add(1, 2)==3);
	}

	@Test
	public void testMultiply() {

		MyCalc calc = new MyCalc();
		assertTrue(calc.multiply(5, 6)==30);
	}
	
	@Test
	public void testSubtract() {
		MyCalc calc = new MyCalc();
		assertTrue(calc.subtract(9, 4)==5);
	
	}
}

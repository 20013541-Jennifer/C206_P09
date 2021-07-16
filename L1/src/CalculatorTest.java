

import static org.junit.Assert.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

	@BeforeAll
	public static void setUpBeforeClass() throws Exception {
	}
	


	@AfterAll
	public static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	public void setUp() throws Exception {
	}

	@AfterEach
	public void tearDown() throws Exception {
	}

	@Test
	
	public final void testAdd() {
		int a = 4;
		int b = 3; //edited

		Calculator cal = new Calculator();
		int actual = cal.add(a, b);

		int expected = 6;
		assertEquals(actual, expected);
	} 
	
	public final void testDivide() {
		int a = 4;
		int b = 2;

		Calculator cal = new Calculator();
		int actual = cal.divide(a, b);

		int expected = 2;
		assertEquals(actual, expected);
	} 
	
	public final void testDivide2() {
		int a = 4;
		int b = 2;

		Calculator cal = new Calculator();
		int actual = cal.divide(a, b);

		int expected = 2;
		assertEquals(actual, expected);
	}

	public final void testMultiple() {
		int a = 12;
		int b = 87;

		Calculator cal = new Calculator();
		int actual = cal.multiple(a, b);

		int expected = 1044;
		assertEquals(actual, expected);
	}
	
	public final void testMultiple2() {
		int a = 12;
		int b = 87;

		Calculator cal = new Calculator();
		int actual = cal.multiple(a, b);

		int expected = 1044;
		assertEquals(actual, expected);
	}


	public final void testSubtract() {
		int a = 1234;
		int b = 8765;
		
		Calculator cal = new Calculator();
		int actual = cal.subtract(a, b);
		
		int expected = -7531;
		assertEquals( actual, expected);
	}
	
	public final void testSubtract2() {
		int a = 1234;
		int b = 8765;
		
		Calculator cal = new Calculator();
		int actual = cal.subtract(a, b);
		
		int expected = -7531;
		assertEquals( actual, expected);
	}


}

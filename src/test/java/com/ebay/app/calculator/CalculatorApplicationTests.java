package com.ebay.app.calculator;

import com.ebay.app.calculator.operations.*;
import com.ebay.app.calculator.Calculator;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class CalculatorApplicationTests {

	@Autowired
	private Calculator calculator;

	@Test
	void testAddition() {
		Number result = calculator.calculate(Operation.ADD, 3, 4);
		assertEquals(7.0, result);
	}

	@Test
	void testChainingOperations() {
		Number result = calculator.chainCalculate(10, List.of(Operation.SUBTRACT, Operation.MULTIPLY), List.of(3, 2));
		assertEquals(14.0, result);
	}

	@Test
	void testDivisionByZero() {
		Exception exception = assertThrows(ArithmeticException.class, () -> {
			calculator.calculate(Operation.DIVIDE, 10, 0);
		});

		String expectedMessage = "Cannot divide by zero";
		String actualMessage = exception.getMessage();

		assertTrue(actualMessage.contains(expectedMessage));
	}

	@Test
	void testUnsupportedOperation() {
		Exception exception = assertThrows(IllegalArgumentException.class, () -> {
			calculator.calculate(Operation.valueOf("MOD"), 10, 2);
		});

		String expectedMessage = "No enum constant com.ebay.app.calculator.Operation.MOD";
		String actualMessage = exception.getMessage();

		assertTrue(actualMessage.contains(expectedMessage));
	}
}


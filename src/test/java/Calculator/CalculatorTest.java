package Calculator;

import com.learning.Calculator.*;
import org.junit.Test; 
import org.junit.Assert; 
import org.junit.Before;

public class CalculatorTest {
private Calculator objCalcUnderTest;

@Before
public void setUp() {
//Arrange
objCalcUnderTest = new Calculator();
}

@Test
public void testAdd() { 
double a = 15; double b = 20; 
int expectedResult = 35;
//Act 
double result = objCalcUnderTest.doMath(a, b,"+");
//Assert
Assert.assertEquals(expectedResult, result);
}

@Test
public void testSubtract() {
double a = 25; double b = 20; 
int expectedResult = 5; 
double result = objCalcUnderTest.doMath(a, b,"-");
Assert.assertEquals(expectedResult, result);
}

@Test
public void testMultiply() {
double a = 10; double b = 25;
double expectedResult = 250;
double result = objCalcUnderTest.doMath(a, b,"*");
Assert.assertEquals(expectedResult, result);
}

@Test
public void testDivide() {
int a = 56; int b = 10; 
double expectedResult = 5.6; 
double result = objCalcUnderTest.doMath(a, b,"/");
Assert.assertEquals(expectedResult, result,0.00005); 
}

@Test(expected = IllegalArgumentException.class)
public void testDivideByZero() { 
int a = 15; int b = 0;
objCalcUnderTest.doMath(a, b,"/");
} 
}
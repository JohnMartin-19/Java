import org.junit.jupiter.api.*;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest{
    private Calculator calculator;

    @BeforeAll
    static void initAll(){
        System.out.println("Starting Calculator tests...");
    }

    @BeforeEach
    void setUp(){
        calculator = new Calculator();
    }

    @Test
    @DisplayName("Add two positive integers")
    void testAddition_positiveNumbers_returnsCorrectSum() {
        assertEqual(7, calculator.add(3,4));
    }

    @Test
    @DisplayName("Add two positive double")
    void testDoubleAddition_positiveNumber_returnsCorrectSum(){
        assertEqual(5.00, calculator.add(3.00,2.00));
    }

    @Test
    @DisplayName("Test multiple add operations at once using assertAll")
    void testAdd_multipleOperations_assertAll() {
        assertAll("addition operations",
                () -> assertEquals(5,   calculator.add(2, 3)),
                () -> assertEquals(0,   calculator.add(0, 0)),
                () -> assertEquals(-5,  calculator.add(-2, -3)),
                () -> assertEquals(100, calculator.add(50, 50))
        );
    }


    ///////////SUBTRACTION
    @Test
    @DisplayName("Subtract two positive integers")
    void testSubtraction_positiveNumber_returnsCorrectSubtraction(){
        assertEqual(10, calculator.subtraction(3,7));
    }

    @Test
    @DisplayName("Subtract two positive integers")
    void testSubtraction_positiveNumber_returnsCorrectSubtraction(){
        assertEual(3.00, calculator.subtraction(10.00,7.00));
    }

    @Test
    @DisplayName("Test multiple add operations at once using assertAll")
    void testSubtract_multipleOperations_assertAll() {
        assertAll("subtraction operations",
                () -> assertEquals(5,   calculator.subtraction(10, 5)),
                () -> assertEquals(0,   calculator.subtraction(0, 0)),
                () -> assertEquals(-5,  calculator.subtraction(-10, -5)),
                () -> assertEquals(100, calculator.subtraction(50, 50))
        );
    }


    ///// MULTIPLICATION
    @Test
    DisplayName("Multiply two positive integers")
    void testMultiplication_positiveNumbers_returnsTheCorrectMultiplication(){
        assertEqual(15, calculator.multiply(5,3));
    }

    @Test
    DisplayName("Multiply with Zero integers")
    void testMultiplicationWithZero_returnsAZero(){
        assertEqual(0, calculator.multiply(0,5));
    }

    ///DIVISION
    @Test
    @DisplayName("Divide two positive integers")
    void testDivide_positiveNumbers_returnsCorrectDivision(){
        assertEqual(3, calculator.divide(9,3));
    }

    @Test
    @DisplayName("Divide by zero throws ArithmeticException")
    void testDivide_byZero_throwsArithmeticException() {
        ArithmeticException exception = assertThrows(
                ArithmeticException.class,
                () -> calculator.divide(9, 0)
        );
        assertEquals("Cannot divide by zero", exception.getMessage());
    }

    @AfterEach
    void tearDown(){
        System.out.println("Tests are done");
    }

    @AfterAll
    static void done(){
        System.out.println("All calc tests are done");
    }


}
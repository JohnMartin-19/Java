import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    private Calculator calculator;

    @BeforeAll
    static void initAll() {
        System.out.println("Starting Calculator tests...");
    }

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    // ───── ADDITION ─────────────────────────────────────────────

    @Test
    @DisplayName("Add two positive integers")
    void testAddition_positiveNumbers_returnsCorrectSum() {
        assertEquals(7, calculator.add(3, 4));          // assertEqual → assertEquals
    }

    @Test
    @DisplayName("Add two positive doubles")
    void testDoubleAddition_positiveNumber_returnsCorrectSum() {
        assertEquals(5.00, calculator.add(3.00, 2.00)); // assertEqual → assertEquals
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

    // ───── SUBTRACTION ──────────────────────────────────────────

    @Test
    @DisplayName("Subtract two positive integers")
    void testSubtraction_positiveIntegers_returnsCorrectResult() {   // renamed — duplicate method name
        assertEquals(-4, calculator.subtraction(3, 7));              // 3-7 = -4, not 10
    }

    @Test
    @DisplayName("Subtract two positive doubles")
    void testSubtraction_positiveDoubles_returnsCorrectResult() {    // renamed — duplicate method name
        assertEquals(3.00, calculator.subtraction(10.00, 7.00));     // assertEual → assertEquals
    }

    @Test
    @DisplayName("Test multiple subtract operations at once using assertAll")
    void testSubtract_multipleOperations_assertAll() {
        assertAll("subtraction operations",
                () -> assertEquals(5,    calculator.subtraction(10, 5)),
                () -> assertEquals(0,    calculator.subtraction(0, 0)),
                () -> assertEquals(-5,   calculator.subtraction(-10, -5)),  // -10-(-5) = -5 ✓
                () -> assertEquals(0,    calculator.subtraction(50, 50))    // 50-50 = 0, not 100
        );
    }

    // ───── MULTIPLICATION ───────────────────────────────────────

    @Test
    @DisplayName("Multiply two positive integers")              // added missing @
    void testMultiplication_positiveNumbers_returnsTheCorrectMultiplication() {
        assertEquals(15, calculator.multiply(5, 3));            // assertEqual → assertEquals
    }

    @Test
    @DisplayName("Multiply with zero returns zero")             // added missing @
    void testMultiplicationWithZero_returnsAZero() {
        assertEquals(0, calculator.multiply(0, 5));             // assertEqual → assertEquals
    }

    // ───── DIVISION ─────────────────────────────────────────────

    @Test
    @DisplayName("Divide two positive integers")
    void testDivide_positiveNumbers_returnsCorrectDivision() {
        assertEquals(3, calculator.divide(9, 3));               // assertEqual → assertEquals
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

    // ───── LIFECYCLE ────────────────────────────────────────────

    @AfterEach
    void tearDown() {
        System.out.println("Tests are done");
    }

    @AfterAll
    static void done() {
        System.out.println("All calc tests are done");
    }
}
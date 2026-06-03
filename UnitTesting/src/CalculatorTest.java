import org.junit.jupiter.api.*;

//learning about annotations
public class CalculatorTest{
    private  Calculator calculator;

    @BeforAll
    static  void initAll(){
        // Runs ONCE before all tests in this class
        // Must be static
        System.out.println("Starting the tests");
    }

    @BeforeEach
    void init(){
        calculator = new Calculator;
    }

    @Test
    void testAddition(){
        //body/test
    }

    @Test
    @DisplayName("Division by zero should throw exception")
    void testDivisionByZero() {
        // @DisplayName gives a readable name in the test report
    }

    @Test
    @Disabled("Not implemented yet")
    void testComplexOperation() {
        // Skipped — won't run
    }

    @AfterEach
    void tearDown() {
        // Runs after EACH test
        // Good for cleanup
    }

    @AfterAll
    static void done() {
        // Runs ONCE after all tests
        // Must be static
        System.out.println("All Calculator tests finished.");
    }

}
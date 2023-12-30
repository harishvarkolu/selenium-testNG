package home;
import org.testng.annotations.*;

public class test {

    @BeforeTest
    public void beforeTest() {
        // Code to execute before the test
        System.out.println("Before Test method executed");
    }

    @Test
    public void testMethod() {
        // Your test logic goes here
        System.out.println("Test method executed");
    }

    @AfterTest
    public void afterTest() {
        // Code to execute after the test
        System.out.println("After Test method executed");
    }
}

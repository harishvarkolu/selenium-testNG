package home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class google {
    private static WebDriver driver;

    public static void main(String[] args) {
        driver = new ChromeDriver();
    }

    @BeforeTest
    public static void setUP() {
        driver.get("https://google.com");
    }

    @AfterTest
    public static void tearDown() {
        driver.quit();
    }

}

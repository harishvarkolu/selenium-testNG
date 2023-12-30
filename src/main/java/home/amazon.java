package home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon {
    public static void main(String[] args) {
        WebDriver driver = getChromeDriver();
        navigateToAmazon(driver);
        tearDown(driver);
    }

    public static void navigateToAmazon(WebDriver driver) {
        driver.get("https://amazon.com");
    }

    public static WebDriver getChromeDriver() {
        return new ChromeDriver();
    }
    private static void tearDown(WebDriver driver){
        driver.quit();
    }
}

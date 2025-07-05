// (in src/test/java/tests/ folder)

package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTest {

    @Test
    public void loginWithValidCredentials() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://example.com/login");

        // Add your login steps here (e.g., find username field, password, click login)
        System.out.println("Login test case executed");

        driver.quit();
    }
}

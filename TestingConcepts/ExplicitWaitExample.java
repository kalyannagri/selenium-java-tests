package TestingConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExplicitWaitExample {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://example.com/login");

        // Example: locating username field and sending input
        WebElement username = driver.findElement(By.id("username"));
        username.sendKeys("testUser");

        // Example: login button
        WebElement loginBtn = driver.findElement(By.id("login"));
        loginBtn.click();

        System.out.println("Login script executed successfully.");
        driver.quit();
    }
}

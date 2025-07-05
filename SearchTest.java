package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SearchTest {

    @Test
    public void searchItem() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://example.com");

        // Add your search steps here (e.g., search bar, enter keyword, assert results)
        System.out.println("Search test executed");

        driver.quit();
    }
}

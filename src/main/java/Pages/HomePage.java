package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    private By searchField= By.id("twotabsearchtextbox");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public ResultsPage search(String text) {
        driver.findElement(searchField).sendKeys(text+"\n");
        return new ResultsPage(driver);
    }

}

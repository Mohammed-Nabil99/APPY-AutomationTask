package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.time.Duration;
import java.util.List;

public class ResultsPage{
    private WebDriver driver;
    private By resultTxt=By.xpath("//span[@class=\"a-size-base-plus a-color-base a-text-normal\"]");
    private By prices=By.xpath("//span[@class=\"a-price-whole\"]");
    public ResultsPage(WebDriver driver){
        this.driver = driver;
    }


    public String getResultTxt(int productIndex){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        List<WebElement>elements= wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(resultTxt));
        return elements.get(productIndex).getText();
    }


    public String getPrice(int productIndex){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        List<WebElement>elements= wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(prices));
        return elements.get(productIndex).getText();
    }


}
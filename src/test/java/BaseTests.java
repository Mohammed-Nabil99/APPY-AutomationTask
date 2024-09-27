import Pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTests {
    private WebDriver driver;
    protected HomePage homePage;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://www.amazon.eg/-/en/");
        driver.manage().window().maximize();
        homePage= new HomePage(driver);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

}

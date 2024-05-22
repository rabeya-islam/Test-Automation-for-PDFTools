import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Merge_pdf {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://softekoaddins.xyz/");
        String pdfToolsTitle = driver.getTitle();
        System.out.println("Calculator title is: " + pdfToolsTitle);

        Thread.sleep(1000);
        driver.quit();
    }
}

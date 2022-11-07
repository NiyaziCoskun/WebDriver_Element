package video3_webElements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class WebElements01 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //1- https:www.amazon.com sayfasina gidin
        driver.get("https://amazon.com");
        //2- Arama cubuguna "Nutella" yazdirin
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("Nutella");
        //3- Nutella yazdiktan sonra ENTER' a basarak arama islemini yapin
        searchBox.submit();
        //4- Bulunan sonuc sayisini yazdirin.
        WebElement resultElement = driver.findElement(By.xpath("//div[class='asadaasdasdas'"));
        System.out.println(resultElement.getText());

    }
}

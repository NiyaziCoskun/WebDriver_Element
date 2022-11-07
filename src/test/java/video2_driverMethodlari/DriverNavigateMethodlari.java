package video2_driverMethodlari;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverNavigateMethodlari {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //1- driver.navigate().to("url") --> istenen url' e gider
        //driver.get("url") ile ayni islemi yapar ama forward and back yapilmasina imkan tanir
        driver.get("https://www.amazon.com");
        driver.navigate().to("https://www.amazon.com");

        //2- driver.navigate().back(); --> bir onceki sayfaya donus yapar
        driver.navigate().back(); //ornegimizde amazona donus yapacaktir

        //3- driver.navigate().forward(); --> back() ile geldigi sayfaya yeniden gider
        driver.navigate().forward(); // facebook a geri donus yapacaktir

        //4 driver.navigate.refresh(); --> icinde oldugu sayfayi yeniler
        driver.navigate().refresh();

        //5- driver olusturuldugu acilan sayfayi kapatmak istersek
        driver.close();

        //6-driver calisirken birden fazla tab veya window actiyssa tumunu kapatmak icin
        driver.quit();
    }
}

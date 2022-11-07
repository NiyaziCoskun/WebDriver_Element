package video2_driverMethodlari;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DriverMangeMethodlari {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //1- driver .mange().window() methodlari
        //1 A- driver .mange().window().getSize() --> icinde oldugu sayfanin pixel olarak olculerini döndürür
        System.out.println(driver.manage().window().getSize()); // (1050, 832) pixel
        System.out.println(driver.manage().window().getSize().height); // 832

        //1-b driver .mange().window().getPosition() --> icinde oldugu sayfanin pixel olarak konumunu döndürür
        System.out.println(driver.manage().window().getPosition());

        //1-c driver .mange().window().setPosition()(new Point(15,15));
        // icinde oldugu sayfanin sol alt kösesini bizim yapacagimiz pixel noktasina tasir
        driver.manage().window().setPosition(new Point(15,15));

        //1-d driver .mange().window().setSize(new Dimension(width:900, height:600));
        // icinde oldugu sayfanin sol alt kosesi sabit olarak bizim yazacagimiz olculeri getirir
        driver.manage().window().setSize(new Dimension(900,600));

        //konumu ve boyutu yeniledikten sonra tekrar yazdiralim
        System.out.println("yeni pencere olculeri :" + driver.manage().window().getSize()); // (900,600)
        System.out.println("yeni pencere konumu :" + driver.manage().window().getPosition());// (15 ,15)

        //1-E driver.manage().window().maximize(); --> icinde oldugu sayfayi maximize yapar
        //1-F driver.manage().window().fullscreen(); --> icinde oldugu sayfayi fullscreen yapar

        //farklarini görmek icin bu methodalri kullanip, baslangic noktolarini ve boyutlarini yazdiralim
        driver.manage().window().maximize();
        System.out.println("maximize konum : " + driver.manage().window().getPosition()); // (-8, -8)
        System.out.println("maximize boyut : " + driver.manage().window().getSize()); //(1616, 868)

        driver.manage().window().fullscreen();
        System.out.println("fullscreen konum : " + driver.manage().window().getPosition()); // (0, 0)
        System.out.println("fullscreen boyut : " + driver.manage().window().getSize()); //(1616, 868)

        //1-G  driver.manage().window().minimize(); --> sayfayi simge durumunda kucultur#
        driver.manage().window().minimize();

        //2- driver.manage().timeouts() methodlari

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));








    }
}

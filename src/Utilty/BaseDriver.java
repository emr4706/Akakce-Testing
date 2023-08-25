package Utilty;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseDriver {
    public static WebDriver driver; // SingletonDriver method

    static{  //bunun sarti extends olmasi ve basta yer almasi mi
        driver = new ChromeDriver();
        //driver.manage().window().maximize(); // Ekranı max yapıyor.
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20)); // 20 sn mühlet: sayfayı yükleme mühlet
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));  // 20 sn mühlet: elementi bulma mühleti
    }

    public static void BekleVeKapat(){
        MyFunc.Bekle(5);
        driver.quit();
    }
}

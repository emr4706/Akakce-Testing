package Main;

import Utilty.BaseDriver;
import Utilty.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class Main_Test extends BaseDriver {

    @Test //Selim bey
    public void Register() {
        driver = new ChromeDriver();

        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.akakce.com/");

        WebElement hesapAc= driver.findElement(By.xpath("//*[@id=\"H_rl_v8\"]/a[1]"));
        hesapAc.click();
        MyFunc.Bekle(2);

        WebElement ad= driver.findElement(By.xpath("//input[@id='rnufn']"));
        ad.sendKeys("Selim");
        MyFunc.Bekle(2);

        WebElement soyad=driver.findElement(By.xpath("//input[@id='rnufs']"));
        soyad.sendKeys("Yilmaz");
        MyFunc.Bekle(2);

        WebElement email=driver.findElement(By.xpath("//input[@id='rnufe1']"));
        email.sendKeys("grup16basarir@gmail.com");
        MyFunc.Bekle(2);

        WebElement emailT=driver.findElement(By.xpath("//input[@id='rnufe2']"));
        emailT.sendKeys("grup16basarir@gmail.com");
        MyFunc.Bekle(2);

        WebElement sifre= driver.findElement(By.xpath("//input[@id='rnufp1']"));
        sifre.sendKeys("1234567Ss");
        MyFunc.Bekle(2);

        WebElement sifreT= driver.findElement(By.xpath("//input[@id='rnufp2']"));
        sifreT.sendKeys("1234567Ss");
        MyFunc.Bekle(2);

        WebElement cinsiyetE= driver.findElement(By.xpath("//input[@id='rngm']"));
        cinsiyetE.click();
        MyFunc.Bekle(2);

        WebElement ilsec=driver.findElement(By.xpath("//*[@id='locpr']"));
        Select il=new Select(ilsec);
        il.selectByIndex(1);
        MyFunc.Bekle(3);

        WebElement ilcesec=driver.findElement(By.xpath("//*[@id='locds']"));
        Select ilce =new Select(ilcesec);
        ilce.selectByIndex(5);
        MyFunc.Bekle(2);

        WebElement webGun=driver.findElement(By.xpath("//*[@id='bd']"));
        WebElement webAy=driver.findElement(By.xpath("//*[@id='bm']"));
        WebElement webYil=driver.findElement(By.xpath("//*[@id='by']"));

        Select day=new Select(webGun);
        Select month=new Select(webAy);
        Select year=new Select(webYil);

        day.selectByVisibleText("10");
        month.selectByValue("5");
        year.selectByVisibleText("1990");

        WebElement KullanimSoz= driver.findElement(By.xpath("//input[@id='rnufpca']"));
        KullanimSoz.click();

        WebElement BilgilendirmeButonu= driver.findElement(By.xpath("//input[@id='rnufnee']"));
        BilgilendirmeButonu.click();

        WebElement hesapacma=driver.findElement(By.xpath("//input[@id='rfb']"));
        hesapacma.click();

        BekleVeKapat();
    }

        @Test //Zeynep hanim
        public void Account_verification () {
            driver = new ChromeDriver();

            //Codu bu alana yazabiliriz

            BekleVeKapat();
        }

        @Test //Elife hanim
        public void Login () {
            driver = new ChromeDriver();

            //Codu bu alana yazabiliriz

            BekleVeKapat();
        }

        @Test //Osman bey
        public void Logout () {
            driver = new ChromeDriver();

            //Codu bu alana yazabiliriz

            BekleVeKapat();
        }

        @Test //Dilek hanim
        public void Check_order_list () {
            driver = new ChromeDriver();

            //Codu bu alana yazabiliriz

            BekleVeKapat();
        }

        @Test //Akif bey
        public void Check_message_box () {


            //Codu bu alana yazabiliriz


            @Test //Suleyman bey
            public void Delete_account () {
                driver = new ChromeDriver();

                //Codu bu alana yazabiliriz

                BekleVeKapat();
            }

        }
    }
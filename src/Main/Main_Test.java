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
    public void Register(){
        driver = new ChromeDriver();

        //Codu bu alana yazabiliriz

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
    public void Account_verification(){
        driver = new ChromeDriver();

        driver.get("https://www.akakce.com/");

        WebElement hesapLogin=driver.findElement(By.xpath("//a[text()='Giriş Yap']"));
        hesapLogin.click();

        WebElement emailGiris=driver.findElement(By.xpath("//input[@id=\"life\"]"));
        emailGiris.sendKeys("grup16basarir@gmail.com");

        WebElement sifre= driver.findElement(By.xpath("//input[@id=\"lifp\"]"));
        sifre.sendKeys("1234567Ss");

        WebElement girisYap= driver.findElement(By.xpath("  //input[@id=\"lfb\"]"));
        girisYap.click();

        MyFunc.Bekle(3);

        WebElement hesabim= driver.findElement(By.xpath("//div[@id='HM_v8']"));
        //System.out.println(hesabim.getText());

        hesabim.getText().contains("Selim");



        BekleVeKapat();
    }

    @Test //Elife hanim
    public void Login(){
        driver = new ChromeDriver();

        //Codu bu alana yazabiliriz

        BekleVeKapat();
    }

    @Test //Osman bey
    public void Logout(){
        driver = new ChromeDriver();

        //Codu bu alana yazabiliriz

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.akakce.com/");
        MyFunc.Bekle(2);

        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        MyFunc.Bekle(2);

        WebElement girisYap = driver.findElement(By.xpath("(//a[text()='Giriş Yap'])[1]"));
        girisYap.click();
        MyFunc.Bekle(2);

        WebElement inputEmail = driver.findElement(By.xpath("//input[@id='life']"));
        inputEmail.sendKeys("grup16basarir@gmail.com");
        MyFunc.Bekle(2);

        WebElement inputPassword = driver.findElement(By.xpath("//input[@id='lifp']"));
        inputPassword.sendKeys("1234567Ss");
        MyFunc.Bekle(2);

        WebElement girisYapTikla = driver.findElement(By.xpath("(//input[@type='submit'])[2]"));
        girisYapTikla.click();
        MyFunc.Bekle(2);

        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        MyFunc.Bekle(2);

        WebElement hesapAd = driver.findElement(By.xpath("(//a[@rel='nofollow'])[1]"));
        Actions aksiyonlar = new Actions(driver);
        Action aksiyon = aksiyonlar.moveToElement(hesapAd).build();
        aksiyon.perform();
        MyFunc.Bekle(2);

        WebElement logOut = driver.findElement(By.xpath("//a[text()='Çık']"));
        logOut.click();
        MyFunc.Bekle(2);

        WebElement dogrulama = driver.findElement(By.xpath("(//div[contains(@id, 'v8')])[1]"));
        Assert.assertTrue(dogrulama.getText().contains("Giriş Yap"));

        BekleVeKapat();
    }

    @Test //Dilek hanim
    public void Check_order_list(){
        driver = new ChromeDriver();

        //Codu bu alana yazabiliriz

        BekleVeKapat();
    }

    @Test //Akif bey
    public void Check_message_box(){
        driver = new ChromeDriver();

        //Codu bu alana yazabiliriz

        BekleVeKapat();
    }

    @Test //Suleyman bey
    public void Delete_account(){
        driver = new ChromeDriver();

        //Codu bu alana yazabiliriz

        BekleVeKapat();
    }

}

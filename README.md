# Ak import Utlity.BaseDriver;

       import Utlity.MyFunc;
       import org.junit.Assert;
       import org.junit.Test;
       import org.openqa.selenium.By;
       import org.openqa.selenium.WebDriver;
       import org.openqa.selenium.WebElement;
       import org.openqa.selenium.chrome.ChromeDriver;
       import org.openqa.selenium.interactions.Action;
       import org.openqa.selenium.interactions.Actions;
       public class calisma extends BaseDriver {
        @Test
        public void Test1() {

         WebDriver driver = new ChromeDriver();
         driver.get("https://www.akakce.com/");

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

         WebElement hesapAd = driver.findElement(By.xpath("(//a[@rel='nofollow'])[1]"));
         Actions aksiyonlar = new Actions(driver);
         Action aksiyon = aksiyonlar.moveToElement(hesapAd).build();
         aksiyon.perform();
         MyFunc.Bekle(3);

         WebElement hesabim = driver.findElement(By.xpath("//a[text()='Hesabım']"));
         hesabim.click();

         WebElement hesabimisil = driver.findElement(By.xpath("//*[@id=\"AL\"]/li[4]/a[4]"));
         hesabim.click();

         WebElement sifrebox = driver.findElement(By.id("p"));
         sifrebox.sendKeys("1234567Ss");

         public static void  MyFunc.Bekle(3);


         try {

           Thread.sleep(sn * 1000l);
          } catch (InterruptedException e) {
           throw new RuntimeException(e);

          }
         }

        }

akce-Testing

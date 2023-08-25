package Main;

import Utilty.BaseDriver;
import Utilty.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class Main_Test extends BaseDriver {

    @Test //Selim bey
    public void Register(){
        driver = new ChromeDriver();

        //Codu bu alana yazabiliriz

        BekleVeKapat();
    }

    @Test //Zeynep hanim
    public void Account_verification(){
        driver = new ChromeDriver();

        //Codu bu alana yazabiliriz

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

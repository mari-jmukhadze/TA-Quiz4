package POM_Allure;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.*;
import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.Assert;
import javax.naming.Name;

//import static jdk.internal.org.jline.utils.InfoCmp.Capability.user1;
//import static net.sourceforge.htmlunit.corejs.javascript.Context.enter;


public class login extends BaseTest {
//    private static WebElement FirstName;
    //    private Object User;
//
//    public login(Object user) {
//        User = user;
//    }
    WebElement FirstName = driver.findElement(By.id("firstName"));
    WebElement Surname = driver.findElement(By.id("lastName"));
    WebElement Gender = driver.findElement(By.id("gender"));
    WebElement Number = driver.findElement(By.id("userNumber"));
    WebElement submit = driver.findElement(By.id("Submit"));

    @BeforeTest
    public void setup() {
        BaseTest baseTest=new BaseTest();
        baseTest.initialize();
        driver=getDriver();
        driver.get("https://www.demoqa.com/books");


        WebElement Form = (WebElement) By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[2]");
        Form.click();

        WebElement PracticeForm = driver.findElement(By.xpath("//*[@id=\"item-0\"]"));
        PracticeForm.click();

    }



    @Test(dataProvider = "users")
    public void fillingform(String a, String b, String g, String n) {
            
            FirstName.sendKeys(a);
            Surname.sendKeys(b);
            Gender.sendKeys(g);
            Number.sendKeys(n);
            submit.click();

        WebElement lasttext = driver.findElement(By.id("example-modal-sizes-title-lg"));

        if (lasttext.getText().equals("Thanks for submitting the form")){
            System.out.println("Thank you message is visible");
        }


    }

    @DataProvider (name = "users")
    public User Base() {

        return new User(FirstName.getText(), Surname.getText(), Gender.getText(), Number.getText());

        //will it work though?
    }


}


package POM_Allure;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static jdk.internal.org.jline.utils.InfoCmp.Capability.enter_alt_charset_mode;
import static jdk.internal.org.jline.utils.InfoCmp.Capability.user1;
import static net.sourceforge.htmlunit.corejs.javascript.Context.enter;


public class login extends BaseTest {
//    private Object User;
//
//    public login(Object user) {
//        User = user;
//    }



    
    @DataProvider (name = "users")
    public void users {
        User user1 = new User("Mariam", "Jmukhadze", "Female", "0235478951");
        User user2 = new User("Alina", "Tkabladze", "Female", "0124589657");
    }

    @Test(dataProvider = "users")
    public void fillingform(User user) {
            By FirstName = By.id("firstName");
            By Surname = By.id("lastName");
            By Gender = By.id("gender");
            By Number = By.id("userNumber");

            enter(user1.getNames());

    }

    private void enter(String[] names) {

    }

    @BeforeTest
    public void setup() {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
//        driver=getDriver();
        driver.get("https://demoqa.com/");

//        WebElement Form = (WebElement) By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[2]");

    }


}


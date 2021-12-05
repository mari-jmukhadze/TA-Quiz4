package POM_Allure;

import org.jsoup.Connection;

import javax.lang.model.element.Name;
import org.testng.annotations.Test;

import static POM_Allure.login.*;

public class User extends BaseTest {
    String Name;
    String Surname;
    String Gender;
    String Number;

    public User(String Name, String Surname, String Gender, String Number) {
        this.Name = Name;
        this.Surname = Surname;
        this.Gender = Gender;
        this.Number = Number;

    }

    @Test //(descripton = "add new student")
    public void register () {
        login.fillingform("Mariam", "Jmukhadze", "Female", "0532145789");

        //es rogor unda gavasworo, staticze mere login classhsi vichedebi

    }
}

package pages;

import static com.codeborne.selenide.Selenide.$;

import org.openqa.selenium.By;


public class LoginPage {

    private static final String USER = "EugenBorisik";
    private static final String USER_PASSWORD = "qwerty12345";
    private static final By USER_NAME = By.id("Username");
    private static final By PASSWORD = By.id("Password");
    private static final By SUBMIT = By.id("SubmitButton");
    private static final By SIGN_OUT = By.cssSelector("a[title=\"Sign out\"]");


    public static void login() {
        $(USER_NAME).sendKeys(USER);
        $(PASSWORD).sendKeys(USER_PASSWORD);
        $(SUBMIT).submit();
    }


    public static void quit() {
        $(SIGN_OUT).click();
    }
}

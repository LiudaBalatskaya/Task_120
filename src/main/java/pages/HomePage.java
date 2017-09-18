package pages;


import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.title;

import org.openqa.selenium.By;

public class HomePage {

    private static final By OFFICE = By.id("officeWidgetContent");
    private static final By ROWS = By.cssSelector(".widgetSelectableRow");


    public static String pageLoad() {
        $(byText("RMSys - Home"));
        return title().toString();
    }


    public static void tableOfficeName() {
        $(byText("Office Layouts"));
    }


    public static void officeLayouts() {
        $(OFFICE).$(ROWS).shouldBe(visible);
    }


    public static boolean office118() {
        return $(byText("Chapaeva 118")).exists();
    }
}


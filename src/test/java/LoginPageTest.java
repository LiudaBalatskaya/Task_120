import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

import java.net.MalformedURLException;
import java.net.URL;


public class LoginPageTest {
    public static final String USERNAME = "LiudaBalatskaya";
    public static final String ACCES_KEY = "95169fc8-d226-4258-b415-a40604d1e2fa";

    public static final String URL_SAUCELABS = "https://" + USERNAME + ":" + ACCES_KEY + "@ondemand.saucelabs.com:443/wd/nub";

    public WebDriver driver;

    protected static final String BASE_URL = "https://192.168.100.26/";


    @Test
    public void saucelabsWindowsTest() throws MalformedURLException {
        DesiredCapabilities caps = DesiredCapabilities.firefox();
        caps.setCapability("platform", "Windows 8.1");
        caps.setCapability("version", "39.0");
        driver = new RemoteWebDriver(new URL(URL_SAUCELABS), caps);
        driver.get(BASE_URL);

        LoginPage.login();
        String title = HomePage.pageLoad();
        Assert.assertEquals(title, "RMSys - Home");
        driver.close();
    }


    @Test
    public void saucelabsLinuxTest() throws MalformedURLException {
        DesiredCapabilities caps = DesiredCapabilities.chrome();
        caps.setCapability("platform", "Linux");
        caps.setCapability("version", "40");
        driver = new RemoteWebDriver(new URL(URL_SAUCELABS), caps);
        driver.get(BASE_URL);

        LoginPage.login();
        String title = HomePage.pageLoad();
        Assert.assertEquals(title, "RMSys - Home");
        driver.close();
    }


    @Test
    public void saucelabsWindows10Test() throws MalformedURLException {
        DesiredCapabilities caps = DesiredCapabilities.edge();
        caps.setCapability("platform", "Windows 10");
        caps.setCapability("version", "40.15063");
        driver = new RemoteWebDriver(new URL(URL_SAUCELABS), caps);
        driver.get(BASE_URL);

        LoginPage.login();
        String title = HomePage.pageLoad();
        Assert.assertEquals(title, "RMSys - Home");
        driver.close();
    }
}


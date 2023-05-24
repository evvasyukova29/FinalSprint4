package ru.praktikum.makeorder;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.praktikum.pageobject.OrderPage;
import ru.praktikum.pageobject.PageMain;
import java.time.Duration;
import static ru.praktikum.config.ApplicationConfig.APP_URL;

@RunWith(Parameterized.class)
public class OrderPageTest
{
    private WebDriver driver;
    private static By orderButton;
    private static String name;
    private static String surname;
    private static String address;
    private static String phoneNumber;
    private static String dayWhatIWant;
    private static String comment;
    public OrderPageTest(By orderButton, String name, String surname, String address, String phoneNumber, String dayWhatIWant, String comment)
    {
        OrderPageTest.orderButton = orderButton;
        OrderPageTest.name = name;
        OrderPageTest.surname = surname;
        OrderPageTest.address = address;
        OrderPageTest.phoneNumber = phoneNumber;
        OrderPageTest.dayWhatIWant = dayWhatIWant;
        OrderPageTest.comment = comment;
    }

    //-----------Test Data------------//
    @Parameterized.Parameters // параметризация
    public static Object[][] getCredentials()
    {
        return new Object[][]
                {
                    {PageMain.orderButtonAbove, "Екатерина", "Скворцова", "Проспект Вернадского",
                            "+79993039956", "03.12.2022", "Комментарий"},
                    {PageMain.orderButtonCenter, "Василий", "Епифанов", "Северная улица",
                            "88005553535", "02.12.2022", "Комментарий 2"}
                };
    }

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        //driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        PageMain mainPage = new PageMain(driver);
        driver.get(APP_URL);
        mainPage.clickCookie();
    }

    @Test
    public void makeAnOrder()
    {
        PageMain mainPage = new PageMain(driver);
        mainPage.clickOrderButton(orderButton);
        OrderPage objOrderPage = new OrderPage(driver);

        //-------First Form--------//
        objOrderPage.enterName(name);
        objOrderPage.enterSurname(surname);
        objOrderPage.enterAddress(address);
        objOrderPage.enterPhoneNumber(phoneNumber);
        objOrderPage.clickNextButton();
        //-------Second Form--------//
        objOrderPage.chooseDate(dayWhatIWant);
        objOrderPage.chooseRentalPeriod();
        objOrderPage.chooseColor();
        objOrderPage.writeComment(comment);
        objOrderPage.clickFinalOrderButton();
        objOrderPage.confirmOrder();
        objOrderPage.checkOrderComplete();

    }


    @After
    public void tearDown()
    {
        driver.quit();
    }


}

package ru.praktikum.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static ru.praktikum.config.ApplicationConfig.APP_URL;

public class OrderPage
{
    WebDriver driver;

    public OrderPage(WebDriver driver)
    {
        this.driver = driver;
        driver.get(APP_URL);
    }

    //-------------First Form For Making Order--------------//
    private final By nameField = By.xpath(".//input[contains(@placeholder, 'Имя')]");
    //поле Имя
    private final By surnameField = By.xpath(".//input[contains(@placeholder, 'Фамилия')]");
    //поле Фамилия
    private final By addressField = By.xpath(".//input[contains(@placeholder, 'куда привезти заказ')]");
    //поле с адресом заказа
    private final By metroField = By.xpath(".//input[@class='select-search__input']");
    //поле с выбором станции метро
    private final By metroStation = By.xpath(".//div[@class='select-search__select']/ul/li/button/div[2]");
    //Выбор станции метро(2) из списка
    private final By telephoneField = By.xpath(".//div[5]/input[contains(@class, 'Input_Input__1iN_Z')]");
    //поля ввода номера телефона
    private final By nextButton = By.xpath(".//button[text()='Далее']"); //кнопка Далее

    //---------------Second Form For Making Order-------------//

    private final By dateField = By.xpath(".//input[contains(@placeholder, 'Когда привезти самокат')]");
    //поле Когда привезти самокат
    private final By choosingDate = By.xpath(".//div[contains(@class, 'react-datepicker__day--selected')]");
    //выбор даты когда вернуть самокат
    private final By rentField = By.xpath(".//div[@class='Dropdown-placeholder']");
    //поле с выпадающим списком со сроком аренды самоката
    private final By choosingRentalPeriod = By.xpath(".//div[text()='сутки']");
    //выбор периода аренды из списка
    private final By colorOfScooter = By.id("black"); //выбор черного цвета
    private final By commentField = By.xpath(".//input[contains(@placeholder, 'Комментарий для курьера')]");
    //поле с комментарием
    private final By finalOrderButton = By.xpath(".//div[3]/button[text()='Заказать']");
    //финальная кнопка заказать
    private final By confirmationOrderButton = By.xpath(".//button[text()='Да']");
    //Всплывающее окно хотите оформить заказ? Кнопка Да
    private final By notificationOfSuccessfulOrder = By.xpath(".//div[contains(text(), 'Заказ оформлен')]");



    //-----------------Methods For The First Form---------------//
    public void enterName(String name)
    {
        driver.findElement(nameField).sendKeys(name); //ввести имя в поле
    }

    public void enterSurname(String surname)
    {
        driver.findElement(surnameField).sendKeys(surname); //ввести фамилию в поле
    }

    public void enterAddress(String address)
    {
        driver.findElement(addressField).sendKeys(address); //заполнить адрес доставки
    }

    public void clickMetroStation()
    {
        driver.findElement(metroField).click();
        driver.findElement(metroStation).click(); //выбрать станцию метро
    }

    public void enterPhoneNumber(String number) {
        driver.findElement(telephoneField).sendKeys(number); //ввести номер телефона
    }

    public void clickNextButton() {
        driver.findElement(nextButton).click(); //нажать на кнопку далее
    }


    //-----------------Methods For The Second Form---------------//
    public void chooseDate(String dayWhatIWant)
    {
        driver.findElement(dateField).sendKeys(dayWhatIWant);
        driver.findElement(choosingDate).click();  //выбор даты
    }

    public void chooseRentalPeriod()
    {
        driver.findElement(rentField).click();
        driver.findElement(choosingRentalPeriod).click(); //выбор срока аренды
    }

    public void chooseColor()
    {
        driver.findElement(colorOfScooter).click(); //выбор чек-бокса с цветом самоката
    }

    public void writeComment(String comment)
    {
        driver.findElement(commentField).sendKeys(comment); // комментарий по желанию
    }

    public void clickFinalOrderButton()
    {
        driver.findElement(finalOrderButton).click(); //нажать на финальную кнопку Заказать
    }

    public void confirmOrder()
    {
        driver.findElement(confirmationOrderButton).click(); //подтвердить намерение заказать
    }

    public void checkOrderComplete()
    {
        driver.findElement(notificationOfSuccessfulOrder).isDisplayed(); //сообщение об успешном заказе
    }
}

package ru.praktikum.faq;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runners.Parameterized;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.praktikum.makeorder.OrderPageTest;
import ru.praktikum.pageobject.PageMain;

import java.time.Duration;

import static org.junit.Assert.assertEquals;
import static ru.praktikum.config.ApplicationConfig.APP_URL;

public class PageMainTestFaq
{

        private WebDriver driver;

    //-----------Текст ответов на вопросы------------------------------------
    public static String questionOneText = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";
    //Текст ответа на вопрос №1
    public static String questionTwoText = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";
    //Текст ответа на вопрос №2
    public static String questionThreeText = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";
    //Текст ответа на вопрос №3
    public static String questionFourText = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";
    //Текст ответа на вопрос №4
    public static String questionFiveText = "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.";
    //Текст ответа на вопрос №5
    public static String questionSixText = "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.";
    //Текст ответа на вопрос №6
    public static String questionSevenText = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";
    //Текст ответа на вопрос №7
    public static String questionEightText = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";
    //Текст ответа на вопрос №8

        @Before
        public void setUp()
        {
            driver = new ChromeDriver();
            driver.get(APP_URL);
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.manage().window().maximize();
            PageMain mainPage = new PageMain(driver);
            mainPage.scrollToElement();
            mainPage.clickCookie();

        }
        @Test
        public void testQuestionOne()
        {
            PageMain mainPage = new PageMain(driver);
            mainPage.clickButtonOneQuestion(PageMain.questionOne);
            assertEquals(questionOneText, mainPage.getTextQuestionOne());  // сравнить текст
        }

        @Test
        public void testQuestionTwo() {
            PageMain mainPage = new PageMain(driver);
            mainPage.clickButtonTwoQuestion(PageMain.questionTwo);
            assertEquals(questionTwoText, mainPage.getTextQuestionTwo());  // сравнить текст
        }

        @Test
        public void testQuestionThree()
        {
            PageMain mainPage = new PageMain(driver);
            mainPage.clickButtonThreeQuestion(PageMain.questionThree);
            assertEquals(questionThreeText, mainPage.getTextQuestionThree());  // сравнить текст
        }

        @Test
        public void testQuestionFour() {
            PageMain mainPage = new PageMain(driver);
            mainPage.clickButtonFourQuestion(PageMain.questionFour);
            assertEquals(questionFourText, mainPage.getTextQuestionFour());  // сравнить текст
        }

        @Test
        public void testQuestionFive()
        {
            PageMain mainPage = new PageMain(driver);
            mainPage.clickButtonFiveQuestion(PageMain.questionFive);
            assertEquals(questionFiveText, mainPage.getTextQuestionFive());  // сравнить текст
        }

        @Test
        public void testQuestionSix() {
            PageMain mainPage = new PageMain(driver);
            mainPage.clickButtonSixQuestion(PageMain.questionSix);
            assertEquals(questionSixText, mainPage.getTextQuestionSix());  // сравнить текст
        }

        @Test
        public void testQuestionSeven() {
            PageMain mainPage = new PageMain(driver);
            mainPage.clickButtonSevenQuestion(PageMain.questionSeven);
            assertEquals(questionSevenText, mainPage.getTextQuestionSeven());  // сравнить текст
        }

        @Test
        public void testQuestionEight() {
            PageMain mainPage = new PageMain(driver);
            mainPage.clickButtonEightQuestion(PageMain.questionEight);
            assertEquals(questionEightText, mainPage.getTextQuestionEight());  // сравнить текст
        }

        @After
        public void tearDown()
        {
            driver.quit();
        }
    }

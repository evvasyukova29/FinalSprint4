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
        private static By question;
        private static By questionText;
    public PageMainTestFaq(By question,By questionText)
    {
        PageMainTestFaq.question = question;
        PageMainTestFaq.questionText = question;
    }

    @Parameterized.Parameters // параметризация
    public static Object[][] getAnswerForQuiestions()
    {
        return new Object[][]
                {
                        {PageMain.questionOne, PageMain.questionTwoText},
                        {PageMain.questionTwo, PageMain.questionTwoText},
                        {PageMain.questionThree, PageMain.questionThreeText},
                        {PageMain.questionFour, PageMain.questionFourText},
                        {PageMain.questionFive, PageMain.questionFiveText},
                        {PageMain.questionSix, PageMain.questionSixText},
                        {PageMain.questionSeven, PageMain.questionSevenText},
                        {PageMain.questionEight, PageMain.questionEightText},
                };
    }
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
            assertEquals(PageMain.questionOneText, mainPage.getTextQuestionOne());  // сравнить текст
        }

        @Test
        public void testQuestionTwo() {
            PageMain mainPage = new PageMain(driver);
            mainPage.clickButtonTwoQuestion(PageMain.questionTwo);
            assertEquals(PageMain.questionTwoText, mainPage.getTextQuestionTwo());  // сравнить текст
        }

        @Test
        public void testQuestionThree()
        {
            PageMain mainPage = new PageMain(driver);
            mainPage.clickButtonThreeQuestion(PageMain.questionThree);
            assertEquals(PageMain.questionThreeText, mainPage.getTextQuestionThree());  // сравнить текст
        }

        @Test
        public void testQuestionFour() {
            PageMain mainPage = new PageMain(driver);
            mainPage.clickButtonFourQuestion(PageMain.questionFour);
            assertEquals(PageMain.questionFourText, mainPage.getTextQuestionFour());  // сравнить текст
        }

        @Test
        public void testQuestionFive()
        {
            PageMain mainPage = new PageMain(driver);
            mainPage.clickButtonFiveQuestion(PageMain.questionFive);
            assertEquals(PageMain.questionFiveText, mainPage.getTextQuestionFive());  // сравнить текст
        }

        @Test
        public void testQuestionSix() {
            PageMain mainPage = new PageMain(driver);
            mainPage.clickButtonSixQuestion(PageMain.questionSix);
            assertEquals(PageMain.questionSixText, mainPage.getTextQuestionSix());  // сравнить текст
        }

        @Test
        public void testQuestionSeven() {
            PageMain mainPage = new PageMain(driver);
            mainPage.clickButtonSevenQuestion(PageMain.questionSeven);
            assertEquals(PageMain.questionSevenText, mainPage.getTextQuestionSeven());  // сравнить текст
        }

        @Test
        public void testQuestionEight() {
            PageMain mainPage = new PageMain(driver);
            mainPage.clickButtonEightQuestion(PageMain.questionEight);
            assertEquals(PageMain.questionEightText, mainPage.getTextQuestionEight());  // сравнить текст
        }

        @After
        public void tearDown()
        {
            driver.quit();
        }
    }

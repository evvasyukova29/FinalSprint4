package ru.praktikum.faq;


import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.praktikum.pageobject.PageMain;

import java.time.Duration;

import static org.junit.Assert.assertEquals;
import static ru.praktikum.config.ApplicationConfig.APP_URL;

public class PageMainTestFaq
{

        private WebDriver driver;

        @Test
        public void testQuestionOne()
        {
            driver = new ChromeDriver();
            PageMain mainPage = new PageMain(driver);
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.get(APP_URL);
            mainPage.scrollToElement();
            mainPage.clickCookie();
            mainPage.clickButtonOneQuestion(PageMain.questionOne);
            assertEquals(PageMain.questionOneText, mainPage.getTextQuestionOne());  // сравнить текст
        }

        @Test
        public void testQuestionTwo() {
            driver = new ChromeDriver();
            PageMain mainPage = new PageMain(driver);
            driver.manage().window().maximize();
            driver.get(APP_URL);
            mainPage.scrollToElement();
            mainPage.clickCookie();
            mainPage.clickButtonTwoQuestion(PageMain.questionTwo);
            assertEquals(PageMain.questionTwoText, mainPage.getTextQuestionTwo());  // сравнить текст
        }

        @Test
        public void testQuestionThree() {
            driver = new ChromeDriver();
            PageMain mainPage = new PageMain(driver);
            driver.manage().window().maximize();
            driver.get(APP_URL);
            mainPage.scrollToElement();
            mainPage.clickCookie();
            mainPage.clickButtonThreeQuestion(PageMain.questionThree);
            assertEquals(PageMain.questionThreeText, mainPage.getTextQuestionThree());  // сравнить текст
        }

        @Test
        public void testQuestionFour() {
            driver = new ChromeDriver();
            PageMain mainPage = new PageMain(driver);
            driver.manage().window().maximize();
            driver.get(APP_URL);
            mainPage.scrollToElement();
            mainPage.clickCookie();
            mainPage.clickButtonFourQuestion(PageMain.questionFour);
            assertEquals(PageMain.questionFourText, mainPage.getTextQuestionFour());  // сравнить текст
        }

        @Test
        public void testQuestionFive() {
            driver = new ChromeDriver();
            PageMain mainPage = new PageMain(driver);
            driver.manage().window().maximize();
            driver.get(APP_URL);
            mainPage.scrollToElement();
            mainPage.clickCookie();
            mainPage.clickButtonFiveQuestion(PageMain.questionFive);
            assertEquals(PageMain.questionFiveText, mainPage.getTextQuestionFive());  // сравнить текст
        }

        @Test
        public void testQuestionSix() {
            driver = new ChromeDriver();
            PageMain mainPage = new PageMain(driver);
            driver.manage().window().maximize();
            driver.get(APP_URL);
            mainPage.scrollToElement();
            mainPage.clickCookie();
            mainPage.clickButtonSixQuestion(PageMain.questionSix);
            assertEquals(PageMain.questionSixText, mainPage.getTextQuestionSix());  // сравнить текст
        }

        @Test
        public void testQuestionSeven() {
            driver = new ChromeDriver();
            PageMain mainPage = new PageMain(driver);
            driver.manage().window().maximize();
            driver.get(APP_URL);
            mainPage.scrollToElement();
            mainPage.clickCookie();
            mainPage.clickButtonSevenQuestion(PageMain.questionSeven);
            assertEquals(PageMain.questionSevenText, mainPage.getTextQuestionSeven());  // сравнить текст
        }

        @Test
        public void testQuestionEight() {
            driver = new ChromeDriver();
            PageMain mainPage = new PageMain(driver);
            driver.manage().window().maximize();
            driver.get(APP_URL);
            mainPage.scrollToElement();
            mainPage.clickCookie();
            mainPage.clickButtonEightQuestion(PageMain.questionEight);
            assertEquals(PageMain.questionEightText, mainPage.getTextQuestionEight());  // сравнить текст
        }

        @After
        public void tearDown() {
            driver.quit();
        }
    }

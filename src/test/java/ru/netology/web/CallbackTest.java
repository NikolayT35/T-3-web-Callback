package ru.netology.web;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CallbackTest {
    private WebDriver driver;

    @BeforeAll
    static void setUpAll() {
        System.setProperty("webDriver.chrome.driver", "driver/Linux/chromedriver");
    }


    @BeforeEach
    void setUp() {
        driver = new ChromeDriver();
    }

    @BeforeEach
    void tearDown(){
        driver.quit();
        driver = null;
    }
    @Test
    void shouldTestV1(){
        driver.get("http://localhost:9999");
    }

}

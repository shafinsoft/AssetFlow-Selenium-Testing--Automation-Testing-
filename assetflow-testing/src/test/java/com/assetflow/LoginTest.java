
package com.assetflow;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest {

    @Test
    public void loginPageLoadTest() throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        try {
            driver.get("http://localhost/AssetFlow/login.php");

            Thread.sleep(5000);

            Assert.assertEquals(driver.getTitle(), "Login | AssetFlow");

            System.out.println("Login Page Loaded Successfully");

        } finally {
            driver.quit();
        }
    }
}

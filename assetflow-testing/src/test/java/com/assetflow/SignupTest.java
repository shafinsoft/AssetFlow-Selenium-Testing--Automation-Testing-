
package com.assetflow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignupTest {

    @Test
    public void signupTest() throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        try {
            driver.get("http://localhost/AssetFlow/signup.php");

            Thread.sleep(3000);

            driver.findElement(By.id("name"))
                  .sendKeys("Selenium Customer");

            driver.findElement(By.id("email"))
                  .sendKeys("selenium01@gmail.com");

            driver.findElement(By.id("password"))
                  .sendKeys("Test123");

            driver.findElement(By.id("confirm"))
                  .sendKeys("Test123");

            driver.findElement(By.id("signupBtn")).click();

            Thread.sleep(5000);

            Assert.assertTrue(
                driver.getCurrentUrl().contains("login.php")
            );

            System.out.println("Signup Successful");

        } finally {
            driver.quit();
        }
    }
}

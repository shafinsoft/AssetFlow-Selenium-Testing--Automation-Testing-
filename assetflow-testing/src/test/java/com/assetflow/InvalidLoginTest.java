
package com.assetflow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InvalidLoginTest {

    @Test
    public void invalidLoginTest() throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        try {
            driver.get("http://localhost/AssetFlow/login.php");

            Thread.sleep(3000);

            driver.findElement(By.id("email"))
                  .sendKeys("wrong@gmail.com");

            driver.findElement(By.id("password"))
                  .sendKeys("wrong123");

            driver.findElement(By.id("loginBtn")).click();

            Thread.sleep(3000);

            String error = driver.findElement(By.id("error")).getText();

            Assert.assertEquals(error, "Invalid email or password");

            System.out.println("Invalid Login Test Passed");

        } finally {
            driver.quit();
        }
    }
}

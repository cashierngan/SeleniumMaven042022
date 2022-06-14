package Bai6LearnWebElement;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;

public class LearnWebElement {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver; // Khai báo driver chung

        // Khởi tạo driver cho trình duyệt cụ thể cần automation
        WebDriverManager.chromedriver().setup(); // cú pháp cài đặt driver cho Chrome Browser thích hợp version
        driver = new ChromeDriver(); // cú pháp khởi taọ driver cho Chrom browser
        driver.manage().window().maximize();
        System.out.println(driver.manage().window().getSize());

//        driver.get("https://crm.anhtester.com/signin");
//
//        driver.findElement(By.xpath("//input[@id='email']")).click();
//
//        // Gán giá trị của 1 element vào đối tượng của WebElement có đặt tên rõ ràng
//        WebElement inputEmail = driver.findElement(By.xpath("//input[@id='email']"));
//        WebElement inputPassword = driver.findElement(By.xpath("//input[@id= 'password']"));
//        WebElement buttonSignIn = driver.findElement(By.xpath("//button[@type='submit']"));
//        WebElement buttonSave = driver.findElement(By.xpath("//button[text='Save']"));
//
//
//        inputEmail.sendKeys("admin02@mailinator.com");
//        Thread.sleep(1000);
////        inputEmail.clear();
//        Thread.sleep(1000);
//        inputPassword.sendKeys("123456");
//        Thread.sleep(2000);
//        buttonSignIn.isDisplayed();
//        buttonSignIn.click();
//        Thread.sleep(2000);

        driver.get("https://anhtester.com/");
        Thread.sleep(2000);

        String websiteModule1 = driver.findElement(By.xpath("//h3[normalize-space()='Website Testing']")).getText();

        System.out.println(websiteModule1);

        WebElement websiteModule = driver.findElement(By.id("btn-signup"));

        Point point = websiteModule.getLocation();

        System.out.println(point);
        driver.quit();
    }
}

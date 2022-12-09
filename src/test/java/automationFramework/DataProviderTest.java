//package automationFramework;
//
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//
//import org.openqa.selenium.WebDriver;
//
//import org.openqa.selenium.firefox.FirefoxDriver;
//
//import org.testng.annotations.DataProvider;
//
//import org.testng.annotations.Test;
//
//public class DataProviderTest {
//
//    private static WebDriver driver;
//
//  @DataProvider(name = "Authentication")
//
//  public static Object[][] credentials() {
//
//        // The number of times data is repeated, test will be executed the same no. of times
//
//        // Here it will execute two times
//
//        return new Object[][] { { "testuser_1", "Test@123" }, { "testuser_1", "Test@123" }};
//
//  }
//
//  // Here we are calling the Data Provider object with its Name
//
//  @Test(dataProvider = "Authentication")
//
//  public void test(String sUsername, String sPassword) {
//
//      driver = (WebDriver) new FirefoxDriver();
//
//      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//
//      driver.get("https://www.store.demoqa.com");
//
//      driver.findElement(By.xpath(".//*[@id='account']/a")).click();
//
//      // Argument passed will be used here as String Variable
//
//      driver.findElement(By.id("log")).sendKeys(sUsername);
//
//      driver.findElement(By.id("pwd")).sendKeys(sPassword);
//
//      driver.findElement(By.id("login")).click();
//
//      driver.findElement(By.xpath(".//*[@id='account_logout']/a")).click();
//
//      driver.quit();
//
//  }
//
//}
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//import org.openqa.selenium.By;
//import org.testng.Assert;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.DataProvider;
//import org.testng.annotations.Test;
//public class ExcelExample{
//@Test(dataProvider="testdata")
//public void demoClass(String username, String password) throws InterruptedException {
//System.setProperty("webdriver.chrome.driver", "Path of Chrome Driver");
//Webdriver driver = new ChromeDriver();
//driver.get("<a href="https://www.browserstack.com/users/sign_in</a>");
//driver.findElement(By.name("user[login]")).sendKeys(username);
//driver.findElement(By.name("user[password]")).sendKeys(password);
//driver.findElement(By.name("commit")).click();
//Thread.sleep(5000);
//Assert.assertTrue(driver.getTitle().matches("BrowserStack Login | Sign Into The Best Mobile & Browser Testing Tool"), "Invalid credentials");
//System.out.println("Login successful");
//}
//@AfterMethod
//void ProgramTermination() {
//driver.quit();
//} 
//@DataProvider(name="testdata")
//public Object[][] testDataExample(){
//ReadExcelFile configuration = new ReadExcelFile("Path_of_Your_Excel_File");
//int rows = configuration.getRowCount(0);
//Object[][]signin_credentials = new Object[rows][2];
// 
//for(int i=0;i<rows;i++)
//{
//signin_credentials[i][0] = config.getData(0, i, 0);
//signin_credentials[i][1] = config.getData(0, i, 1);
//}
//return signin_credentials;
//}
//}
//}

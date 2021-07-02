package Test;

import org.testng.annotations.*;

@Test(groups = "Tomandy")
public class TestNGHelloWorld {

    @BeforeSuite(groups = "bfSuite")
    public void bfSuite(){
        System.out.println("TestNGHelloWorld BeforeSuite!");
    }

    @BeforeClass(enabled = false)  //不可执行
    public void bfClass(){
        System.out.println("TestNGHelloWorld BeforeClass!");
    }

    @BeforeTest(dependsOnGroups = "bfSuite")  //依赖bfSuite组
    public void bfTest(){
        System.out.println("TestNGHelloWorld BeforeTest!");
    }

    @BeforeGroups(groups = {"Tom"})
    public void bfGroups(){
        System.out.println("TestNGHelloWorld BeforeGroups!");
    }

    @BeforeMethod(alwaysRun = true,dependsOnGroups = "bfSuite")//依赖bfSuite组,alwaysRun
    public void bfMethod(){
        System.out.println("TestNGHelloWorld BeforeMethod!");
    }

    @Test(groups = "Tom")
    public void helloWorldTest(){
        System.out.println("TestNGHelloWorld Test!");
    }

    @AfterSuite
    public void afSuite(){
        System.out.println("TestNGHelloWorld AfterSuite!");
    }

    @AfterClass()
    public void afClass(){
        System.out.println("TestNGHelloWorld AfterClass!");
    }

    @AfterTest
    public void afTest(){
        System.out.println("TestNGHelloWorld AfterTest!");
    }

    @AfterGroups(groups = "Tom")
    public void afGroups(){
        System.out.println("TestNGHelloWorld AfterGroups!");
    }

    @AfterMethod
    public void afMethod(){
        System.out.println("TestNGHelloWorld AfterMethod!");
    }

}

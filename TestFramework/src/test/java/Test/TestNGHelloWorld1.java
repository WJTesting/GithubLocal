package Test;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNGHelloWorld1 {
    @Test
    public void testCase1(){
        //记录log日志 Report为TestNG自带的内置对象 可以在控制台显示
        Reporter.log("正在执行testCase1",true);
        Assert.assertTrue(true);
    }

    @Test
    public void testCase2(){

        Reporter.log("正在执行testCase2",true);
        Assert.assertTrue(false);
    }

    @Test
    public void testCase3(){

        Reporter.log("正在执行testCase3",true);
        Assert.assertTrue(true);
    }

}
import org.testng.annotations.*;

public class Annotations {
    @BeforeSuite
    public void BeforeSuite(){
        System.out.println("Before suite fired...");
    }
    @BeforeTest
    public void BeforeTest(){
        System.out.println("Before test fired...");
    }
    @BeforeClass
    public void BeforeClass() {
        System.out.println("Before class fired...");
    }

    @BeforeMethod
    public void BeforeMethod(){
        System.out.println("Before method fired...");
    }
    @AfterMethod
    public void AfterMethod(){
        System.out.println("After method fired...");
    }


    @AfterClass
    public void AfterClass(){
        System.out.println("after class fired...");
    }

    @AfterTest
    public void AfterTest(){
        System.out.println("After test fired...");
    }

    @AfterSuite
    public void AfterSuite(){
        System.out.println("After suite fired...");
    }

    @Test
    public void Test1(){
        System.out.println("Test1 fired...");
    }

    @Test
    public void Test2(){
        System.out.println("Test2 fired...");
    }


}


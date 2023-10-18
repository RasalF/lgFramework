package stepDef;

import base.Config;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.testng.util.Strings;

public class Hook extends Config {



    public static String envType = System.getProperty("env");
    public static String browserType = System.getProperty("browser");
    public static String baseURL;

    @Before
    public void startTest(){

        if(Strings.isNullOrEmpty(browserType)){
            browserType ="ch";
        }
        if(Strings.isNullOrEmpty(envType)){
            envType = "qa";
        }

        driver = setupBrowser(browserType);
        if (envType.equals("qa")) {
            baseURL = "https://www.macys.com/";
        }
        driver.get(baseURL);
    }
    @After
    public void afterTest(){
//        driver.close();


    }




}

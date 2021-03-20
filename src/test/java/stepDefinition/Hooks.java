package stepDefinition;

import base.Config;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.testng.util.Strings;

public class Hooks extends Config{
    public static String url;
    public static String baseUrl=System.getProperty("env");
    public static String browserType=System.getProperty("browser");
    public static String defaultBrowser="ch";
    public static String defaultEnv="stage";

    @Before
    public void openBrowser(){
        if(Strings.isNullOrEmpty(browserType)){
            browserType=defaultBrowser;

        }
        if(Strings.isNullOrEmpty(baseUrl)){
            baseUrl=defaultEnv;
        }
        driver=initDriver(browserType);
        switch (baseUrl){
            case "qa":
                url="http://qa.taltektc.com";
                break;
            case "stage":
                url="http://stage.taltektc.com";
                break;
            case "prod":
                url="http://taltektc.com";
                        break;
        }
        driver.get(url);

    }
    @After
    public void tearDown(){

        driver.quit();
    }
}

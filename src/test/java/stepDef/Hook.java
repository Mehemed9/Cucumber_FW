package stepDef;

import base.config;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.testng.util.Strings;

public class Hook extends config {
    public static String url;
    public static String envType = System.getProperty("env");
    public static String browserType = System.getProperty("browser");

    @Before
    public void beforeEachTest(){
        if (Strings.isNullOrEmpty(envType)){
            envType = "qa";
        }
        if (Strings.isNullOrEmpty(browserType)){
            browserType = "ch";
        }
        driver = setupBrowser(browserType);
        switch (envType){
            case "qa":
                url = "https://qa.taltektc.com";
                STUDENT_EMAIL = "nahid@gmail.com";
                STUDENT_PASSWORD = "123456";
                STUDENT_FIRSTNAME ="Nahid";
                STUDENT_LASTNAME ="Mehmed";
                STUDENT_NEW_EMAIL ="Nahid.qa@gmail.com";
                STUDENT_NEW_PASSWORD="000111ab";

                break;
            case "stage":
                url = "https://stage.taltektc.com";
                STUDENT_EMAIL = "nahid15@gmail.com";
                STUDENT_PASSWORD = "111222";
                STUDENT_FIRSTNAME ="Nahid";
                STUDENT_LASTNAME ="Mehmed";
                STUDENT_NEW_EMAIL ="Nahid.satge@gmail.com";
                STUDENT_NEW_PASSWORD="000111ab";
                break;
            case "prod":
                url = "https://prod.taltektc.com";
                break;
        }
        driver.get(url);

    }

    @After
    public void afterEachTest(){
        //driver.quit();
        // take screenshot if test steps or case fail
        // close db connection
    }
}

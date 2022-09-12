package utilities;

public class Constants
{
    public static final String PROPERTYFILE="src/main/resources/constants.properties";

    //Environment
    public static final String ENV = JavaHelpers.setSystemVariable(PROPERTYFILE,"Env");
    public static final String APP_URL = JavaHelpers.getPropertyValue(PROPERTYFILE,"app_url_" + ENV);

    //Selenium constants
    public static final int WEBDRIVER_WAIT_DURATION= Integer.parseInt(JavaHelpers.getPropertyValue(PROPERTYFILE,"WebDriverWaitDuration"));
    public static final int MINIMUM_WEBDRIVER_WAIT_DURATION= Integer.parseInt(JavaHelpers.getPropertyValue(PROPERTYFILE,"MinimumWebDriverWaitDuration"));
    public static final int PAGEFACTORY_WAIT_DURATION= Integer.parseInt(JavaHelpers.getPropertyValue(PROPERTYFILE,"PageFactoryWaitDuration"));
    public static final int PAGELOAD_WAIT_DURATION= Integer.parseInt(JavaHelpers.getPropertyValue(PROPERTYFILE,"PageLoadTimeout"));

    //Other
    public static final String SCREENSHOT_LOCATION= JavaHelpers.getPropertyValue(PROPERTYFILE,"ScreenshotLocation");

}



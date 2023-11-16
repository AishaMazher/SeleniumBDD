package general;

import io.percy.selenium.Percy;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.*;
import java.util.List;

public class GeneralFunctions
{

    public static By byDate = By.id("create_project_startDate");


    public static String generateRandomString(int length)
    {
        String name = RandomStringUtils.randomAlphabetic(length);
        String first_letter = name.substring(0, 1).toUpperCase();
        String other_letters = name.substring(1).toLowerCase();
        String RandomName = first_letter + other_letters;
        return RandomName;

    }

    public static String generateRandomNumber(int length)
    {
        String number = RandomStringUtils.randomNumeric(length);
        return number;
    }

    public void selectRandomDate(String date) throws InterruptedException
    {
        Thread.sleep(3000);
        Actions action = new Actions(WebDriverFactory.getDriver());
        action.sendKeys(WebDriverFactory.getDriver().findElement(byDate), date).build().perform();
        Thread.sleep(2000);
    }

    public String getCurrentDay()
    {
        //Create a Calendar Object
        Calendar calendar = Calendar.getInstance(TimeZone.getDefault());

        //Get Current Day as a number
        int todayInt = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println("Today Int: " + todayInt +"\n");

        //Integer to String Conversion
        String todayStr = Integer.toString(todayInt);
        System.out.println("Today Str: " + todayStr + "\n");

        return todayStr;
    }

    public static String replaceString(String s, String replaceFrom, String replaceTo) {
        String replacedString = s.replace(replaceFrom, replaceTo);
        return replacedString;
    }

    public static Date getTime() {
        Calendar calendar = Calendar.getInstance();
        return calendar.getTime();
    }








    public static void  fileSelectionforWindows(String FileName) throws AWTException, InterruptedException {

    }






}
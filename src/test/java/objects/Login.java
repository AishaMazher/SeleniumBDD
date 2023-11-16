package objects;

import com.mysql.cj.exceptions.AssertionFailedException;
import general.CommonAssertions;
import general.MainCall;
import org.openqa.selenium.By;

import java.sql.ResultSet;
import java.sql.SQLException;

//import static com.venturedive.base.config.BaseConfigProperties.projectName;

public class Login {

    public Login() {}
  /*  public static String selectQuery = "select * from sonardb.automation_report where id =270926;";
    public static String updateQuery = "update sonardb.automation_report set PROJECT_NAME = 'Vital' where PROJECT_NAME = 'Vital'";
    public static String deleteQuery = "delete from  sonardb.automation_report where id =272947;";*/
    public static By login_UserName = By.xpath("//input[@id='loginFrm_loginname']");
    public static By login_Password = By.xpath("//input[@id='loginFrm_password']");
    public static By login_Button = By.xpath("//button[@title='Login']");
    public static By userLoginVerificationByUserName = By.xpath("//div[@class='menu_text']");
    public static By userLoginInvalidVerification = By.xpath("//div[text()='The username or password you entered is incorrect.']");

    public static void arriveToLogin()
    {
        try {
            MainCall.webDriverFactory.getInstance();
        } catch (Exception exception) {
            throw new AssertionFailedException(exception.getMessage());
        }
    }

    public static void enterUserName(String userName)
    {
        CommonAssertions.logActualReult("enter the username");
        MainCall.seleniumFunctions.IhaveGivenInput(login_UserName, userName);
        CommonAssertions.logExpectedResult("username should be display on text box");

    }

    public static void enterPassword(String password)
    {

            MainCall.seleniumFunctions.IhaveGivenInput(login_Password, password);
    }

    public static void clickLogin()
    {
        MainCall.seleniumFunctions.PressButton(login_Button);
    }

    public static  void verifyError(String error)
    {
        MainCall.seleniumFunctions.VerificationMessageByMessage(userLoginInvalidVerification,error);
    }

    public static  void verifyLogin(String message)
    {
        MainCall.seleniumFunctions.VerificationMessageByMessage(userLoginVerificationByUserName,message);
    }

    //DB Example
   /* public void dataBaseQuery() throws SQLException {
        ResultSet resultSet = MainCall.dbOp.getResult(selectQuery);
        while (resultSet.next()) {
            projectName = resultSet.getString("PROJECT_NAME");
            System.out.println(projectName);
            System.out.println(resultSet.getString("Build"));
            System.out.println(resultSet.getString("platform"));
        }

        int count  = MainCall.dbOp.executeQuery(updateQuery);
        System.out.println(count + "  rows are updated");
        count  = MainCall.dbOp.executeQuery(deleteQuery);
        System.out.println(count + "  rows are deleted");

    }*/
}

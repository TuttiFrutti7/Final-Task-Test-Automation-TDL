import com.aventstack.extentreports.*;
import com.aventstack.extentreports.reporter.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.*;
import org.testng.annotations.*;
import pages.*;
import common.TestBase;

import java.io.*;

public class MyFirstTask extends TestBase {

    static ExtentReports report;

    @BeforeClass
    public static void startTest() throws IOException {
        String reportPath =
                "src" + File.separator +
                        "main" + File.separator +
                        "resources" + File.separator +
                        "reports" + File.separator +
                        "TestReport.html";
        String configPath =
                "src" + File.separator +
                        "main" + File.separator +
                        "resources" + File.separator +
                        "configs" + File.separator +
                        "extentreports" + File.separator +
                        "spark-config.xml";
        report = new ExtentReports();
        ExtentSparkReporter sparkReporter = new ExtentSparkReporter(reportPath);
        sparkReporter.loadXMLConfig(configPath);
        sparkReporter.config().setReportName("EDVARDS_KALVE_TDL_SS_Final_Task’");
        report.setSystemInfo("Project", "TDL Summer School");
        report.setSystemInfo("Author", "Edvards Kalve");
        report.attachReporter(sparkReporter);
    }

    @Test(description = "First task", enabled = true)
    public void firstTest() {
        ExtentTest test = report.createTest("First test");
        test.log(Status.INFO, "The test has started");
        openUrl();
        HomePage homePage = new HomePage();
        if(homePage.isInitialized()) {
            test.log(Status.INFO, "Home page is visible");
        } else {
            test.log(Status.INFO, "Home page is NOT visible");
        }
        homePage.clickOnDialogBox();

        DialogBoxes dialogBoxes = new DialogBoxes();
        if(dialogBoxes.isInitialized()) {
            test.log(Status.INFO, "Dialog Boxes page is visible");
        } else {
            test.log(Status.INFO, "Dialog Boxes page is NOT visible");
        }
        dialogBoxes.clickOnCreateNewUser();

        test.log(Status.INFO, "The test has finished");
        closeDriver();
    }

    @Test(description = "Second task", enabled = true, groups = "Smoke Suite")
    public void secondTest() throws InterruptedException {
        ExtentTest test = report.createTest("Second test");
        test.log(Status.INFO, "The test has started");
        openUrl();
        HomePage homePage = new HomePage();
        if(homePage.isInitialized()) {
            test.log(Status.INFO, "Home page is visible");
        } else {
            test.log(Status.INFO, "Home page is NOT visible");
        }
        homePage.clickOnTabs();

        test.log(Status.INFO, "The test has finished");
        closeDriver();
    }

    @Test(description = "Third task", enabled = true, groups = "Regression Suite")
    public void thirdTest() {
        ExtentTest test = report.createTest("Third test");
        test.log(Status.INFO, "The test has started");
        openUrl();
        HomePage homePage = new HomePage();
        if(homePage.isInitialized()) {
            test.log(Status.INFO, "Home page is visible");
        } else {
            test.log(Status.INFO, "Home page is NOT visible");
        }
        homePage.clickOnPorgressBar();

        ProgressBar progressBar = new ProgressBar();
        progressBar.clickOnRandomProgressBar();

        test.log(Status.INFO, "The test has finished");
        closeDriver();
    }

    @Test(description = "Forth task", enabled = true, groups = "Regression Suite")
    public void forthTest() {
        ExtentTest test = report.createTest("Forth test");
        test.log(Status.INFO, "The test has started");
        openUrl();
        HomePage homePage = new HomePage();
        if(homePage.isInitialized()) {
            test.log(Status.INFO, "Home page is visible");
        } else {
            test.log(Status.INFO, "Home page is NOT visible");
        }
        homePage.clickOnDialogBox();

        DialogBoxes dialogBoxes = new DialogBoxes();
        if(dialogBoxes.isInitialized()) {
            test.log(Status.INFO, "Dialog Boxes page is visible");
        } else {
            test.log(Status.INFO, "Dialog Boxes page is NOT visible");
        }
        dialogBoxes.clickOnMessageBox();
        dialogBoxes.clickOnOk();

        test.log(Status.INFO, "The test has finished");
        closeDriver();
    }

    @Test(description = "Fifth task", enabled = true)
    public void fifthTest() throws InterruptedException {
        ExtentTest test = report.createTest("Fifth test");
        test.log(Status.INFO, "The test has started");
        getDriver().get("https://www.globalsqa.com/demo-site/auto-complete/");
        AutoComplete autoComplete = new AutoComplete();
        if (autoComplete.isInitialized()) {
            test.log(Status.INFO, "Auto Complete page is visible");
        } else {
            test.log(Status.INFO, "Auto Complete page is NOT visible");
        }
        autoComplete.search();

        test.log(Status.INFO, "The test has finished");
        closeDriver();
    }

    @AfterClass
    public static void endTest() {
        report.flush();
    }
}

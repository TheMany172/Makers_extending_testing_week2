package exercise_1;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.microsoft.playwright.*;

import java.io.File;


public class AppTest {
    static Playwright playwright;
    static Browser browser;
    BrowserContext context;
    Page page;

    static XSSFWorkbook workbook;
    static XSSFSheet sheet;
    static File inputs;
    static XSSFRow row;

    static XSSFCell cell;

    @BeforeSuite
    public void launchBrowser() {
        playwright = Playwright.create();
        browser = playwright.chromium().launch();
    }

    @Test
    public void details301TooLong() {
        context = browser.newContext();
        page = context.newPage();
        page.navigate("https://defect-logger.onrender.com/");
        Locator nameField = page.getByTestId("name");
        Locator summaryField = page.getByTestId("summary");
        Locator detailsField = page.getByTestId("details");
        Locator submitButton = page.getByTestId("submit");

        nameField.fill("Alice");
        summaryField.fill("Bug");
        detailsField.fill(
            "I found a buggy bugg" +
            "I found a buggy bugg" +
            "I found a buggy bugg" +
            "I found a buggy bugg" +
            "I found a buggy bugg" +
            "I found a buggy bugg" +
            "I found a buggy bugg" +
            "I found a buggy bugg" +
            "I found a buggy bugg" +
            "I found a buggy bugg" +
            "I found a buggy bugg" +
            "I found a buggy bugg" +
            "I found a buggy bugg" +
            "I found a buggy bugg" +
            "I found a buggy buggy"
        );
        submitButton.click();
        String url = page.url();
        Assert.assertEquals(url, "https://defect-logger.onrender.com/defects");
    }

    @Test
    public void details99TooShort() {
        context = browser.newContext();
        page = context.newPage();
        page.navigate("https://defect-logger.onrender.com/");
        Locator nameField = page.getByTestId("name");
        Locator summaryField = page.getByTestId("summary");
        Locator detailsField = page.getByTestId("details");
        Locator submitButton = page.getByTestId("submit");

        nameField.fill("Eddie");
        summaryField.fill("Bug");
        detailsField.fill(
            "I found a buggy bugg" +
            "I found a buggy bugg" +
            "I found a buggy bugg" +
            "I found a buggy bugg" +
            "I found a buggy bug"
        );
        submitButton.click();
        String url = page.url();
        Assert.assertEquals(url, "https://defect-logger.onrender.com/defects");
    }

    @Test
    public void name31TooLong() {
        context = browser.newContext();
        page = context.newPage();
        page.navigate("https://defect-logger.onrender.com/");
        Locator nameField = page.getByTestId("name");
        Locator summaryField = page.getByTestId("summary");
        Locator detailsField = page.getByTestId("details");
        Locator submitButton = page.getByTestId("submit");

        nameField.fill("Roll Alie Kantar Frentsasu Sena");
        summaryField.fill("Bug");
        detailsField.fill(
            "I found a buggy bugg" +
            "I found a buggy bugg" +
            "I found a buggy bugg" +
            "I found a buggy bugg" +
            "I found a buggy bugg"
        );
        submitButton.click();
        String url = page.url();
        Assert.assertEquals(url, "https://defect-logger.onrender.com/defects");
    }

    @Test
    public void summary51TooLong() {
        context = browser.newContext();
        page = context.newPage();
        page.navigate("https://defect-logger.onrender.com/");
        Locator nameField = page.getByTestId("name");
        Locator summaryField = page.getByTestId("summary");
        Locator detailsField = page.getByTestId("details");
        Locator submitButton = page.getByTestId("submit");

        nameField.fill("Bob");
        summaryField.fill("Buggy buggy buggy buggy buggy buggy buggy buggy bug");
        detailsField.fill(
            "I found a buggy bugg" +
            "I found a buggy bugg" +
            "I found a buggy bugg" +
            "I found a buggy bugg" +
            "I found a buggy bugg"
        );
        submitButton.click();
        String url = page.url();
        Assert.assertEquals(url, "https://defect-logger.onrender.com/defects");
    }

    @Test
    public void validSubmissionDetails100() {
        context = browser.newContext();
        page = context.newPage();
        page.navigate("https://defect-logger.onrender.com/");
        Locator nameField = page.getByTestId("name");
        Locator summaryField = page.getByTestId("summary");
        Locator detailsField = page.getByTestId("details");
        Locator submitButton = page.getByTestId("submit");

        nameField.fill("Roll Alie Kantar Frentsasu Sen");
        summaryField.fill("Buggy buggy buggy buggy buggys");
        detailsField.fill(
            "I found a buggy bugg" +
            "I found a buggy bugg" +
            "I found a buggy bugg" +
            "I found a buggy bugg" +
            "I found a buggy bugg"
        );
        submitButton.click();
        String url = page.url();
        Assert.assertEquals(url, "https://defect-logger.onrender.com/");
    }

    @Test
    public void validSubmissionDetails300() {
        context = browser.newContext();
        page = context.newPage();
        page.navigate("https://defect-logger.onrender.com/");
        Locator nameField = page.getByTestId("name");
        Locator summaryField = page.getByTestId("summary");
        Locator detailsField = page.getByTestId("details");
        Locator submitButton = page.getByTestId("submit");

        nameField.fill("Roll Alie Kantar Frentsasu Sen");
        summaryField.fill("Buggy buggy buggy buggy buggys");
        detailsField.fill(
            "I found a buggy bugg" +
            "I found a buggy bugg" +
            "I found a buggy bugg" +
            "I found a buggy bugg" +
            "I found a buggy bugg" +
            "I found a buggy bugg" +
            "I found a buggy bugg" +
            "I found a buggy bugg" +
            "I found a buggy bugg" +
            "I found a buggy bugg" +
            "I found a buggy bugg" +
            "I found a buggy bugg" +
            "I found a buggy bugg" +
            "I found a buggy bugg" +
            "I found a buggy bugg"
        );
        submitButton.click();
        String url = page.url();
        Assert.assertEquals(url, "https://defect-logger.onrender.com/");
    }

    @Test(dataProvider = "Adams")
    public void doallthetestsplease() {
        System.out.println("beginning of the do all tests");
        try {
            Assert.assertEquals(givemedata(), "123");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InvalidFormatException e) {
            throw new RuntimeException(e);
        }
    }

    @DataProvider(name = "Adams")
    public Object[][] givemedata() throws IOException, InvalidFormatException {
        System.out.println("beginning of the data provider");
        return ExcelUtils.read("phase8/exercise_1/app/src/main/java/exercise_1/TestSheet.xlsx");
    }





//        File inputfile = new File("phase8/exercise_1/app/src/main/java/exercise_1/TestSheet.xlsx");
//        try {
//            workbook = new XSSFWorkbook(inputfile);
//            sheet = workbook.getSheet("Sheet1");
//
//
//        } catch (IOException ex) {
//            throw new RuntimeException(ex);
//        } catch (InvalidFormatException ex) {
//            throw new RuntimeException(ex);
//        }
//            Boolean hasNextRow = true;
//            Integer rowIndex = 1;
//            while(hasNextRow) {
//                this.row = this.sheet.getRow(rowIndex);
//                this.cell = row.getCell(0);
//                if(this.cell == null || this.cell.toString() == "") {
//                    hasNextRow = false;
//                } else {
//                    ArrayList<String> outputRow = new ArrayList<String>();
//                    outputRow.add(this.row.getCell(0).toString());
//                    outputRow.add(this.row.getCell(2).toString());
//                    outputRow.add(this.row.getCell(4).toString());
//                    outputRow.add(this.row.getCell(6).toString());
//                    excelData.add(outputRow);
//                    rowIndex++;
//                }
//        }
//            int nRows = excelData.size();
//            int nCols = excelData.get(0).size();
//            Object[][] output = new Object[nRows][nCols];
//
//            for(int i = 0; i < nRows; i++) {
//                output[i] = excelData.get(i).toArray();
//            }
//
//            return output;


//    @Test(dataProvider = "Adam")
//    public void isValidReturnsFalseForInvalidDefects(String name, String summary, String details, String ExpectedUrl) {
//        // comment these out once your data provider method works
//        System.out.println("Test case");
//        System.out.println("\tname: " + name);
//        System.out.println("\tsummary: " + summary);
//        System.out.println("\tdetails: " + details);
//        System.out.println("\tExpected Url: " + ExpectedUrl);
//        // add your test code below
//    }
    @AfterSuite
    public void closeBrowser() {
        playwright.close();
    }
}
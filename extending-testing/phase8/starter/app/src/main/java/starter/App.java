package starter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.File;

public class App {
    static XSSFWorkbook workbook;
    static XSSFSheet sheet;
    static File inputs;
    static XSSFRow row;

    static XSSFCell cell;

    // add the new fields below here

    // click on run (below) to execute this method
    public static void main(String[] args) {
        // delete the line below when you no longer need it
        System.out.println("This is all working nicely!");
        // get the data
        inputs = new File("phase8/starter/app/src/main/resources/test_inputs.xlsx");
        // the code below can throw errors so we have to use a try-catch
        try {
            // create a workbook from the file
            workbook = new XSSFWorkbook(inputs);
            // grab a sheet from the workbook
            sheet = workbook.getSheet("Sheet1");
            // get some output
            System.out.println(sheet);
            // if an error is thrown, the code below is executed
            // the first row has an index of 0
            row = sheet.getRow(0);
            System.out.println(row);
            // the first cell has an index of 0
            cell = row.getCell(0);
            System.out.println(cell);
            cell = row.getCell(1);
            System.out.println(cell);
            cell = row.getCell(2);
            System.out.println(cell);
            cell = row.getCell(3);
            System.out.println(cell);
            cell = row.getCell(4);
            System.out.println(cell);
            cell = row.getCell(5);
            System.out.println(cell);
            cell = row.getCell(6);
            System.out.println(cell);
        } catch (Exception e) {
            System.out.println("Something went wrong...");
            System.out.println(e);
        }
    }
}

package starter;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

// complete the test and dataprovider method
// the goal is to practice parameterised testing
// you don't need to use a spreadsheet (yet)

public class DefectTest {
    @Test(dataProvider = "Adam")
    public void isValidReturnsFalseForInvalidDefects(String name, String summary, String details) {
        // comment these out once your data provider method works
        System.out.println("Test case");
        System.out.println("\tname: " + name);
        System.out.println("\tsummary: " + summary);
        System.out.println("\tdetails: " + details);
        // add your test code below
        Defect defect = new Defect(name, summary, details);
        Assert.assertFalse(defect.isValid());
    }

    @DataProvider(name = "Adam")
    public Object[][] invalidDefectData() {
        // return a 2D array of inputs and expected urls
        // you can hard code it for now


        return new String[][] {
                //Name too long - over 30 char
                {"AdamAdamAdamAdamAdamAdamAdamAdam", "a bug", "qwertyuiopqwertyuiopqwertyuiopqwertyuiopqwertyuiopqwertyuiopqwertyuiopqwertyuiopqwertyuiopqwertyuiopqwertyuiop"},
                // Summary too long - over 50 char
                {"Adam", "123456789012345678901234567890123456789012345678909", "qwertyuiopqwertyuiopqwertyuiopqwertyuiopqwertyuiopqwertyuiopqwertyuiopqwertyuiopqwertyuiopqwertyuiopqwertyuiop"},
                // Details too short <100 char
                {"Adam", "a bug", "a bug"},
                // Details too long > 300
                {"Adam", "a bug", "1234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901"}
        };

    }
}

package data.reader;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import java.io.File;
import java.io.IOException;

public class ExcelReader {

    public static void main(String[] args) throws IOException, BiffException {
        //call the function which reads the data from the xls file and print it on the console...
        readData();
    }

    public static void readData() throws IOException, BiffException {
        System.out.println("now in readData function");
        // 1. find the location of the file
        // File xlsFile = new File("C:\\Users\\skonda23\\IdeaProjects\\AutomationParent\\JavaBasics\\src\\main\\resources\\TestData.xls");
        File xlsFile = new File(PropertyReader.getProp("xlsFilePath"));

        // 2. Open the file
        Workbook xlsWb = Workbook.getWorkbook(xlsFile);

        // 3. Extract the data - with speicific column and row input
        //  3.1 Sheet information
         Sheet xlsSheet = xlsWb.getSheet(0);
        // Sheet xlsSheet = xlsWb.getSheet("Sheet1");

        System.out.println("Data extracted from 1, 1 is : " + xlsSheet.getCell(1, 1).getContents());

        // Extract total number of rows
        int rowCount = xlsSheet.getRows();  // 3
        int colCount = xlsSheet.getColumns();
        System.out.println("Row count is : " + rowCount);
        System.out.println("Column count is : " + colCount);

        // 4. Print the extracted data

        for (int row = 0; row < rowCount; row++) {     // iteration based on rows -- 3

            for (int col = 0; col < colCount; col++) {  // iteration based on columns -- 5
                System.out.print(xlsSheet.getCell(col, row).getContents() + "\t");
            }
            System.out.println("");
        }
        // row  \\ col
        // 0        0       (0, 0) --> employeeID
        // 0        1       (0, 1) -->
        // 0        2
        // 0        3
        // 0        4
        // 0        5     ---> faile --> return to row loop
        // 1        0   (1, 0) --> 1

        // close the workbook
        xlsWb.close();



    }


}

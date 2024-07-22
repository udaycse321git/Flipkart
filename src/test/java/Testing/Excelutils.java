package Testing;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelutils {
    public static void main(String[] args) throws Exception {
  //      getRowCount();
       System.out.println("starting code");
        XSSFWorkbook workbook = new XSSFWorkbook("D:\\data.xlsx");
        XSSFSheet sheet = workbook.getSheetAt(0);
       // XSSFSheet sheet = workbook.getSheet("sheet1");
        String value = sheet.getRow(1).getCell(0).getStringCellValue();
        int totalRow = sheet.getPhysicalNumberOfRows();
        System.out.println("Total No. of rows : "+totalRow);
        System.out.println(value);
    }

        

    public static void getRowCount()
    {
        //= null;
        try {
            System.out.println("starting code");
          // String projectPath = System.getProperty("user.dir");

            XSSFWorkbook workbook = new XSSFWorkbook("D:\\data.xlsx");
            //XSSFWorkbook   workbook = new XSSFWorkbook(projectPath+"/excel/data.xlsx");
            XSSFSheet sheet = workbook.getSheet("Sheet1");
            int totalRow = sheet.getPhysicalNumberOfRows();
            System.out.println("Total No. of rows : "+totalRow);

            for (Row myrow : sheet) {
                for (Cell mycell : myrow) {

                    System.out.println(" ,"+mycell);
                }
            }

            workbook.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
            //System.out.println(e.getCause());
            //System.out.println(e.getMessage());
            //System.out.println(e.printStackTrace(););
        }

    }
}

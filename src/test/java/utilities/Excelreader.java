package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class Excelreader {
	
public static void inputreader(String path, String sheet) throws IOException
{
	
	
    File file =    new File(path);
    FileInputStream inputStream = new FileInputStream(file);

	
    Workbook book1 = null;
    book1 = new HSSFWorkbook(inputStream);

	
    
    Sheet sheet1 = book1.getSheet(sheet);
    
    
    int rowCount = sheet1.getLastRowNum()-sheet1.getFirstRowNum();

    //Create a loop over all the rows of excel file to read it

    for (int i = 0; i < rowCount+1; i++) {

        Row row = sheet1.getRow(i);

        //Create a loop to print cell values in a row

        for (int j = 0; j < row.getLastCellNum(); j++) {

            //Print Excel data in console

            System.out.print(row.getCell(j).getStringCellValue()+"|| ");

        }

        System.out.println();
    } 


}

}

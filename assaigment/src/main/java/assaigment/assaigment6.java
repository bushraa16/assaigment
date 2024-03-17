package assaigment;

import org.apache.poi.ss.usermodel.*;
import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class assaigment6  {
    @Test
    public void apachepoiTest() throws IOException {
        //Store the path of the file as string and open the file.
     FileInputStream file= new FileInputStream("C:\\Users\\Bashair\\Downloads\\assaigment\\assaigment\\excel\\as6.xlsx");
        //Open the workbook.
     Workbook workbook= WorkbookFactory.create(file);
        //Open the first worksheet.
        Sheet name=workbook.getSheet("POPULATION");
        //Go to the first row.
        Row r1=name.getRow(0);
        //Create a cell on the 3rd column (2nd index) on the first row.
     Cell c2=r1.getCell(2);
        //Write “POPULATION” on that cell.
        System.out.println(c2);
        //Create a cell on the 2nd row 3rd cell(index2), and write data.
        Row r2=name.getRow(1);
        r2.createCell(2).setCellValue(2000);
//Create a cell on the 3rd row 3rd cell(index2), and write data.
        Row r3=name.getRow(2);
        r3.createCell(2).setCellValue(3000);
//Create a cell on the 4th row 3rd cell(index2), and write data.
        Row r4=name.getRow(3);
        r4.createCell(2).setCellValue(5000);
        FileOutputStream fileOutputStream=new FileOutputStream("C:\\Users\\Bashair\\Downloads\\assaigment\\assaigment\\excel\\as6.xlsx");
        workbook.write(fileOutputStream);
        //Write and save the workbook.e
       //Close the file.//Close the workbook.
        file.close();
        fileOutputStream.close();
        workbook.close();
    }

}

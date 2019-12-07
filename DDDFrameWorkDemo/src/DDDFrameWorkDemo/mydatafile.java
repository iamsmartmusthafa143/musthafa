package DDDFrameWorkDemo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class mydatafile {
	public static void main (String[] t ) throws FileNotFoundException, IOException {
		HSSFWorkbook wb=new HSSFWorkbook();	
		HSSFSheet ws=wb.createSheet("Musthafa");
		for(int i=0;i<5;i++)
		{
		HSSFRow sr=ws.createRow(i);
		HSSFCell rs=sr.createCell(i);
		rs.setCellValue   ("Musthafa");
		}
		wb.write(new FileOutputStream("E:\\Eclipse\\Inputfile\\Inputfile.xls"));
		wb.close();
	}
	

}

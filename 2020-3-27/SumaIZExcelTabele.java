package itbootcamp.domaciRadSaPOI;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.apache.poi.hssf.usermodel.HSSFFormulaEvaluator;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;

public class SumaIZExcelTabele {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("src\\itbootcamp\\domaciRadSaPOI\\Data (DOM).xls");
		HSSFWorkbook wb = new HSSFWorkbook(fis);
		HSSFSheet sheet = wb.getSheetAt(0);
		
		int suma = 0;
		for (Row row : sheet) {
			for (Cell cell : row) {
				if (cell.getColumnIndex() == 0) {
					suma = suma + (int) cell.getNumericCellValue();
				}
			}
		}
		System.out.println(sheet.getLastRowNum());
		System.out.println("Suma brojeva prve kolone je " + suma);

	}

}

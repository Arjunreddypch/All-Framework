package other;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class GetDataFromExcel {
	
	public static void main(String[] args) throws IOException {
		FileInputStream file=null;
		XSSFSheet sheet = null;
		ArrayList<String> columns;
		HashMap<String, String> map=new HashMap<String, String>();
		int ColumnIndex=0;
		try {
		 file=new FileInputStream(new File("TestData.xlsx"));
		
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		int noOfSheets=workbook.getNumberOfSheets();
		System.out.println(noOfSheets);
		for(int i=0;i<noOfSheets;i++) {
				if(workbook.getSheetName(i).toString().equalsIgnoreCase("EmployeeData")) {
					
					sheet=workbook.getSheet(workbook.getSheetName(i).toString());
				}
		}
		
		Iterator<Row> rows=sheet.rowIterator();
		Row row=rows.next();
		 columns=new ArrayList<String>();
		for(int i=0;i<row.getLastCellNum();i++) {
			
			System.out.println(row.getCell(i).getStringCellValue());
			columns.add(row.getCell(i).getStringCellValue());
			
			if(columns.get(i).contains("Name")){
				ColumnIndex=i;
			}
		}
		int i=0;
		while(rows.hasNext()) {
			
			row=rows.next();
			
			if (row.getCell(ColumnIndex).getStringCellValue().contains("Shekar")) {
				
				for(i=0;i<row.getLastCellNum();i++) {
					
					if(row.getCell(i).getCellType().toString().equals("STRING")) {
				System.out.println(columns.get(i)+row.getCell(i).getStringCellValue());
				map.put(columns.get(i), row.getCell(i).getStringCellValue());
					}
					else {
						System.out.println(columns.get(i)+row.getCell(i).getNumericCellValue());
						map.put(columns.get(i), NumberToTextConverter.toText(row.getCell(i).getNumericCellValue()));
					}
				
				}
			}
		}
		
		
		
		
		}finally {
			file.close();
		}
		
		
		
		
		
	}

}

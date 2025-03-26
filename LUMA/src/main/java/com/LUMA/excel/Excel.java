package com.LUMA.excel;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {
	//to read data from an excel 
	public static List<List<String>> dataFromExcel(String filePath, int sheetNo)
 {
	    List<List<String>> credentials = null;
	    
	    try {
	        credentials = new ArrayList<>();
	        FileInputStream file = new FileInputStream(new File(filePath));
	        Workbook workbook = new XSSFWorkbook(file);
	        Sheet sheet = workbook.getSheetAt(sheetNo);
	        for (int i = 0; i <= sheet.getLastRowNum(); i++) {
	            Row row = sheet.getRow(i);
	            List<String> rowData = new ArrayList<>();//stores list of cells
	            if (row != null) {
	                for (int j = 0; j < row.getLastCellNum(); j++) {
	                    Cell cell = row.getCell(j);
	                    if (cell != null) {
	                       try {
	                    	   rowData.add(cell.getStringCellValue());//get string value from cell and add string value in the rowdata
	                    	   
	                       }catch (Exception e) {
	                    	 //if the value in cell is numeric then convert into int to string then get string value from cell and add string value  in the rowdata
							rowData.add(String.valueOf((int)cell.getNumericCellValue()));
						}
	                    } else {
	                        rowData.add("");//if cell is empty adds empty string to rowdata
	                    }
	                }
	            }
	            credentials.add(rowData);
	        }
	        workbook.close();
	    } catch (Exception e) {
	        System.out.println("Exception in dataFromExcel method: " + e);
	    }
	    return credentials;
	}

}
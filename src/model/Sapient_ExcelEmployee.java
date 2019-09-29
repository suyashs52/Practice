package model;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Iterator;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.streaming.SXSSFRow.CellIterator;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Sapient_ExcelEmployee {
	public static void processExcel() {
		File f = new File("D:\\jboss-eap-7.1\\bin\\fileUpload\\tmpFiles\\employee.xlsx");
		try {
			Workbook wb1 = WorkbookFactory.create(f);
			Workbook wb2 = new XSSFWorkbook();
			Sheet sh1 = wb1.getSheetAt(0);
			Sheet sh2 = wb2.createSheet("employee");

			Iterator<Row> row1 = sh1.rowIterator();
			while (row1.hasNext()) {
				Row r1 = row1.next();
				Iterator<Cell> cell = r1.cellIterator();
				Row r2 = sh2.createRow(r1.getRowNum());
				while (cell.hasNext()) {
					Cell c1 = cell.next();
					int clmnIndex = c1.getColumnIndex();
					
					Cell c2 ;
					double currencyConverter = 0;
					switch (c1.getCellTypeEnum()) {
					case BOOLEAN:
						  c2 = r2.createCell(clmnIndex);
						c2.setCellValue(c1.getBooleanCellValue());
						break;
					case STRING:
						  c2 = r2.createCell(clmnIndex);
						if (clmnIndex == 4) {
							switch (c1.getStringCellValue()) {
							case "dollar":
								currencyConverter = 71.15;
								r2.createCell(5).setCellValue(currencyConverter * r1.getCell(5).getNumericCellValue());
								break;
							case "pound":
								currencyConverter = 91.26;
								r2.createCell(5).setCellValue(currencyConverter * r1.getCell(5).getNumericCellValue());
								break;
							case "sing":
								currencyConverter = 52.37;
								r2.createCell(5).setCellValue(currencyConverter * r1.getCell(5).getNumericCellValue());
								break;
							default:
								if (r1.getCell(5).getCellTypeEnum() == CellType.NUMERIC) {
									r2.createCell(5).setCellValue(r1.getCell(5).getNumericCellValue());

								}
								// r2.createCell(5).setCellValue(currencyConverter *
								// r1.getCell(5).getNumericCellValue());
								currencyConverter = 1;
							}

						}

						c2.setCellValue(c1.getStringCellValue());
						break;
					case NUMERIC:
						if (DateUtil.isCellDateFormatted(c1)) {
							 c2 = r2.createCell(clmnIndex);
							c2.setCellValue(c1.getDateCellValue());
						} else {
							if (clmnIndex == 5) {
								
							} else {
								 c2 = r2.createCell(clmnIndex);
								 c2.setCellValue(c1.getNumericCellValue());
							}
							
								

						}
						break;
					default:
						c2 = r2.createCell(clmnIndex);
						c2.setCellValue("");

					}
				}

			}
			FileOutputStream fos = new FileOutputStream(
					"D:\\jboss-eap-7.1\\bin\\fileUpload\\tmpFiles\\employee_" + LocalDate.now() + ".xlsx");
			wb2.write(fos);
			fos.close();
			wb2.close();
			wb1.close();

		} catch (EncryptedDocumentException | InvalidFormatException |

				IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			e.getMessage();
		}

	}
}

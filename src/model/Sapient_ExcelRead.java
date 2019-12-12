package model;

public class Sapient_ExcelRead {
	public static void processExcel() {
		/*
		 * try { File f = new
		 * File("D:/jboss-eap-7.1/bin/fileUpload/tmpFiles/firstFile.xlsx"); Workbook wb
		 * = WorkbookFactory.create(f); System.out.println(wb.getNumberOfSheets());
		 * Iterator<org.apache.poi.ss.usermodel.Sheet> sheetIterator =
		 * wb.sheetIterator(); Set<String> set;// =new HashSet<String>(); Map<String,
		 * Set> hash = new HashedMap<String, Set>(); while (sheetIterator.hasNext()) {
		 * Sheet sh = sheetIterator.next(); System.out.println(sh.getSheetName()); set =
		 * new HashSet<String>(); sh.getLastRowNum(); //sh.getRow(0).getLastCellNum();
		 * System.out.println("index" + CellReference.convertColStringToIndex("C")); //
		 * sh.getRow(0).getCell(CellReference.convertColStringToIndex("D")).
		 * getNumericCellValue(); Iterator<Row> row = sh.rowIterator(); while
		 * (row.hasNext()) { Row r = row.next();
		 * 
		 * Iterator<Cell> c = r.cellIterator(); while (c.hasNext()) { Cell cell =
		 * c.next(); set.add(CellReference.convertNumToColString(cell.getRowIndex()));
		 * getCellValue(cell); } hash.put(sh.getSheetName(), set); }
		 * 
		 * } wb.close();
		 * 
		 * for (Entry<String, Set> entry : hash.entrySet()) {
		 * System.out.println(entry.getKey()); System.out.println(entry.getValue()); }
		 * 
		 * // putting vlaue in shhet 3 wb = WorkbookFactory.create(f); Sheet resultSheet
		 * = wb.createSheet("Result"); for (Entry<String, Set> entry : hash.entrySet())
		 * { System.out.println(entry.getKey()); Set<String> val = entry.getValue();
		 * Sheet she = wb.getSheet(entry.getKey()); int tillLastRow =
		 * she.getLastRowNum();
		 * 
		 * for (String s : val) { int columnIndex =
		 * CellReference.convertColStringToIndex(s);
		 * 
		 * for (int i = 0; i < tillLastRow; i++) {
		 * 
		 * Cell c = she.getRow(i).getCell(columnIndex); if (c != null) { switch
		 * (c.getCellTypeEnum()) { case BOOLEAN:
		 * resultSheet.createRow(i).createCell(columnIndex).setCellValue(c.
		 * getBooleanCellValue());
		 * 
		 * break; case NUMERIC: if (DateUtil.isCellDateFormatted(c)) {
		 * resultSheet.createRow(i).createCell(columnIndex).setCellValue(c.
		 * getDateCellValue());
		 * 
		 * } else { System.out.println("tt"+c.getNumericCellValue()); Row row ;
		 * if(resultSheet.getRow(i)==null) {
		 * 
		 * row = resultSheet.createRow(i); }else { row = resultSheet.getRow(i); } //Row
		 * row = she.createRow(i); Cell cell = row.createCell(columnIndex);
		 * cell.setCellStyle(c.getCellStyle()); Double d=c.getNumericCellValue();
		 * cell.setCellValue(d);
		 * 
		 * } break;
		 * 
		 * case FORMULA: System.out.println(c.getCellFormula()); break; default:
		 * System.out.println(""); } }
		 * 
		 * } }
		 * 
		 * 
		 * } File ff=new
		 * File("D:/jboss-eap-7.1/bin/fileUpload/tmpFiles/poi-generated-file.xlsx");
		 * if(ff.exists()) { ff.delete(); } FileOutputStream fileOut = new
		 * FileOutputStream(
		 * "D:/jboss-eap-7.1/bin/fileUpload/tmpFiles/poi-generated-file.xlsx");
		 * 
		 * wb.write(fileOut); fileOut.close();
		 * 
		 * // Closing the workbook
		 * 
		 * wb.close();
		 * 
		 * } catch (IOException e) { // TODO Auto-generated catch block e.getMessage();
		 * e.printStackTrace(); e.printStackTrace(); } catch (EncryptedDocumentException
		 * e) { // TODO Auto-generated catch block e.getMessage(); e.printStackTrace();
		 * } catch (Exception e) { // TODO Auto-generated catch block e.getMessage();
		 * e.printStackTrace(); }
		 */

	}

	/*
	 * private static void getCellValue(Cell c) { switch (c.getCellTypeEnum()) {
	 * case BOOLEAN: System.out.println(c.getBooleanCellValue()); break; case
	 * NUMERIC: if (DateUtil.isCellDateFormatted(c)) {
	 * System.out.println(c.getDateCellValue()); } else {
	 * System.out.println(c.getNumericCellValue()); } break; case FORMULA:
	 * System.out.println(c.getCellFormula()); break; case BLANK:
	 * System.out.println("blanck"); break;
	 * 
	 * } }
	 */
}

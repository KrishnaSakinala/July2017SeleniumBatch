package day20.com.automationtesting.apachepoi;

public class ReadExcelData {

	public static void main(String[] args) throws Exception {

		/*
		 * FileInputStream fis = new
		 * FileInputStream("/KRISHNA VOLUME/Jar Files/poi-3.16-beta1/TestData.xlsx");
		 * XSSFWorkbook workbook = new XSSFWorkbook(fis); XSSFSheet sheet =
		 * workbook.getSheet("Credentials"); XSSFRow row = sheet.getRow(1); XSSFCell
		 * cell = row.getCell(3);
		 * 
		 * // String userName = cell.getStringCellValue(); //
		 * System.out.println("Value from the Excel Sheet is: " + userName);
		 * 
		 * // String password = cell.getStringCellValue(); //
		 * System.out.println("Value from the Excel Sheet is: " + password);
		 * 
		 * int noOfAttempts = (int) cell.getNumericCellValue();
		 * System.out.println("Value from the Excel Sheet is: " + noOfAttempts);
		 */

		ExcelApiTest eat = new ExcelApiTest("/KRISHNA VOLUME/Jar Files/poi-3.16-beta1/TestData.xlsx");

		System.out.println("****** Using Column Number **********");

		System.out.println(eat.getCellData("Credentials", 0, 1));
		System.out.println(eat.getCellData("Credentials", 1, 1));
		System.out.println(eat.getCellData("Credentials", 2, 1));
		System.out.println(eat.getCellData("Credentials", 3, 1));

		System.out.println("****** Using Column Name **********");

		System.out.println(eat.getCellData("Credentials", "UserName", 1));
		System.out.println(eat.getCellData("Credentials", "PassWord", 1));
		System.out.println(eat.getCellData("Credentials", "DateCreated", 1));
		System.out.println(eat.getCellData("Credentials", "NoOfAttempts", 1));

		System.out.println("****** Row and Column Count **********");

		System.out.println(eat.getRowCount("UserData"));
		System.out.println(eat.getColumnCount("UserData"));

	}

}

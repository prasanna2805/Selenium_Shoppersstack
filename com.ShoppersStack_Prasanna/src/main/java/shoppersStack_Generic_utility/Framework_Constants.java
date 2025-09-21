package shoppersStack_Generic_utility;

public interface Framework_Constants {
	
	JavaUtility java=new JavaUtility();
	
	static final String propertypath="./src/test/resources/Test data/ShoppersStack.properties";
	
	static final String Excelpath="./src/test/resources/Test data/Data.xlsx";
	
	static final String Screenshotpath="./Screenshots/"+java.localdateandtime()+".png";
	
	static final String reportpath="./Reports/"+java.localdateandtime()+".html";
	
}

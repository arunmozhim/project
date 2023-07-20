package Seleniumproject.mavenproject;

import java.io.IOException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class Property {
String filepath="C:\\Users\\Hp\\eclipse-workspace\\Add\\mavenproject\\src\\main\\java\\Seleniumproject\\mavenproject\\Property.java";
public void readProperty() throws IOException
{
	File f=new File(filepath);
	FileInputStream FS=new FileInputStream(f);
	Property p=new Property();
	((Properties) p).load(FS);
	String v1 = ((Properties) p).getProperty("value1");
    int value1 = Integer.parseInt(v1);
    
    String v2 = p.getProperty("value2");
    int value2 = Integer.parseInt(v2);	
    
	int sum = value1 + value2;
	
	p.setProperty("Sum", String.valueOf(sum));
	System.out.println("Sum: " + sum);
}
	private void setProperty(String string, String valueOf) {
	// TODO Auto-generated method stub
	
}
	public static void main(String[] args) {
		FileProperty FP = new FileProperty();
		FP.readProperty();
		// TODO Auto-generated method stub

	}

}

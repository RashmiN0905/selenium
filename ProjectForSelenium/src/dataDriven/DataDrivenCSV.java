package dataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataDrivenCSV {

	public static void main(String[] args) throws IOException {
		FileInputStream file = new FileInputStream("./TestResources/Testdata.properties");
		Properties properties = new Properties();
		properties.load(file);
		System.out.println(properties.getProperty("url"));
		System.out.println(properties.getProperty("Username"));
		System.out.println(properties.getProperty("Password"));
	}
}

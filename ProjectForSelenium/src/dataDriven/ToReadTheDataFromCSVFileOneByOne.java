package dataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.opencsv.CSVReader;

public class ToReadTheDataFromCSVFileOneByOne {

	public static void main(String[] args) throws IOException {
		FileReader file = new FileReader("./TestResources/Testdata.csv");
		CSVReader csvreader = new CSVReader(file);
		String[] username = csvreader.readNext();
		System.out.print(username[0]);
		System.out.println(username[1]);
		
		String[] password = csvreader.readNext();
		System.out.print(password[0]);
		System.out.println(password[1]);
		
	}

}

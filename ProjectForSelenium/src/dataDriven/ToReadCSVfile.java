package dataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import com.opencsv.CSVReader;

public class ToReadCSVfile {

	public static void main(String[] args) throws IOException {
		FileReader file = new FileReader("./TestResources/Testdata.csv");
		CSVReader csvReader = new CSVReader(file);
		
		String[] read = csvReader.readNext();
//		for (String string : read) {
//			System.out.println(string);
//		}
//		
//		String[] read1 = csvReader.readNext();
//		for (String string : read1) {
//			System.out.println(string);
//		}
//		String[] read2 = csvReader.readNext();
//		for (String string : read2) {
//			System.out.println(string);
//		}
		
		System.out.println(read[1]);
	}
}

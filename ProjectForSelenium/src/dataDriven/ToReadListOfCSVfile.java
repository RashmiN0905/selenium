package dataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.List;

import com.opencsv.CSVReader;

public class ToReadListOfCSVfile {
	public static void main(String[] args) throws IOException {
		FileReader file = new FileReader("./TestResources/Testdata.csv");
		CSVReader csvReader = new CSVReader(file);
		List<String[]> read = csvReader.readAll();

		for (String[] strings : read) {
			for (String strings2 : strings) {
				System.out.println(strings2);
			}
		}

	}

}

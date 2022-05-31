package controlador;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LoadPropertiesDB {

	private FileReader propertiesFile;
	private String[] properties = new String[4];

	public LoadPropertiesDB() throws IOException {

		// C:\Users\cristian.cardozo\Documents\Workspace\PildorasInf\DatabaseManager
		propertiesFile = new FileReader("./datos_configs.txt");
		BufferedReader buffer = new BufferedReader(propertiesFile);
		for (int i = 0; i < properties.length; i++) {
			properties[i] = buffer.readLine();
		}
		propertiesFile.close();

	}
	public LoadPropertiesDB(String path){

		try {
			propertiesFile = new FileReader(path);

			BufferedReader buffer = new BufferedReader(propertiesFile);
			for (int i = 0; i < properties.length; i++) {
				properties[i] = buffer.readLine();
			}
			propertiesFile.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public String[] getProperties() {
		return properties;
	}

	public String getUrl() {
		return properties[0] + properties[1];
	}

	public String getDatabaseName() {
		return properties[1];
	}

	public String getUser() {
		return properties[2];
	}

	public String getPassword() {
		return properties[3];
	}

}

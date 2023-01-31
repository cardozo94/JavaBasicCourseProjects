package directorios;

import java.io.File;
import java.io.IOException;

public class Creando {

	public static void main(String[] args) {
		String rutaString = "/Users/cristian.cardozo/Documents/PildorasInf/Java/ArchivosDirectorios/pruebatexto.txt";
		rutaString.replace("\\", rutaString);
		File ruta = new File(rutaString);
		//ruta.mkdir(); //carpeta
		try {
			ruta.createNewFile(); // crear archivo
		} catch (IOException e) {
			e.printStackTrace();
		}
		Escribiendo writer = new Escribiendo();
		writer.escribir(rutaString);
		
	}

}

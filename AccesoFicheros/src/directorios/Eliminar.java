package directorios;

import java.io.File;

public class Eliminar {

	public static void main(String[] args) {
		String rutaString = "/Users/cristian.cardozo/Documents/PildorasInf/Java/ArchivosDirectorios/pruebatexto.txt";
		rutaString.replace("\\", rutaString);
		File ruta = new File(rutaString);
		ruta.delete();

	}

}

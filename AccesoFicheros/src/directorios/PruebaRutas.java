package directorios;

import java.io.File;

public class PruebaRutas {

	public static void main(String[] args) {
		
		File archivo = new File("bin");
		System.out.println(archivo.getAbsolutePath());
		System.out.println("existe "+archivo.exists());
		System.out.println("es directorio "+archivo.isDirectory());
		System.out.println("es archivo "+archivo.isFile());
	}
}

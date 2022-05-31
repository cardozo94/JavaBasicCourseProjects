package directorios;

import java.io.FileWriter;
import java.io.IOException;

public class Escribiendo {
	
	public void escribir(String ruta) {
		String frase = "Esto es un ejemplo. Espero que salga.";
		try(FileWriter writer = new FileWriter(ruta);){
			for (int i = 0; i < frase.length(); i++) {
				writer.write(frase.charAt(i));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

package escribiendo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Escribiendo {

	public void escribir() {
		String frase = "Esta es una frase de prueba de escritura 2";
		
		try (FileWriter escritura = new FileWriter("C:\\Users\\cristian.cardozo\\Desktop\\nuevo.txt", true);){
			
			for (int i = 0; i < frase.length(); i++) {
				escritura.write(frase.charAt(i));
			}
//			escritura.close();
		} catch (IOException e) {
			System.out.println("Error creando archivo");
		}
	}
	
	public void escribirConBuffer() {

		
		try {
			File file = new File("C:\\Users\\cristian.cardozo\\Desktop\\nuevoBuffer.txt");
			 if (!file.exists()) {
			     file.createNewFile();
			  }
			FileWriter salida = new FileWriter(file);
			BufferedWriter buffer = new BufferedWriter(salida);
			String linea = "Esta es una frase de prueba de escritura con buffer";
			buffer.write(linea);
			buffer.close();
		} catch (IOException e) {
			System.out.println("Error creando el archivo");
			e.printStackTrace();
		}
	}
}

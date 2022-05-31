package leyendo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LeerFichero {

	public void lee() {

		try (FileReader entrada = new FileReader("C:\\Users\\cristian.cardozo\\Desktop\\ejemplo.txt");){
			

			int c = entrada.read();

			while (c != -1) {
				char letra = (char) c;
				System.out.print("" + letra);
				c = entrada.read();
			}
//			entrada.close();
		} catch (FileNotFoundException e) {

			System.out.println("No se ha encontrado el archivo");

		} catch (IOException e) {
			System.out.println("Error al leer el archivo");
		}
	}
	
	public void leeConBuffer() {

		try (FileReader entrada = new FileReader("C:\\Users\\cristian.cardozo\\Desktop\\ejemplo.txt");){
			
			BufferedReader buffer = new BufferedReader(entrada);
			String linea = "";
			while (linea != null) {				
				System.out.println(linea);
				linea = buffer.readLine();
			}
		} catch (FileNotFoundException e) {

			System.out.println("No se ha encontrado el archivo");

		} catch (IOException e) {
			System.out.println("Error al leer el archivo");
		}
	}

}

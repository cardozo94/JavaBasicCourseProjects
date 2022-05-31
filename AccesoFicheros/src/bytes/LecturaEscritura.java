package bytes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class LecturaEscritura {

	public static void main(String[] args) {

		int contador = 0;
		int[] datosEntrada = new int[631990];

		try (FileInputStream lectura = new FileInputStream("C:\\Users\\cristian.cardozo\\Pictures\\1.png")) {
			boolean finalArchivo = false;
			while (!finalArchivo) {
				int byteEntrada = lectura.read();
				if (byteEntrada == -1)
					finalArchivo = true;
				else {
					datosEntrada[contador] = byteEntrada;
					contador++;
				}
				System.out.println("byteEntrada " + byteEntrada+" datosEntrada "+datosEntrada[contador-1]+ " contador "+contador);
				
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Tamaño de la imagen en bytes " + (contador - 1));
		escribir(datosEntrada);
		
	}
	
	public static void escribir(int... datosNuevoFichero) {
		
		try(FileOutputStream escritura = new FileOutputStream("C:\\Users\\cristian.cardozo\\Pictures\\new1.png");){
			for (int i = 0; i < datosNuevoFichero.length; i++) {
				escritura.write(datosNuevoFichero[i]);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Archivo copiado");
	}

}

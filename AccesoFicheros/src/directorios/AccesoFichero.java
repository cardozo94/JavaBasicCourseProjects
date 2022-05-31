package directorios;

import java.io.File;

public class AccesoFichero {

	public static void main(String[] args) {
		String rutaString = "C:\\Users\\cristian.cardozo\\Documents\\PildorasInf\\Java\\ArchivosDirectorios";
		rutaString.replace("\\", rutaString);
		File ruta = new File(rutaString);
		System.out.println(ruta.getAbsolutePath());
		String[] nombresArchivos = ruta.list();
		recorre(ruta.getAbsolutePath(),0, nombresArchivos);
		
	}
	
	public static void recorre( String parentPath,int identation, String... files) {
		for (String string : files) {
			File file = new File(parentPath, string);
			if (file.isDirectory()) {
				structure(string+"-->", identation);
				recorre(parentPath+"/"+string,identation+1, file.list());
			}else {
				structure(string, identation);
			}
		}
	}
	
	public static void structure(String string, int identation) {
		if(identation ==0)
			System.out.println(string);
		else
			System.out.printf("%"+(identation*4)+"c|-"+string+"\n",' ');
	}
}

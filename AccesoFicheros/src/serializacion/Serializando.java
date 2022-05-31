package serializacion;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Serializando {

	public static void main(String[] args) {
		Administrador jefe = new Administrador("Camilo", 6800000, 2021, 12, 28);
		jefe.setIncentivo(500000);

		Empleado[] personal = new Empleado[3];

		personal[0] = jefe;
		personal[1] = new Empleado("Ana", 2500000, 2022, 1, 15);
		personal[2] = new Empleado("Luis", 1800000, 2022, 2, 15);

		try (
//				ObjectOutputStream writer = new ObjectOutputStream(new FileOutputStream(
//				"C:\\Users\\cristian.cardozo\\Documents\\Workspace\\PildorasInf\\AccesoFicheros\\empleados.dat"));){
				ObjectInputStream reader = new ObjectInputStream(new FileInputStream(
						"C:\\Users\\cristian.cardozo\\Documents\\Workspace\\PildorasInf\\AccesoFicheros\\empleados.dat"));) {

//			writer.writeObject(personal);
			
			Empleado[] personalRecuperado = (Empleado[])reader.readObject();
			for (Empleado empleado : personalRecuperado) {
				System.out.println(empleado);
			}
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}

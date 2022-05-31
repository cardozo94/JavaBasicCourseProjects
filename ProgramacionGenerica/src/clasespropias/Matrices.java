package clasespropias;

public class Matrices {

	public static <T> String getElementos(T[] array) {
		return "El array tiene "+array.length+" elementos";
	}
	
	public static <T extends Comparable<T>> T getElementoMenor(T[] array) {
		
		if (array == null | array.length==0) {
			return null;
		}
		
		T menor = array[0];
		
		for (int i =1; i<array.length; i++) {
			if(menor.compareTo(array[i]) >0 )
				menor = array[i];
		}
		
		return menor;
	}
}

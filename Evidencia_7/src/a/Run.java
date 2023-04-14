package a;
import java.util.List;

public class Run {

	public static void main(String[] args) {
		// Ejercicio de programacion funcional con java
		//Erick Tadeo Cobos Rojas
		
		//declaramos nuestra lista de enteros
		List<Integer> numberList = List.of(1,2,3,4,5);
		
		//la "convertimos" a stream para utilizar los métodos de stream
		numberList.stream()
			.map(number -> number+1) //mapeamos la lista, sumando uno a cada elemento
			.forEach(System.out::println); //imprimimos cada elemeto con un ForEach
	}

}

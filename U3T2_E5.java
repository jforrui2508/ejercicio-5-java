package U3_Tarea2;

import java.util.Scanner;

public class U3T2_E5 {
	
		// Método para eliminar vocales del nombre
	    public static String eliminarVocales(String nombreCompleto) {
	        // Expresión regular para buscar vocales (mayúsculas, minúsculas y acentuadas)
	        String noVocales = "[aeiouAEIOUáéíóúÁÉÍÓÚ]";
	        
	        // Reemplazo las vocales por un hueco vacío
	        return nombreCompleto.replaceAll(noVocales,"-");
	    }
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Pedir el nombre completo al usuario
	        System.out.print("Ingrese su nombre completo: ");
	        String nombreCompleto = scanner.nextLine();

	        // Eliminar vocales del nombre
	        String nombreSinVocales = eliminarVocales(nombreCompleto);

	        // Mostrar el resultado
	        System.out.println("Nombre sin vocales: " + nombreSinVocales);
	    }

	    
}



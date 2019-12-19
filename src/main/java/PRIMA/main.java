package PRIMA;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * Esta es la clase principal del programa de calculo de Prima.
 * @author Jimmy Celly
 *
 */
public class main {
	 public static Scanner leerEdad = new Scanner(System.in); //variable entera donde se almacenara el valor ingresado de la edad del conductor.
	 public static Scanner leerPuntos = new Scanner(System.in);//Variable entera donde se alamacenara los puntos ingresados de la licencia del conductor.
     public float prima=0;//Inicialización de la variable del tipo float, donde se almacenara el valor del prima calculado
     public static int edad=0;//Inicialización de la variable del tipo entera,donde se almacenara la edad.
     public static int puntos=0;//Inicialización de la variable del tipo entera, donde se almacena los puntos.
     public main(String args[]) {	
		 /*
		  * Se manaje un try-catch para el control de los datos ingresados por el usuario.
		  * Caso contrario se presenta el mensaje de "Datos de Ingreso No Validos"
		  */
	       try{
	           System.out.println("Introducir la Edad entre 18 y 90 aÃ±os: ");
	           edad = leerEdad.nextInt();
	           System.out.println("Introducir Puntos entre 1 y 30: ");
	           puntos = leerPuntos.nextInt();
	           primaGradle prima1 = new primaGradle();
	           System.out.println(prima1.prima(edad,puntos));        
	       }
	       catch(InputMismatchException e){
	           System.out.println("Datos de Ingreso No Validos");
	           System.exit(1);    
	       }
     }
}

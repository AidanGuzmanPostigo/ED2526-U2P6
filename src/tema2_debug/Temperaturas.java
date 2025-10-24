package tema2_debug;
import java.util.Scanner;
/**
 * Programa con errores para practicar la depuración.
 * El programa pide una temperatura y muestra si hace frío, calor o temperatura templada.
 * Después, repite mientras el usuario quiera continuar.
 */
public class Temperaturas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //AGP20252410: falta un ;
        mostrarMensajeBienvenida();
        boolean continuar = true;
        //AGP2025 para que el bloque del While funcione es necesario asignarle una condición válida, en este caso continuar == true
        while (continuar  == true) {
        	//AGP20252410: falta un ;
            double temperatura = pedirTemperatura(sc);
            //AGP20252410: falta un ;
            mostrarResultado(temperatura);
            System.out.print("¿Desea introducir otra temperatura? (s/n): ");
            String respuesta = sc.next();
            //AGP20252410 he abierto y cerrado el if usando {}, no es necesario, pero sirve para evitar erorres.
            //AGP20252410 El programa falla en la comparación ya que, para comparar valores de strings ha de usarse el étodo .equals, también he añadido IgnoreCase para que no haya que utilizar un OR
            if (respuesta.equalsIgnoreCase("n")) {
                continuar = false;
            }
        }
        //AGP20252410: falta un ;
        sc.close();
        //AGP 20252410: falta un ; y hay que eliminar los dos símbolos al final del systemout
        System.out.println("Programa finalizado.");
    }
    public static void mostrarMensajeBienvenida() {
    	//AGP20252410: falta un ;
        System.out.println("Bienvenido al analizador de temperaturas.");
        //AGP20252410: falta un ;
        System.out.println("Este programa indica si hace frío, calor o está templado.");
    }
    public static double pedirTemperatura(Scanner sc) {
        double t;
        do {
            System.out.print("Introduce la temperatura en grados: ");
            t = sc.nextDouble();
            if (t < -10 && t > 50) {
            	//AGP20252410: falta un ;
                System.out.println("Temperatura fuera del rango permitido (-10 a 50).");
            }
        } while (t < -10 && t > 50);
        return t;
    }
    public static void mostrarResultado(double temperatura) {
        if (temperatura < 15)
        	//AGP20252410: falta un ;
            System.out.println("Hace frío.");
        else if (temperatura >= 15 && temperatura < 30)
        	//AGP20252410: falta un ;
            System.out.println("Temperatura templada.");
        else if (temperatura >= 30)
        	//AGP20252410: falta un ;
            System.out.println("¡Hace mucho calor!");
        else
        	//AGP20252410: falta un ;
            System.out.println("Valor no reconocido.");
    }
}



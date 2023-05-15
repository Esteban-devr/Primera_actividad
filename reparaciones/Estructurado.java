
/**
 * Write a description of class actividad here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.Scanner;

public class Estructurado
{
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] identificaciones = new String[50];
        String[] nombres = new String[50];
        String[] reparaciones = new String[50];
        double[] costos = new double[50];
        int numeroClientes;
        String identificacion, nombre, reparacion;
        double costo;
        double promedio = 0;

        System.out.println("***********************************");
        System.out.println("Digite el número de clientes: ");
        numeroClientes = sc.nextInt();

        for (int i = 0; i < numeroClientes; i++) {
            System.out.println("***********************************");
            System.out.println("Digite la identificación del cliente: ");
            identificacion = sc.next();
            identificaciones[i] = identificacion;

            System.out.println("***********************************");
            System.out.println("Digite el nombre del cliente: ");
            nombre = sc.next();
            nombres[i] = nombre;

            System.out.println("***********************************");
            System.out.println("Digite la reparacion que se le realizo al cliente: ");
            reparacion = sc.next();
            reparaciones[i] = reparacion;
            
            System.out.println("***********************************");
            System.out.println("Digite el costo que le genero al cliente: ");
            costo = sc.nextDouble();
            costos[i] = costo;

        }

        for (int i = 0; i < numeroClientes; i++) {
            promedio += (costos[i]);
        }
        
        System.out.println("**********LISTA DE CLIENTES*********");
        for (int i = 0; i < numeroClientes; i++) {
            System.out.println("***********************************");
            System.out.println("C.C: "+ identificaciones[i]);
            System.out.println("Nombres: "+ nombres[i]);
            System.out.println("Reparacion: "+ reparaciones[i]);
            System.out.println("Costo: "+ costos[i]+"$");
        }

        promedio /= numeroClientes;
        System.out.println("*************************************************");
        System.out.println("El promedio de ingresos es de: " + promedio+"$");
    }
}



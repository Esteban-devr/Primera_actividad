
/**
 * Write a description of class Promedio here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.Scanner;

public class Promedio
{
  public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int numeroClientes;
       ClientesPOO[] losClientes = new ClientesPOO[50];
       String identificacion, nombre, reparacion;
       double costo;
       double promedio = 0;
       
       System.out.println("***********************************");
       System.out.println("Digite el numero de clientes: ");
       numeroClientes = sc.nextInt();
       for(int i = 0; i < numeroClientes; i++){
           System.out.println("***************************************");
           System.out.println("Digite la identificacion del cliente: ");
           identificacion = sc.next();
           System.out.println("***********************************");
           System.out.println("Digite el nombre del cliente: ");
           nombre = sc.next();
           System.out.println("**********************************************");
           System.out.println("Digite la reparacion realizada al cliente: ");
           reparacion = sc.next();
           System.out.println("**********************************************");
           System.out.println("Digite el costo que le genero al cliente: ");
           costo = sc.nextDouble();
           ClientesPOO unCliente = new ClientesPOO();
           unCliente.identificacion = identificacion;
           unCliente.nombre = nombre;
           unCliente.reparacion = reparacion;
           unCliente.costo = costo;
           losClientes[i] = unCliente;
        }
         for(int i = 0; i < numeroClientes; i++){
             promedio = promedio + (losClientes[i].costo / numeroClientes);
            }
            
            System.out.println("***************LISTA DE CLIENTES********************");
            for(int i = 0; i < numeroClientes; i++){
                System.out.println("***********************************");
             System.out.println("C.C: " +losClientes[i].identificacion);
             System.out.println("Nombres: "+ losClientes[i].nombre);
            System.out.println("Reparacion: "+ losClientes[i].reparacion);
            System.out.println("Costo: "+ losClientes[i].costo+"$");
            }
            
            System.out.println("El promedio general de ingresos es de: " + promedio+"$");
         }
}

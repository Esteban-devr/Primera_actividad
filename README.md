# Ejercicio 1
En su labor como programador de software ha sido elegido para el desarrollo de una aplicación que necesita un coordinador logístico de una tienda de reparación de computadores, que desea calcular el promedio de ingresos que han tenido en el último periodo. Se requiere para saber cómo tal el promedio de ingresos netos para los reportes fiscales de la empresa. Como información básica de cada cliente se debe registrar el número de identificación, su nombre y la reparación que se le ha realizado. Aclaraciones:

• Se supondrá que la aplicación solo se requiere para calcular el promedio de un único periodo especifico.

• Para efectos de mantener la simplicidad del ejemplo no se contemplan manejar persistencia en el almacenamiento de los datos.

• No se realiza validación, ni se verifica calidad en los datos ingresados


# HU Programa
![HISTORIA USUARIO](https://github.com/Esteban-devr/Primera_actividad/assets/133018246/ddd2541f-12c1-43e1-b77a-12b8eb0de84e)


# Diagrama caso de uso

![casodeuso](https://github.com/Esteban-devr/Primera_actividad/assets/133018246/5f5cc139-dfe1-4c62-976b-b2a213a2ad58)



# Diagrama de Flujo
![DFD](https://github.com/Esteban-devr/Primera_actividad/assets/133018246/1abfc1d9-001e-4bf7-9df2-1ccbd240d195)


# Pseudocodigo

Algoritmo CalcularProm

Tamaño <- 50

Dimension identificaciones[Tamaño]

Dimension nombres[Tamaño]

Dimension Reparaciones[Tamaño]

Dimension costos[Tamaño]

Escribir '**********************************'

Escribir 'Digite el número de clientes:'

Leer numeroClientes

Para i<-0 Hasta numeroClientes-1 Hacer

Escribir '**********************************'

Escribir 'Digite la identificación del cliente:'

Leer identificacion

Escribir '**********************************'

Escribir 'Digite el nombre del cliente:'

Leer nombre

Escribir '**********************************'

Escribir 'Digite la reparacion realizada al cliente:'

Leer Reparacion

Escribir '**********************************'

Escribir 'Digite el costo de la reparacion del cliente:'

Leer costo

identificaciones[i] <- identificacion

nombres[i] <- nombre

Reparaciones[i] <- Reparacion

costos[i] <- costo

FinPara

Para i<-0 Hasta numeroClientes-1 Hacer

promedio <- promedio+(costos[i]/numeroClientes)

FinPara

Escribir '**********************************'

Escribir 'Los clientes son :'

Para i<-0 Hasta numeroClientes-1 Hacer

Escribir '**********************************'

Escribir 'C.C: ',identificaciones[i]

Escribir 'Nombre: ',nombres[i]

Escribir 'Reparacion: ',Reparaciones[i]

Escribir 'Costo: ',costos[i],'$'

FinPara

Escribir '**********************************'

Escribir 'El promedio de ingresos es de: ',promedio,'$'

FinAlgoritmo

# Codigo estructurado en java 

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


# Codigo orientado a objetos en java

## Clase ClientesPOO

public class ClientesPOO
{
    String identificacion;
    String nombre;
    String reparacion;
    double costo;
}

## Clase Promedio

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

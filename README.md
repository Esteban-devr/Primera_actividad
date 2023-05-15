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

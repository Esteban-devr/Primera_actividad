---


---

<h1 id="ejercicio-1">Ejercicio 1</h1>
<p>En su labor como programador de software ha sido elegido para el desarrollo de una aplicación que necesita un coordinador logístico de una tienda de reparación de computadores, que desea calcular el promedio de ingresos que han tenido en el último periodo. Se requiere para saber cómo tal el promedio de ingresos netos para los reportes fiscales de la empresa. Como información básica de cada cliente se debe registrar el número de identificación, su nombre y la reparación que se le ha realizado. Aclaraciones:</p>
<p>• Se supondrá que la aplicación solo se requiere para calcular el promedio de un único periodo especifico.</p>
<p>• Para efectos de mantener la simplicidad del ejemplo no se contemplan manejar persistencia en el almacenamiento de los datos.</p>
<p>• No se realiza validación, ni se verifica calidad en los datos ingresados</p>
<h1 id="hu-programa">HU Programa</h1>
https://vdgdgdgd.atlassian.net/browse/HUED-2
<h1 id="diagrama-caso-de-uso">Diagrama caso de uso</h1>
<p>Subido en el repositorio</p>
<h1 id="diagrama-de-flujo">Diagrama de Flujo</h1>
<p>Subido en el repositorio</p>
<h1 id="pseudocodigo">Pseudocodigo</h1>
<p>&lt;![endif]–&gt;</p>
<p>Algoritmo CalcularProm</p>
<p>Tamaño &lt;- 50</p>
<p>Dimension identificaciones[Tamaño]</p>
<p>Dimension nombres[Tamaño]</p>
<p>Dimension Reparaciones[Tamaño]</p>
<p>Dimension costos[Tamaño]</p>
<p>Escribir ‘**********************************’</p>
<p>Escribir ‘Digite el número de clientes:’</p>
<p>Leer numeroClientes</p>
<p>Para i&lt;-0 Hasta numeroClientes-1 Hacer</p>
<p>Escribir ‘**********************************’</p>
<p>Escribir ‘Digite la identificación del cliente:’</p>
<p>Leer identificacion</p>
<p>Escribir ‘**********************************’</p>
<p>Escribir ‘Digite el nombre del cliente:’</p>
<p>Leer nombre</p>
<p>Escribir ‘**********************************’</p>
<p>Escribir ‘Digite la reparacion realizada al cliente:’</p>
<p>Leer Reparacion</p>
<p>Escribir ‘**********************************’</p>
<p>Escribir ‘Digite el costo de la reparacion del cliente:’</p>
<p>Leer costo</p>
<p>identificaciones[i] &lt;- identificacion</p>
<p>nombres[i] &lt;- nombre</p>
<p>Reparaciones[i] &lt;- Reparacion</p>
<p>costos[i] &lt;- costo</p>
<p>FinPara</p>
<p>Para i&lt;-0 Hasta numeroClientes-1 Hacer</p>
<p>promedio &lt;- promedio+(costos[i]/numeroClientes)</p>
<p>FinPara</p>
<p>Escribir ‘**********************************’</p>
<p>Escribir ‘Los clientes son :’</p>
<p>Para i&lt;-0 Hasta numeroClientes-1 Hacer</p>
<p>Escribir ‘**********************************’</p>
<p>Escribir 'C.C: ',identificaciones[i]</p>
<p>Escribir 'Nombre: ',nombres[i]</p>
<p>Escribir 'Reparacion: ',Reparaciones[i]</p>
<p>Escribir ‘Costo: ‘,costos[i],’$’</p>
<p>FinPara</p>
<p>Escribir ‘**********************************’</p>
<p>Escribir ‘El promedio de ingresos es de: ‘,promedio,’$’</p>
<p>FinAlgoritmo</p>


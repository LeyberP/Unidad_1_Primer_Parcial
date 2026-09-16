# Programa Sistema de Salarios

> Sistema de consola para la gestión interactiva de salarios desarrollado aplicando estructuras repetitivas (`do-while`, `while`), estructuras de selección múltiple (`switch`) y lógica algorítmica en C++ y Java, permitiendo el registro continuo de datos, cálculo de métricas estadísticas (promedio, salario mayor y menor), comparación individual de sueldos y reinicio seguro de variables.

---

<h2>Información Académica</h2>

<table>
  <thead>
    <tr>
      <th align="left">Propiedad</th>
      <th align="left">Detalle</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td><b>Universidad</b></td>
      <td>Universidad Técnica de Ambato (UTA)</td>
    </tr>
    <tr>
      <td><b>Facultad</b></td>
      <td>Facultad de Ingeniería en Sistemas, Electrónica e Industrial</td>
    </tr>
    <tr>
      <td><b>Carrera</b></td>
      <td>Software</td>
    </tr>
    <tr>
      <td><b>Asignatura</b></td>
      <td>Algoritmos y Lógica de programación</td>
    </tr>
    <tr>
      <td><b>Docente</b></td>
      <td>Ing. José Ruben Caizabuano, Mg.</td>
    </tr>
    <tr>
      <td><b>Estudiantes</b></td>
      <td>Peñafiel Solórzano Leyber Smith</td>
    </tr>
    <tr>
      <td><b>Semestre</b></td>
      <td>Primero "B"</td>
    </tr>
    <tr>
      <td><b>Período</b></td>
      <td>Julio – Diciembre 2026</td>
    </tr>
    <tr>
      <td><b>Actividad</b></td>
      <td>Menú Salario: sistema de salarios con menú </td>
    </tr>
  </tbody>
</table>

---

<h2>Descripción del Proyecto</h2>

<p>Este proyecto implementa un sistema automatizado por consola para la administración, análisis estadístico y procesamiento de salarios que permite:</p>

<ul>
  <li><b>Menú interactivo de opciones:</b> Navegación cíclica mediante una estructura <code>do-while</code> y bifurcación mediante <code>switch</code> (<code>Según</code>), garantizando la presentación del menú y ejecución continua hasta que el usuario decida salir ordenadamente.</li>
  <li><b>Registro dinámico de salarios:</b> Lectura consecutiva de sueldos mediante un bucle <code>while</code> que evalúa números mayores o iguales a cero, culminando el ingreso de forma controlada al introducir un valor negativo.</li>
  <li><b>Determinación de extremos estadísticos:</b> Asignación automática del primer salario válido como referencia inicial para salario mayor y menor, actualizándolos secuencialmente conforme se registran nuevos valores.</li>
  <li><b>Cálculo del promedio y control de errores:</b> Computación en tiempo real del promedio de salarios registrados mediante acumulador y contador, implementando una condición preventiva (<code>contador &gt; 0</code>) para evitar divisiones indefinidas entre cero.</li>
  <li><b>Módulo de comparación salarial:</b> Verificación condicional de cualquier sueldo frente a la media calculada, clasificando la entrada como <i>mayor</i>, <i>igual</i> o <i>menor</i> respecto al promedio actual.</li>
  <li><b>Reinicio de estado del sistema:</b> Función para resetear a cero los acumuladores, contadores y valores estadísticos almacenados sin necesidad de cerrar la aplicación.</li>
  <li><b>Manejo robusto de excepciones y salida:</b> Notificación oportuna ante la ausencia de registros previos, validación de opciones inexistentes en el menú y finalización limpia mediante la opción <code>0</code>.</li>
</ul>

---

<h2>Análisis y Requisitos</h2>

<h3>Objetivo General</h3>
<p>Diseñar un programa que permita gestionar salarios de manera interactiva, ofreciendo opciones al usuario mediante un menú con la capacidad de registrar datos, procesar estadísticas y reiniciar la información almacenada.</p>

<h3>Requisitos Funcionales</h3>
<ul>
  <li><b>Control de Flujo:</b>
    <ul>
      <li>Menú implementado con un ciclo <code>do-while</code> para garantizar al menos una ejecución.</li>
      <li>Manejo de alternativas estructurado a través de una sentencia <code>switch</code>.</li>
    </ul>
  </li>
  <li><b>Mecanismo de Registro:</b>
    <ul>
      <li>Ciclo <code>while</code> condicionado a valores de salario &ge; 0.</li>
      <li>Contador para el total de datos y acumulador para la suma aritmética.</li>
    </ul>
  </li>
  <li><b>Cálculos Estadísticos:</b>
    <ul>
      <li>Promedio: <code>acumulador / contador</code>.</li>
      <li>Identificación de salario máximo y mínimo.</li>
      <li>Validación defensiva contra divisiones indefinidas.</li>
    </ul>
  </li>
  <li><b>Reinicio:</b>
    <ul>
      <li>Restablecimiento completo de variables a su estado inicial.</li>
    </ul>
  </li>
</ul>

---

<h2>Algoritmo Paso a Paso</h2>

<ol>
  <li><b>Inicio:</b> Declarar e inicializar variables numéricas (<code>contador = 0</code>, <code>acumulador = 0</code>, <code>mayor = 0</code>, <code>menor = 0</code>, <code>promedio = 0</code>).</li>
  <li><b>Mostrar menú principal:</b> Desplegar las opciones disponibles (1 a 4 y 0).</li>
  <li><b>Lectura de opción:</b> Capturar la selección ingresada por el usuario.</li>
  <li><b>Bifurcación según opción:</b>
    <ul>
      <li><b>Opción 1 (Registrar):</b> Solicitar salarios uno a uno. Mientras <code>salario &ge; 0</code>: incrementar contador, sumar al acumulador, actualizar mayor/menor. Al ingresar un negativo, culminar bucle.</li>
      <li><b>Opción 2 (Resumen):</b> Si <code>contador &gt; 0</code>, calcular <code>promedio = acumulador / contador</code> y mostrar promedio, mayor y menor. Si no, notificar ausencia de datos.</li>
      <li><b>Opción 3 (Comparar):</b> Si <code>contador &gt; 0</code>, solicitar salario y evaluar si es mayor, igual o menor al promedio. Si no, notificar ausencia de datos.</li>
      <li><b>Opción 4 (Reiniciar):</b> Resetear variables a cero y confirmar reinicio.</li>
      <li><b>Opción 0 (Salir):</b> Mostrar mensaje de salida.</li>
      <li><b>De otro modo:</b> Indicar opción inválida.</li>
    </ul>
  </li>
  <li><b>Repetición:</b> Repetir desde el paso 2 mientras la opción sea diferente de 0.</li>
  <li><b>Fin del programa.</b></li>
</ol>

---

<h2>Pseudocódigo (PSeInt)</h2>

```text
Algoritmo MenuSalario
    Definir opcion, salario, contador, acumulador, mayor, menor, promedio Como Real
    contador <- 0
    acumulador <- 0
    mayor <- 0
    menor <- 0
    promedio <- 0
    Repetir
        Escribir '===== SISTEMA DE SALARIOS ====='
        Escribir '1. Registrar salarios'
        Escribir '2. Mostrar resumen'
        Escribir '3. Comparar un salario con el promedio'
        Escribir '4. Reiniciar información'
        Escribir '0. Salir'
        Leer opcion
        Según opcion Hacer
            1:
                Escribir 'Ingrese salarios (negativo para terminar):'
                Leer salario
                Mientras salario >= 0 Hacer
                    contador <- contador + 1
                    acumulador <- acumulador + salario
                    Si contador = 1 Entonces
                        mayor <- salario
                        menor <- salario
                    FinSi
                    Si salario > mayor Entonces
                        mayor <- salario
                    FinSi
                    Si salario < menor Entonces
                        menor <- salario
                    FinSi
                    Leer salario
                FinMientras
            2:
                Si contador > 0 Entonces
                    promedio <- acumulador / contador
                    Escribir 'Resumen de salarios:'
                    Escribir 'Promedio: ', promedio
                    Escribir 'Mayor: ', mayor
                    Escribir 'Menor: ', menor
                SiNo
                    Escribir 'No hay salarios registrados.'
                FinSi
            3:
                Si contador > 0 Entonces
                    promedio <- acumulador / contador
                    Escribir 'Ingrese salario a comparar:'
                    Leer salario
                    Si salario > promedio Entonces
                        Escribir 'El salario es mayor al promedio.'
                    SiNo
                        Si salario = promedio Entonces
                            Escribir 'El salario es igual al promedio.'
                        SiNo
                            Escribir 'El salario es menor al promedio.'
                        FinSi
                    FinSi
                SiNo
                    Escribir 'No hay salarios registrados.'
                FinSi
            4:
                contador <- 0
                acumulador <- 0
                mayor <- 0
                menor <- 0
                promedio <- 0
                Escribir 'Información reiniciada.'
            0:
                Escribir 'Saliendo del sistema...'
            De Otro Modo:
                Escribir 'Opción inválida.'
        FinSegún
    Hasta Que opcion = 0
FinAlgoritmo

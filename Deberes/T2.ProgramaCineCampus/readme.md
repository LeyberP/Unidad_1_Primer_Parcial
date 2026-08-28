# Programa Cine Campus

> Sistema de consola para un cine universitario desarrollado aplicando estructuras condicionales y lógica algorítmica en C++ y Java, simulando la compra de entradas, validación de datos, aplicación de promociones por prioridad y cálculo de recargos.

## Información Académica

| Propiedad | Detalle |
| :--- | :--- |
| **Universidad** | Universidad Técnica de Ambato (UTA) |
| **Facultad** | Facultad de Ingeniería en Sistemas, Electrónica e Industrial |
| **Carrera** | Software |
| **Asignatura** | Algoritmos y Lógica de programación |
| **Docente** | Ing. José Ruben Caizabuano, Mg. |
| **Estudiantes** | Castro Sanchez Joseph Andres <br> Pacha Lucas Marlon Joel <br> Peñafiel Solorzano Leyber Smith <br> Pico Cepeda Matias Alejandro <br> Yaguana Manzano Marlon Joel |
| **Semestre** | Primero "B" |
| **Período** | Julio – Diciembre 2026 |
| **Actividad** | Tarea Práctica: Persistencia con Archivos de Texto |

## Descripción del Proyecto

Este proyecto implementa un sistema automatizado para la gestión y simulación de taquilla en un cine universitario que permite:

* **Menú interactivo de opciones:** Comprar entradas, consultar precios vigentes o salir ordenadamente del sistema.
* **Selección por formatos de proyección:** Definición de tarifas fijas según el formato seleccionado (2D a $5.00, 3D a $7.50 e IMAX/VIP a $10.00).
* **Validación rigurosa de entradas:** Control de rangos permitidos para la cantidad de boletos (valores positivos) y edad del usuario (rango válido: 0 a 120 años).
* **Aplicación de promociones únicas por estricta prioridad:**
  * Descuento del **30%** para adultos mayores ($\geq$ 65 años).
  * Descuento del **20%** para niños ($\leq$ 11 años).
  * Descuento del **15%** para estudiantes en días laborables (Lunes a Viernes).
  * Descuento del **10%** aplicable de forma general los días miércoles.
* **Cálculo automatizado de recargos:** Adición del **10%** sobre el subtotal para funciones en formato IMAX durante fines de semana (Sábado y Domingo).
* **Beneficio especial de cortesía:** Entrega de un combo pequeño gratuito si la compra es de 4 o más entradas y el usuario es estudiante o menor de 11 años.
* **Generación de resumen en pantalla:** Desglose detallado tipo factura con precio unitario, subtotal, descuentos, recargos y el valor total neto a pagar.

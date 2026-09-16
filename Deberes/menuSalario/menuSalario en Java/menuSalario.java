import java.util.Scanner;

public class menuSalario {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int opcion;
        int contador = 0;
        double salario, acumulador = 0, mayor = 0, menor = 0, promedio = 0;

        do {
            System.out.println("\n===== SISTEMA DE SALARIOS =====");
            System.out.println("1. Registrar salarios");
            System.out.println("2. Mostrar resumen");
            System.out.println("3. Comparar un salario con el promedio");
            System.out.println("4. Reiniciar información");
            System.out.println("0. Salir");
            System.out.print("Elija una opción: ");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese salarios (negativo para terminar):");
                    salario = leer.nextDouble();
                    while (salario >= 0) {
                        contador++;
                        acumulador += salario;
                        
                        if (contador == 1) {
                            mayor = salario;
                            menor = salario;
                        }
                        if (salario > mayor) {
                            mayor = salario;
                        }
                        if (salario < menor) {
                            menor = salario;
                        }
                        salario = leer.nextDouble();
                    }
                    break;

                case 2:
                    if (contador > 0) {
                        promedio = acumulador / contador;
                        System.out.println("--- Resumen de salarios ---");
                        System.out.println("Promedio: " + promedio);
                        System.out.println("Mayor: " + mayor);
                        System.out.println("Menor: " + menor);
                    } else {
                        System.out.println("No hay salarios registrados.");
                    }
                    break;

                case 3:
                    if (contador > 0) {
                        promedio = acumulador / contador;
                        System.out.print("Ingrese salario a comparar: ");
                        salario = leer.nextDouble();
                        
                        if (salario > promedio) {
                            System.out.println("El salario es mayor al promedio.");
                        } else if (salario == promedio) {
                            System.out.println("El salario es igual al promedio.");
                        } else {
                            System.out.println("El salario es menor al promedio.");
                        }
                    } else {
                        System.out.println("No hay salarios registrados.");
                    }
                    break;

                case 4:
                    contador = 0;
                    acumulador = 0;
                    mayor = 0;
                    menor = 0;
                    promedio = 0;
                    System.out.println("Información reiniciada.");
                    break;

                case 0:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opción inválida.");
                    break;
            }
        } while (opcion != 0);
        
        leer.close();
    }
}

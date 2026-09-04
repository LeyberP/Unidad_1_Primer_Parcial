import java.util.Scanner;


public class ClasificacionNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


       
        double sumaNotas = 0;
     
        int contadorExcelentes = 0;
        int contadorAprobados = 0;
        int contadorSupletorios = 0;
        int contadorReprobados = 0;


        int totalAprobados = 0;


        int totalCalificaciones = 5;


        System.out.println("=== SISTEMA DE CLASIFICACIÓN DE CALIFICACIONES ===");


        for (int i = 1; i <= totalCalificaciones; i++) {
            double nota;


            // Validación de cada nota mediante do-while dentro del for
            do {
                System.out.print("Ingrese la calificación " + i + " (entre 0 y 10): ");
                nota = scanner.nextDouble();


                if (nota < 0 || nota > 10) {
                    System.out.println(" Error: La nota debe estar entre 0 y 10. Intente nuevamente.");
                }
            } while (nota < 0 || nota > 10);


            sumaNotas += nota;


            // Clasificación de la nota usando estructuras if-else
            if (nota >= 9 && nota <= 10) {
                System.out.println("  -> Clasificación: Excelente\n");
                contadorExcelentes++;
                totalAprobados++;
            } else if (nota >= 7 && nota < 9) {
                System.out.println("  -> Clasificación: Aprobado\n");
                contadorAprobados++;
                totalAprobados++;
            } else if (nota >= 5 && nota < 7) {
                System.out.println("  -> Clasificación: Supletorio\n");
                contadorSupletorios++;
            } else { // menos de 5
                System.out.println("  -> Clasificación: Reprobado\n");
                contadorReprobados++;
            }
        }


        // Cálculo del promedio
        double promedio = sumaNotas / totalCalificaciones;


        // Mostrar resultados finales
        System.out.println("==================================================");
        System.out.println("               RESULTADOS FINALES                 ");
        System.out.println("==================================================");
        System.out.printf("Promedio general de las notas: %.2f\n", promedio);
        System.out.println("--------------------------------------------------");
        System.out.println("Cantidad de notas Excelentes (9 a 10): " + contadorExcelentes);
        System.out.println("Cantidad de notas Aprobadas (7 a menos de 9): " + contadorAprobados);
        System.out.println("Total de Aprobados en general: " + totalAprobados);
        System.out.println("Cantidad de Supletorios (5 a menos de 7): " + contadorSupletorios);
        System.out.println("Cantidad de Reprobados (menos de 5): " + contadorReprobados);
        System.out.println("==================================================");


        scanner.close();
    }
}

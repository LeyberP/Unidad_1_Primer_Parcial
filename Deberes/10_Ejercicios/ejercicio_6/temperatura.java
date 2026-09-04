import java.util.Scanner;

public class RegistroTemperaturas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp, suma = 0, contador = 0;
        int frio = 0, templado = 0, calido = 0, muyCalido = 0;
        int mayor = Integer.MIN_VALUE, menor = Integer.MAX_VALUE;

        System.out.println("Ingrese temperaturas (999 para terminar):");
        temp = sc.nextInt();

        while (temp != 999) {
            if (temp < -50 || temp > 60) {
                System.out.println("Dato inválido. Solo entre -50 y 60.");
            } else {
                contador++;
                suma += temp;

                if (temp > mayor) mayor = temp;
                if (temp < menor) menor = temp;

                if (temp < 10) {
                    frio++;
                } else if (temp <= 24) {
                    templado++;
                } else if (temp <= 34) {
                    calido++;
                } else {
                    muyCalido++;
                }
            }
            temp = sc.nextInt();
        }

        if (contador > 0) {
            double promedio = (double) suma / contador;
            System.out.println("Cantidad de datos: " + contador);
            System.out.println("Mayor: " + mayor);
            System.out.println("Menor: " + menor);
            System.out.println("Promedio: " + promedio);
            System.out.println("Fríos: " + frio);
            System.out.println("Templados: " + templado);
            System.out.println("Cálidos: " + calido);
            System.out.println("Muy cálidos: " + muyCalido);
        } else {
            System.out.println("No se ingresaron temperaturas válidas.");
        }
    }
}

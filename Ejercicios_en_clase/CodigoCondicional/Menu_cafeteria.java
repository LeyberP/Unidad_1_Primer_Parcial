import java.util.Scanner; 

public class Menu_cafeteria { 

    public static void main(String[] args) { 

        Scanner sc = new Scanner(System.in); 

        System.out.println("- - - MENÚ DE PRODUCTOS - - -"); 

        System.out.println("1. Café - $2.00"); 

        System.out.println("2. Tostada - $1.50"); 

        System.out.println("3. Capuchino - $3.00"); 

        System.out.println("4.  Late - $2.5"); 

        System.out.print("Seleccione producto (1-4): "); 

        int opcion = sc.nextInt(); 

        double precio_unitario = 0; 

        if (opcion == 1) precio_unitario = 2.0; 

        else if (opcion == 2) precio_unitario = 1.0; 

        else if (opcion == 3) precio_unitario = 3.0; 

        else if (opcion == 4) precio_unitario = 2.5; 

        else { 

            System.out.println("Opción inválida"); 

            return; 

        } 

        System.out.print("Ingrese cantidad: "); 

        int cantidad = sc.nextInt(); 

         double subtotal = cantidad * precio_unitario; 

        double descuento; 

        if (subtotal >= 10) { 

            descuento = subtotal * 0.10; 

        } else { 

            descuento = 0; 

        } 

        double total = subtotal - descuento; 

        System.out.println("Subtotal: $" + subtotal); 

        System.out.println("Descuento: $" + descuento); 

        System.out.println("Total a pagar: $" + total); 

    } 

}
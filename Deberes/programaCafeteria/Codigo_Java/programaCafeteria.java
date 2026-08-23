import java.util.Scanner;
public class Compra_Cafeteria_Universitaria {
    public static void main(String[] args) {
    int cantidad, edad;
    String nombre,nombreU, mensajePago="";
    double calculo,producto,descuento,total, dinero,cambio=0;
    Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
            nombre = sc.next();
        System.out.println("Ingrese su edad: ");
            edad = sc.nextInt();
        System.out.println("Ingrese el nombre de la universidad: ");
            nombreU = sc.next();
        System.out.println("Ingrese la cantidad de unidades de su producto");
            cantidad = sc.nextInt();
        System.out.println("Ingrese el precio unitario del producto: ");
            producto = sc.nextDouble();
        calculo=cantidad*producto;
        descuento=calculo*0.10;
        total=calculo-descuento;
        System.out.println("Ingrese el dinero: ");
        dinero = sc.nextDouble();
        if (dinero > total) {
            cambio = dinero-total;
            mensajePago = "El cambio es: " + cambio;
        }else if(dinero==total){
            mensajePago = "No hay cambio.";
        }else{
            mensajePago = "No hay dinero suficiente. Trabaje duro y gane más dinero.";
        }
        System.out.println("- - - Datos Personales - - -");
        System.out.println("Nombre: "+nombre);
        System.out.println("Edad: "+edad);
        System.out.println("Universidad: "+nombreU);
        System.out.println("- - - Datos de la Compra - - -");
        System.out.println("Cantidad: "+cantidad);
        System.out.println("Precio unitario: "+producto);
        System.out.println("Subtotal: "+calculo);
        System.out.println("Total: "+total);
        System.out.println("Dinero recibido: "+dinero);
        System.out.println("Descuento: "+descuento);
        System.out.println("Cambio: "+cambio);  
        System.out.println(mensajePago);
        sc.close();
    }
}

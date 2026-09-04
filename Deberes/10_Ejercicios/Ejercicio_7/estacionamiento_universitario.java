import java.util.Scanner;


public class EstacionamientoUniversitario {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int opcion;
        int horas, boletoPerdido;
        int tipoVehiculo, rol;
        double tarifa, recaudacion = 0.0;


        do {
            System.out.println("\n----- MENÚ -----");
            System.out.println("1. Calcular tarifa");
            System.out.println("2. Ver tarifas");
            System.out.println("3. Mostrar recaudación");
            System.out.println("4. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();


            switch (opcion) {
                case 1:
                    System.out.println("\nSeleccione tipo de vehículo:");
                    System.out.println("1. Motocicleta ($0.50/h)");
                    System.out.println("2. Automóvil ($1.00/h)");
                    System.out.println("3. Camioneta ($1.50/h)");
                    System.out.print("Opción: ");
                    tipoVehiculo = scanner.nextInt();


                    System.out.println("\nIngrese rol:");
                    System.out.println("1. Estudiante (20% descuento)");
                    System.out.println("2. Docente (10% descuento)");
                    System.out.println("3. Otro (sin descuento)");
                    System.out.print("Opción: ");
                    rol = scanner.nextInt();


                    System.out.print("\nIngrese horas de estacionamiento (1-24): ");
                    horas = scanner.nextInt();


                    // Validación del rango de horas (1 a 24)
                    if (horas < 1 || horas > 24) {
                        System.out.println("Error: número de horas inválido.");
                    } else {
                        System.out.print("¿Boleto perdido? (1=Sí, 0=No): ");
                        boletoPerdido = scanner.nextInt();


                        tarifa = 0.0;


                        // Calcular tarifa base según tipo de vehículo
                        switch (tipoVehiculo) {
                            case 1:
                                tarifa = horas * 0.50;
                                break;
                            case 2:
                                tarifa = horas * 1.00;
                                break;
                            case 3:
                                tarifa = horas * 1.50;
                                break;
                            default:
                                System.out.println("Tipo de vehículo inválido.");
                                break;
                        }


                        // Solo aplicar descuento y recargo si el tipo de vehículo es válido
                        if (tipoVehiculo >= 1 && tipoVehiculo <= 3) {
                            // Aplicar descuento según el rol
                            if (rol == 1) {
                                tarifa = tarifa * 0.80; // 20% de descuento
                            } else if (rol == 2) {
                                tarifa = tarifa * 0.90; // 10% de descuento
                            }


                            // Recargo por boleto perdido ($5)
                            if (boletoPerdido == 1) {
                                tarifa = tarifa + 5.0;
                            }


                            System.out.printf("Total a pagar: $%.2f\n", tarifa);
                            recaudacion += tarifa;
                        }
                    }
                    break;


                case 2:
                    System.out.println("\nTarifas por hora:");
                    System.out.println("Motocicleta: $0.50");
                    System.out.println("Automóvil:   $1.00");
                    System.out.println("Camioneta:   $1.50");
                    break;


                case 3:
                    System.out.printf("\nRecaudación total: $%.2f\n", recaudacion);
                    break;


                case 4:
                    System.out.println("\nSaliendo del sistema...");
                    break;


                default:
                    System.out.println("\nOpción inválida.");
                    break;
            }


        } while (opcion != 4);


        scanner.close();
    }
}


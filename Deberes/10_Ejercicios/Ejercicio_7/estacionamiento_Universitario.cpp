#include <iostream>
using namespace std;

int main() {
    int opcion, tipoVehiculo, rol, horas, boletoPerdido;
    double tarifa, recaudacion = 0;

    do {
        cout << "\n----- MENU -----\n";
        cout << "1. Calcular tarifa\n";
        cout << "2. Ver tarifas\n";
        cout << "3. Mostrar recaudacion\n";
        cout << "4. Salir\n";
        cout << "Seleccione una opcion: ";
        cin >> opcion;

        switch (opcion) {
            case 1:
                cout << "Seleccione tipo de vehiculo:\n";
                cout << "1. Motocicleta ($0.50/h)\n";
                cout << "2. Automovil ($1.00/h)\n";
                cout << "3. Camioneta ($1.50/h)\n";
                cin >> tipoVehiculo;

                cout << "Ingrese rol:\n";
                cout << "1. Estudiante (20% descuento)\n";
                cout << "2. Docente (10% descuento)\n";
                cout << "3. Otro (sin descuento)\n";
                cin >> rol;

                cout << "Ingrese horas de estacionamiento (1-24): ";
                cin >> horas;

                if (horas < 1 || horas > 24) {
                    cout << "Error: numero de horas invalido.\n";
                } else {
                    cout << "¿Boleto perdido? (1=Si, 0=No): ";
                    cin >> boletoPerdido;

                    // Calcular tarifa base
                    switch (tipoVehiculo) {
                        case 1: tarifa = horas * 0.50; break;
                        case 2: tarifa = horas * 1.00; break;
                        case 3: tarifa = horas * 1.50; break;
                        default:
                            cout << "Tipo de vehiculo invalido.\n";
                            tarifa = 0;
                    }

                    // Aplicar descuento segun rol
                    if (rol == 1) {
                        tarifa *= 0.80; // 20% descuento
                    } else if (rol == 2) {
                        tarifa *= 0.90; // 10% descuento
                    }

                    // Recargo por boleto perdido
                    if (boletoPerdido == 1) {
                        tarifa += 5;
                    }

                    cout << "Total a pagar: $" << tarifa << endl;
                    recaudacion += tarifa;
                }
                break;

            case 2:
                cout << "Tarifas por hora:\n";
                cout << "Motocicleta: $0.50\n";
                cout << "Automovil: $1.00\n";
                cout << "Camioneta: $1.50\n";
                break;

            case 3:
                cout << "Recaudacion total: $" << recaudacion << endl;
                break;

            case 4:
                cout << "Saliendo del sistema...\n";
                break;

            default:
                cout << "Opcion invalida.\n";
        }
    } while (opcion != 4);

    return 0;
}

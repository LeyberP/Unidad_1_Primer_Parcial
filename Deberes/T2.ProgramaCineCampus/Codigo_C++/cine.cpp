#include <iostream>
#include <string>

using namespace std;

int main() {
    cout << "- - - - - CINE CAMPUS - - - - -\n";
    cout << "1. Comprar entradas\n";
    cout << "2. Consultar precios\n";
    cout << "3. Salir\n";
    cout << "Elija una opcion: ";
    
    int opcion;
    cin >> opcion;

    switch (opcion) {
        case 1: {
            
            cout << "Formato (1=2D, 2=3D, 3=IMAX): ";
            int formato;
            cin >> formato;
            
            double precio = 0;
            switch (formato) {
                case 1:
                    precio = 5.00;
                    break;
                case 2:
                    precio = 7.50;
                    break;
                case 3:
                    precio = 10.00;
                    break;
                default:
                    cout << "Formato invalido.\n";
                    return 0;
            }

            cout << "Cantidad de entradas: ";
            int cantidad;
            cin >> cantidad;
            if (cantidad <= 0) {
                cout << "Cantidad invalida.\n";
                return 0;
            }

            
            cout << "Edad: ";
            int edad;
            cin >> edad;
            if (edad < 0 || edad > 120) {
                cout << "Edad fuera del rango (0 a 120).\n";
                return 0;
            }

            cout << "Es estudiante (1=Si, 2=No): ";
            int est;
            cin >> est;

            cout << "Dia de la semana (1=Lunes ... 7=Domingo): ";
            int dia;
            cin >> dia;
            if (dia < 1 || dia > 7) {
                cout << "Dia invalido.\n";
                return 0;
            }

            double subtotal = precio * cantidad;

            
            double porcentaje = 0;
            string promo = "Ninguna";

            if (edad >= 65) {
                porcentaje = 0.30;
                promo = "30% por adulto mayor";
            } else if (edad <= 11) {
                porcentaje = 0.20;
                promo = "20% por niño";
            } else if (est == 1 && dia >= 1 && dia <= 5) {
                porcentaje = 0.15;
                promo = "15% estudiante entre semana";
            } else if (dia == 3) {
                porcentaje = 0.10;
                promo = "10% miercoles";
            }

            double descuento = subtotal * porcentaje;

            
            double recargo = 0;
            if ((dia == 6 || dia == 7) && formato == 3) {
                recargo = subtotal * 0.10;
            }

            double total = subtotal - descuento + recargo;

            
            string combo = "No";
            if (cantidad >= 4 && (est == 1 || edad <= 11)) {
                combo = "Si";
            }

            cout << "\n----- Factura -----\n";
            cout << "Precio unitario: " << precio << "\n";
            cout << "Subtotal: " << subtotal << "\n";
            cout << "Promocion: " << promo << "\n";
            cout << "Descuento: " << descuento << "\n";
            cout << "Recargo: " << recargo << "\n";
            cout << "Combo de cortesia: " << combo << "\n";
            cout << "TOTAL A PAGAR: " << total << "\n";
            break;
        }

        case 2:
            cout << "\nPRECIOS:\n";
            cout << "2D   = 5.00\n";
            cout << "3D   = 7.50\n";
            cout << "IMAX = 10.00\n";
            break;

        case 3:
            cout << "Gracias por su visita.\n";
            break;

        default:
            cout << "Opcion invalida.\n";
    }

    return 0;
}
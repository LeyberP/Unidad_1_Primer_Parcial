#include <iostream>

using namespace std;

int main() {
    int opcion;
    int contador = 0;
    double salario, acumulador = 0, mayor = 0, menor = 0, promedio = 0;

    do {
        cout << "\n===== SISTEMA DE SALARIOS =====" << endl;
        cout << "1. Registrar salarios" << endl;
        cout << "2. Mostrar resumen" << endl;
        cout << "3. Comparar un salario con el promedio" << endl;
        cout << "4. Reiniciar informacion" << endl;
        cout << "0. Salir" << endl;
        cout << "Elija una opcion: ";
        cin >> opcion;

        switch (opcion) {
            case 1:
                cout << "Ingrese salarios (negativo para terminar):" << endl;
                cin >> salario;
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
                    cin >> salario;
                }
                break;

            case 2:
                if (contador > 0) {
                    promedio = acumulador / contador;
                    cout << "--- Resumen de salarios ---" << endl;
                    cout << "Promedio: " << promedio << endl;
                    cout << "Mayor: " << mayor << endl;
                    cout << "Menor: " << menor << endl;
                } else {
                    cout << "No hay salarios registrados." << endl;
                }
                break;

            case 3:
                if (contador > 0) {
                    promedio = acumulador / contador;
                    cout << "Ingrese salario a comparar: ";
                    cin >> salario;
                    
                    if (salario > promedio) {
                        cout << "El salario es mayor al promedio." << endl;
                    } else if (salario == promedio) {
                        cout << "El salario es igual al promedio." << endl;
                    } else {
                        cout << "El salario es menor al promedio." << endl;
                    }
                } else {
                    cout << "No hay salarios registrados." << endl;
                }
                break;

            case 4:
                contador = 0;
                acumulador = 0;
                mayor = 0;
                menor = 0;
                promedio = 0;
                cout << "Informacion reiniciada." << endl;
                break;

            case 0:
                cout << "Saliendo del sistema..." << endl;
                break;

            default:
                cout << "Opcion invalida." << endl;
                break;
        }
    } while (opcion != 0);

    return 0;
}

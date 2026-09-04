#include <iostream>
#include <limits>
using namespace std;

int main() {
    int temp, suma = 0, contador = 0;
    int frio = 0, templado = 0, calido = 0, muyCalido = 0;
    int mayor = numeric_limits<int>::min();
    int menor = numeric_limits<int>::max();

    cout << "Ingrese temperaturas (999 para terminar):" << endl;
    cin >> temp;

    while (temp != 999) {
        if (temp < -50 || temp > 60) {
            cout << "Dato inválido. Solo entre -50 y 60." << endl;
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
        cin >> temp;
    }

    if (contador > 0) {
        double promedio = (double) suma / contador;
        cout << "Cantidad de datos: " << contador << endl;
        cout << "Mayor: " << mayor << endl;
        cout << "Menor: " << menor << endl;
        cout << "Promedio: " << promedio << endl;
        cout << "Fríos: " << frio << endl;
        cout << "Templados: " << templado << endl;
        cout << "Cálidos: " << calido << endl;
        cout << "Muy cálidos: " << muyCalido << endl;
    } else {
        cout << "No se ingresaron temperaturas válidas." << endl;
    }

    return 0;
}

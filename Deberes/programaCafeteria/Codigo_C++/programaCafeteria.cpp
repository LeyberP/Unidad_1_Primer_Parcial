#include <iostream>
#include <string>
using namespace std;

int main() {
    int cantidad, edad;
    string nombre, nombreU, mensajePago = "";
    double calculo, producto, descuento, total, dinero, cambio = 0;

    cout << "Ingrese su nombre: ";
    cin >> nombre;

    cout << "Ingrese su edad: ";
    cin >> edad;

    cout << "Ingrese el nombre de la universidad: ";
    cin >> nombreU;

    cout << "Ingrese la cantidad de unidades de su producto: ";
    cin >> cantidad;

    cout << "Ingrese el precio unitario del producto: ";
    cin >> producto;

    calculo = cantidad * producto;
    descuento = calculo * 0.10;
    total = calculo - descuento;

    cout << "Ingrese el dinero: ";
    cin >> dinero;

    if (dinero > total) {
        cambio = dinero - total;
        mensajePago = "El cambio es: " + to_string(cambio);
    } else if (dinero == total) {
        mensajePago = "No hay cambio.";
    } else {
        mensajePago = "No hay dinero suficiente. Trabaje duro y gane más dinero.";
    }

    cout << "- - - Datos Personales - - -" << endl;
    cout << "Nombre: " << nombre << endl;
    cout << "Edad: " << edad << endl;
    cout << "Universidad: " << nombreU << endl;

    cout << "- - - Datos de la Compra - - -" << endl;
    cout << "Cantidad: " << cantidad << endl;
    cout << "Precio unitario: " << producto << endl;
    cout << "Subtotal: " << calculo << endl;
    cout << "Descuento: " << descuento << endl;
    cout << "Total: " << total << endl;
    cout << "Dinero recibido: " << dinero << endl;
    cout << "Cambio: " << cambio << endl;
    cout << mensajePago << endl;

    return 0;
}

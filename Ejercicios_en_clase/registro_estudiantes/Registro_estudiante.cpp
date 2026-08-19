#include <iostream>
#include <string>
#include <bitset>

using namespace std;

int main() {
    int Edad;
    string Nombre;
    float nota1, nota2, nota3, promedio;

    cout << "Ingrese su nombre" << endl;
    getline(cin, Nombre); 

    cout << "Ingrese su edad" << endl;
    cin >> Edad;

    cout << "Ingrese su primera nota" << endl;
    cin >> nota1;
    cout << "Ingrese su segunda nota" << endl;
    cin >> nota2;
    cout << "Ingrese su tercera nota" << endl;
    cin >> nota3;

    promedio = (nota1 + nota2 + nota3) / 3;

    cout << "Su nombre es: " << Nombre << endl;
    cout << "Su edad decimal es: " << Edad << endl;

    string edadBinario = bitset<8>(Edad).to_string();
    cout << "Su edad binaria es: " << edadBinario << endl;

    cout << "Su edad hexadecimal es: ";
    cout << hex << Edad << dec << endl;

    cout << "Su promedio es: " << promedio << endl;

    return 0;
}
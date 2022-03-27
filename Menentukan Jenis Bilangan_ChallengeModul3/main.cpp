#include <iostream>

using namespace std;

int main()
{
    string jenis = "";
    int angka;
    do {
        cout << "Masukkan angka : ";
        cin >> angka;
        if (angka % 2 == 0) {
            jenis = "Genap";
            cout << "Merupakan bilangan genap" << endl;
        } else {
            jenis = "Ganjil";
            cout << "Merupakan bilangan ganjil" << endl;
        }
    } while (jenis != "Genap");
}

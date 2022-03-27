#include <iostream>

using namespace std;

int main()
{
    double nilai;
    cout << "Masukkan nilai : ";
    cin >> nilai;
    if (nilai >= 80 && nilai <= 100) {
        cout << "Grade : A" << endl;
    } else if (nilai >= 60 && nilai <=79) {
        cout << "Grade : B" << endl;
    } else if (nilai >= 40 && nilai <= 59) {
        cout << "Grade : C" << endl;
    } else if (nilai >= 20 && nilai <= 39) {
        cout << "Grade : D" << endl;
    } else {
        cout << "Grade : E" << endl;
    }
    return 0;
}

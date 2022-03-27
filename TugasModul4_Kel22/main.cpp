#include <iostream>
#include "pembelianPulsa.cpp"

using namespace std;

void login(string username, string password){
    cout << "==== Selamat Datang Di Program Pembayaran Pulsa ====" << endl;
    cout << "Username : " << username << endl;
    cout << "Password : " << password << endl;
    while (username != "prakdkp" && password != "kelompok22") {
        cout << "GAGAL MASUK!" << endl;
        exit(0);
    }
    if (username == "prakdkp" && password == "kelompok22") {
        cout << "BERHASIL MASUK!" << endl;
        cout << "\n==== Informasi Saldo ====" << endl;
        cout << "Saldo : Rp100000" << endl;
    }
}

void batal() {
    exit(0);
}

int kembali(string gantinoHp) {
    if (gantinoHp == "yes") {
        cout << "Masukkan Nomor Handphone : ";
        string noHp2;
        cin >> noHp2;
        pembelianPulsa gantiNomor;
        gantiNomor.noHp(noHp2);
    } else {
        pembelianPulsa tidakGanti;
        tidakGanti.noHp("081236134692");
    }
    return 0;
}

int main()
{
    int pilihan;
    login("prakdkp", "kelompok22");
    pembelianPulsa beliPulsa;
    beliPulsa.noHp("081236134692");
    cout << "\n1. Ganti nomor" << endl;
    cout << "2. Batal membeli pulsa" << endl;
    cout << "3. Lanjutkan pembelian" << endl;
    cout << "Konfirmasi Nomor Hp: ";
    cin >> pilihan;
    while (pilihan < 1 || pilihan > 3) {
        cout << "Nomor yang Anda pilih tidak sesuai. Silakan ketik nomor antara 1-3!" << endl;
        cout << "Konfirmasi : ";
        cin >> pilihan;
    }
    if (pilihan >= 1 && pilihan <= 3) {
        if (pilihan == 1) {
            kembali("yes");
            beliPulsa.pilihanPulsa();
            beliPulsa.konfirmasiPembelian();
        } else if (pilihan == 2){
            batal();
        } else {
            beliPulsa.pilihanPulsa();
            beliPulsa.konfirmasiPembelian();
        }
    }
    return 0;
}

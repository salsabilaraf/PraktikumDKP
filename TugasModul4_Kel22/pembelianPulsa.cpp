#include <iostream>
#include <string>
using namespace std;

class pembelianPulsa {
    int nominal;
    string nomorHp;
public:
    void noHp(string nomorHp) {
        cout << "\n==== Pemasukan Nomor Handphone ====" << endl;
        cout << "Nomor Handphone : " << nomorHp << endl;
    }

    int pilihanPulsa() {
        cout << "\n===== Pemilihan Nominal Pulsa =====" << endl;
        int i, pilihan;
        cout << "Pilihan Nominal Pulsa : " << endl;
        int pil[2][8] = {{1,2,3,4,5,6,7,8}, {15000, 20000, 25000, 30000, 40000, 50000, 75000, 100000}};
        for (i=1;i<=8;i++) {
            cout << pil[0][i-1] << ". Rp" << pil[1][i-1] << endl;
        }
        cout << "9. lainnya" << endl;
        cout << "Ketik nomor pilihan pulsa yang diinginkan : ";
        cin >> pilihan;
        while (pilihan > 9 || pilihan < 1) {
            cout << "Anda memilih nomor " << pilihan << ". Nomor tersebut tidak terdapat dalam pilihan. Silakan coba lagi" << endl;
            cout << "Ketik nomor pilihan pulsa yang diinginkan : ";
            cin >> pilihan;
        }
        if (pilihan >= 1 && pilihan <= 9) {
            if (pilihan >= 1 && pilihan <=8) {
                nominal = pil[1][pilihan-1];
            } else {
                cout << "Masukkan nominal yang Anda inginkan : ";
                cin >> nominal;
                while (nominal > 98500 || nominal < 5000) {
                    cout << "Saldo Anda tidak mencukupi/sesuai. Silakan ulangi dengan rentang nominal Rp5000 - Rp98500" << endl;
                    cout << "Masukkan nominal yang Anda inginkan : ";
                    cin >> nominal;
                }
            }
        }
        return nominal;
    }

    //int argumen

    void konfirmasiPembelian(){
        int konfirmasi;
        int saldo = 100000;
        cout << "\n===== Konfirmasi Pembelian Pulsa =====" << endl;
        cout << "Nominal : " << nominal << endl;;
        cout << "Biaya transaksi : Rp1500" << endl;
        int totalHarga = nominal + 1500;
        cout << "Total pembayaran : " << totalHarga << endl;
        cout << "Saldo : " << saldo << endl;
        string pilihan[2][2] = {{"1", "2"}, {"Lanjutkan Pembayaran", "Batal"}};
        for (int i = 1; i<=2; i++) {
            cout << pilihan[0][i-1] << ". " << pilihan[1][i-1] << endl;
        }
        cout << "Konfirmasi : ";
        cin >> konfirmasi;
        while (konfirmasi > 2 || konfirmasi < 1) {
            cout << "Tidak ada pilihan nomor " << konfirmasi << ". Silakan pilih nomor 1 atau 2" << endl;
            cout << "Konfirmasi : " << endl;
            cin >> konfirmasi;
        }
        if (konfirmasi >= 1 && konfirmasi <=2) {
            if (konfirmasi == 1) {
                saldo = saldo - totalHarga;
                cout << "\nPEMBAYARAN BERHASIL!!" << endl;
                cout << "Saldo Anda saat ini : Rp" << saldo << endl;
            } else {
                exit(0);
            }
        }
    }

};



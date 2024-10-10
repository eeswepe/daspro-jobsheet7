import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double hargaTiket = 50000, totalHarga = 0, diskon = 0.0, penjualan;
        int totalTiket = 0, tiket;

        System.out.println("=========================================================");
        System.out.println("====Program Penghitungan Tiket dan Pendapatan Bioskop====");
        System.out.println("=========================================================");

        do {
            System.out.print("Masukkan jumlah tiket (ketik 0 untuk keluar): ");
            tiket = sc.nextInt();

            if (tiket == 0) {
                System.out.println("=========================================================");
                System.out.println("==============Penghitungan tiket dihentikan.=============");
                break;
            }

            if (tiket < 0) {
                System.out.println("Tiket tidak valid. Masukkan lagi tiket yang valid");
                continue;
            }

            if (tiket > 10) {
                System.out.println("Anda mendapat diskon 15%");
                diskon = 0.15;
            } else if (tiket > 4) {
                System.out.println("Anda mendapat diskon 10%");
                diskon = 0.10;
            } else {
                System.out.println("Anda tidak mendapatkan diskon");
                diskon = 0.0;
            }

            penjualan = tiket * hargaTiket * (1 - diskon);
            System.out.println("Penjualan tiket kali ini: Rp " + penjualan);
            System.out.println("=========================================================");


            totalTiket += tiket;
            totalHarga += penjualan;

        } while (true);
        System.out.println("=========================================================");
        System.out.println("Total tiket terjual: " + totalTiket);
        System.out.println("Total pendapatan: Rp " + totalHarga);
        System.out.println("=========================================================");

    }
}

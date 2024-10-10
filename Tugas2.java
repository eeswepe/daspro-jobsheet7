import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jenis, durasi, total = 0;
        
        System.out.println("================================================================");
        System.out.println("========Program Penghitungan Biaya Parkir dan Pendapatan========");

        do{
            System.out.println("================================================================");
            System.out.print("Masukkan jenis kendaraan (1 = mobil, 2 = motor, 0 = keluar): ");
            jenis = sc.nextInt();
            if((jenis == 1) || (jenis == 2)){
                System.out.print("Masukkan durasi Parkir (Jam): ");
                durasi = sc.nextInt();
                if(durasi > 5){
                    total += 12500;
                    System.out.println("Total yang harus dibayar kendaraan ini: Rp " + 12500);
                }else if(durasi>0 && durasi<=5){
                    if(jenis == 1){
                        total += durasi * 3000;
                        System.out.println("Total yang harus dibayar kendaraan ini: Rp " + (durasi * 3000));
                    }else if(jenis == 2){
                        total += durasi * 2000;
                        System.out.println("Total yang harus dibayar kendaraan ini: Rp " + (durasi * 2000));
                    }else{
                        System.out.println("Jenis kendaraan tidak valid. Inputkan kembali nilai yang valid");
                        continue;
                    }
                }else{
                    System.out.println("Durasi parkir tidak valid. Inputkan kembali durasi yang valid");
                    continue;
                }
            }else if(jenis == 0){
                System.out.println("================================================================");
                System.out.println("Program penghitungan diakhiri");
                System.out.println("================================================================");
                break;
            }else{
                System.out.println("================================================================");
                System.out.println("Jenis kendaraan tidak valid. Inputkan kembali nilai yang valid");
                continue;
            }
        }while(jenis != 0);
        System.out.println("===============Total pendapatan: Rp " + total + "===============");
        System.out.println("================================================================");
    }
}

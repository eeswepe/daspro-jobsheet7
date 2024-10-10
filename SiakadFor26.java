import java.util.Scanner;

public class SiakadFor26{
    public static void main(String[] args) {
        double nilai, tertinggi=0, terendah = 100;
        int mshLulus = 0, mhsTidakLulus = 0;
        Scanner sc = new Scanner(System.in);

        for(int i=1;i<=10;i++){
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
            nilai = sc.nextDouble();
            if(tertinggi < nilai){
                tertinggi = nilai;
            }
            if(terendah > nilai){
                terendah = nilai;
            }
            if(nilai >= 60){
                mshLulus++;
            }else{
                mhsTidakLulus++;
            }
        }

        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);

        System.out.println("Jumlah mahasiswa yang lulus: " + mshLulus);
        System.out.println("Jumlah mahasiswa yang tidak lulus: " + mhsTidakLulus);
    }
}
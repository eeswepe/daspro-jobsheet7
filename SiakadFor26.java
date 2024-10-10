import java.util.Scanner;

public class SiakadFor26 {
    public static void main(String[] args) {
        double nilai, tertinggi=0, terendah = 100;
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
        }

        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
    }
}
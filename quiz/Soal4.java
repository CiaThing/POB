package quiz;
import java.util.Scanner;

public class Soal4 {
    private double nilai_akhir; // variabel nilai akhir
    private String nilai_huruf; // variabel nilai huruf
    public Soal4(){ // membuat class construction
        Scanner sc = new Scanner(System.in);
        System.out.print(" Masukkan total nilai = ");
        nilai_akhir = sc.nextDouble(); // input total nilai
        System.out.println("Hasil:");
        if (nilai_akhir >= 0 && nilai_akhir <= 39.99){
            nilai_huruf = "E";
        }
        else if (nilai_akhir >= 40 && nilai_akhir <= 49.99){
            nilai_huruf = "D";
        }
        else if (nilai_akhir >= 50 && nilai_akhir <= 54.99){
            nilai_huruf = "C-";
        }
        else if (nilai_akhir >= 55 && nilai_akhir <= 59.99){
            nilai_huruf = "C";
        }
        else if (nilai_akhir >= 60 && nilai_akhir <= 64.99){
            nilai_huruf = "C+";
        }
        else if (nilai_akhir >= 65 && nilai_akhir <= 69.99){
            nilai_huruf = "B-";
        }
        else if (nilai_akhir >= 70 && nilai_akhir <= 74.99){
            nilai_huruf = "B";
        }
        else if (nilai_akhir >= 75 && nilai_akhir <= 79.99){
            nilai_huruf = "B+";
        }
        else if (nilai_akhir >= 80 && nilai_akhir <= 89.99){
            nilai_huruf = "A-";
        }
        else if (nilai_akhir >= 90 && nilai_akhir <= 99.99){
            nilai_huruf = "A";
        }
    }

    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        Soal4 grade = new Soal4(); // membuat objek " grade " untuk memanggil class constructor Soal4
        //System.out.print("Masukkan total nilai = ");
        //grade.nilai_akhir = sc.nextDouble();
        //System.out.println("Hasil:");
        System.out.println(" Nilai angka = " + grade.nilai_akhir);
        System.out.println(" Nilai huruf = " + grade.nilai_huruf);
    }
}

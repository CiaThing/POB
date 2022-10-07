package quiz;
import java.util.Scanner;
public class Soal1 {
    // Membuat app OOP untuk menghitung luas segitiga, di mana nilai alas dan tinggi diinput melalui keyboard
    private double alas;
    private double tinggi;
    private double luas;

    public double getAlas() {
        return alas;
    }
    public void setAlas(double alas) {
        this.alas = alas;
    }
    public double getTinggi() {
        return tinggi;
    }
    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
    public Soal1 (){
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan alas segitiga = "); // input alas segitiga
        alas = sc.nextDouble();
        System.out.print("Masukkan tinggi segitiga = "); // input tinggi segitiga
        tinggi = sc.nextDouble();
    }
    public final double luas() {
        return 0.5 * alas * tinggi; // fungsi luas
    }

    public static void main(String[] args) {
        Soal1 luas_segitiga = new Soal1(); // membuat objek " luas_segitiga " dari class Soal1
        System.out.println("Luas segitiga adalah = " + luas_segitiga.luas()); // tampilan luas
    }
}

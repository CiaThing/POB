import java.util.Scanner;
    class luas_lingkaran {
        double jari_jari;
        double pi = 3.14;

        public double luas_lingkaran(){
            return pi * jari_jari * jari_jari;
        }
    }
    class luas_segitiga {
        double alas;
        double tinggi;

        double luas_segitiga(){
            return alas * tinggi /2;
        }
    }
    public class UTSNo4{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            luas_lingkaran L_Lingkaran = new luas_lingkaran();

            System.out.print("Masukkan jari-jari lingkaran : ");
            L_Lingkaran.jari_jari = sc.nextDouble();

            System.out.println("Luas lingkaran adalah : " + L_Lingkaran.luas_lingkaran());

            luas_segitiga L_Segitiga = new luas_segitiga();

            System.out.print("Masukkan alas segitiga : ");
            L_Segitiga.alas = sc.nextDouble();

            System.out.print("Masukkan tinggi segitiga : ");
            L_Segitiga.tinggi = sc.nextDouble();

            System.out.println("Luas segitiga adalah : " + L_Segitiga.luas_segitiga());

        }
    }

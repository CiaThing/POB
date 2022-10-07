package quiz;

import java.util.Random;
import java.util.Scanner;

public class Tugas2Pert3 {
    import java.util.Scanner;
import java.util.Random;
    public class TugasPert2No3 {
        public static void main(String[] args){
            char[] jari = {'j', 't', 'k'};
            Scanner sc = new Scanner(System.in);
            char pilihanPemain;
            char pilihanKomputer;
            String pilihanLanjut;
            boolean lanjut, pilihanValid;

            while (true) {
                pilihanKomputer = jari[new Random().nextInt(jari.length)];
                while (true) {
                    System.out.print("Masukan pilihan Anda: ");
                    pilihanPemain = sc.nextLine().charAt(0);

                    if (pilihanPemain == 'j' || pilihanPemain == 't' || pilihanPemain == 'k') {
                        break;
                    } else {
                        System.out.println("Masukan tidak valid");
                    }
                }

                System.out.println("Komputer memilih: " + pilihanKomputer);
                if (pilihanPemain == 'j') {
                    if (pilihanKomputer == 't') {
                        System.out.println("Anda menang!\n");
                        break;
                    } else if (pilihanKomputer == 'k') {
                        System.out.println("Anda kalah!\n");
                    }
                } else if (pilihanPemain == 't') {
                    if (pilihanKomputer == 'k') {
                        System.out.println("Anda menang!\n");
                        break;
                    } else if (pilihanKomputer == 'j') {
                        System.out.println("Anda menang!\n");
                        break;
                    }
                } else if (pilihanKomputer == 'k') {
                    if (pilihanKomputer == 'j') {
                        System.out.println("Anda menang!\n");
                        break;
                    } else if (pilihanKomputer == 't') {
                        System.out.println("Anda kalah!\n");
                    }
                }

                if (pilihanPemain == pilihanKomputer) {
                    System.out.println("Seri!\n");
                }
                do {
                    System.out.print("\nMain lagi? [y/t] : ");
                    pilihanLanjut = sc.nextLine().toLowerCase();
                    if (pilihanLanjut.equals("y")){
                        lanjut = true;
                        pilihanValid = true;
                    } else if (pilihanLanjut.equals("t")){
                        lanjut = false;
                        pilihanValid = true;
                    } else {
                        lanjut = true;
                        pilihanValid = false;
                        System.out.println("Masukkan tidak valid. Harap input ulang.\n");
                    }
                } while (!pilihanValid);
            } while (lanjut);
        }
    }

}

package quiz;

import java.util.*;

public class TugasPert2No3 {
    public static void main(String[] args) {
        char[] jtk = {'j', 't', 'k'};
        Scanner input = new Scanner(System.in);
        char pilihanPemain;
        char pilihanKomputer;

        while (true) {
            pilihanKomputer = jtk[new Random().nextInt(jtk.length)];
            while (true) {
                System.out.print("Masukan pilihan Anda: ");
                pilihanPemain = input.nextLine().charAt(0);

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
        }
    }
}


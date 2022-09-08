import java.util.Scanner;
public class Tugas1 {
    public static void main(String[] args) {
        String nama, nim, kodeprodi, angkatan, prodi = "", nilaiHuruf = "";

        double nilaiUAS, nilaiUTS, nilaiPresensi, nilaiTugas, nilaiAkhir;

        Scanner sc = new Scanner(System.in);

        System.out.print("NIM : ");
        nim = sc.nextLine();

        System.out.print("Nama : ");
        nama = sc.nextLine();

        System.out.print("Nilai Presensi : ");
        nilaiPresensi = sc.nextDouble();

        System.out.print("Nilai Tugas : ");
        nilaiTugas = sc.nextDouble();

        System.out.print("Nilai UTS : ");
        nilaiUTS = sc.nextDouble();

        System.out.print("Nilai Tugas : ");
        nilaiUAS = sc.nextDouble();

        kodeprodi = nim.substring(4,7);
        angkatan = nim.substring(0,4);

        if (kodeprodi.equals("071")){
            prodi = "Informatika";
        } else if (angkatan.equals("2021")) {
            angkatan = "2021";
        } else {
            System.out.println("Maaf nim anda tidak ada");
        }



        System.out.println("------------------------ ");
        System.out.println("Nilai Mata Kuliah PBO : ");
        System.out.println("------------------------ ");

        System.out.println("NIM : " + nim);
        System.out.println("Nama : " + nama);
        System.out.println("Jurusan : " + prodi);
        System.out.println("Angkatan : " + angkatan);
        System.out.println(" ");

        nilaiAkhir = (0.1 * nilaiPresensi) + (0.2 * nilaiTugas) + (0.3 * nilaiUTS) + (0.4 * nilaiUAS);
        if (nilaiAkhir >=80){
            nilaiHuruf = "A";
        }else if (nilaiAkhir >=70){
            nilaiHuruf = "B";
        }else if (nilaiAkhir >=60){
            nilaiHuruf = "C";
        }else if (nilaiAkhir >=50){
            nilaiHuruf = "D";
        }else{
            nilaiHuruf ="E";
        }

        System.out.println("Nilai Presensi : " + nilaiPresensi);
        System.out.println("Nilai Tugas : " + nilaiTugas);
        System.out.println("Nilai UTS : " + nilaiUTS);
        System.out.println("Nilai UAS : " + nilaiUAS);
        System.out.println("Nilai Akhir : " + nilaiAkhir);
        System.out.println("Grade : " +nilaiHuruf);



    }
}




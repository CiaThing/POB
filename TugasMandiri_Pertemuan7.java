import java.util.Scanner;
class golongan_karyawan { // membuat class golongan_karyawann
    private byte golongan; // variabel golongan menggunakan tipe data byte karena hanya menggunakan angka 1-4
    private long gaji; // variabel gaji menggunakan tipe data long
    private long tunjangan; // variabel gaji menggunakan tipe data long

    public void setGolongan(byte golongan) {
        this.golongan = golongan;
    }
    public byte getGolongan() {
        return golongan;
    }
    public long getGaji() {
        return gaji;
    }
    public long getTunjangan() {
        return tunjangan;
    }
    public void setTunjangan(long tunjangan) {
        this.tunjangan = tunjangan;
    }

    public void setGaji (long gaji ) {
        this.gaji = gaji;
    }
}
class hitung_jam_lembur{ // membuat class hitung_jam_lembur
    private short jam_kerja; // variabel jam_kerja menggunakan tipe data short karena angka yang
    // dipakai lebih dari 173, sedangkan tipe data byte hanya bisa angka 127 sebagai batas maksimum
    public void setJam_kerja(short jam_kerja){
        this.jam_kerja = jam_kerja;
    }
    public long uang_lembur(){
        return (jam_kerja - 173) * 20000; // membuat fungsi untuk memghitung penghasilan karyawan dalam lembur
    }
}

public class TugasMandiri_Pertemuan7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        golongan_karyawan golongan = new golongan_karyawan(); // saya membuat objek golongan untuk memanggil
        // class golongan karyawan
        System.out.print("Masukkan golongan = ");
        golongan.setGolongan(sc.nextByte()); // input angka golongan

        if ( golongan.getGolongan() == 1 ){ // membuat kondisi jika golongan karyawan 1
            golongan.setGaji(1486500);
            golongan.setTunjangan(250000);
        }
        else if ( golongan.getGolongan() == 2 ) { // membuat kondisi jika golongan karyawan 2
            golongan.setGaji(1926000);
            golongan.setTunjangan(300000);
        }
        else if ( golongan.getGolongan() == 3 ){ // membuat kondisi jika golongan karyawan 3
            golongan.setGaji(2456700);
            golongan.setTunjangan(350000);
        }
        else if ( golongan.getGolongan() == 4) { // membuat kondisi jika golongan karyawan 4
            golongan.setGaji(2899500);
            golongan.setTunjangan(400000);
        }
        else {
            System.out.println("Masukkan golongan yang benar, silahkan coba kembali");
        }
        System.out.println("Gaji anda sebesar = " + golongan.getGaji());
        System.out.println("Tunjangan anda sebesar = " + golongan.getTunjangan());
        hitung_jam_lembur jam_lembur = new hitung_jam_lembur(); // membuat objek jam_lembur untuk memanggil
        // class hitung_jam_lembur
        System.out.print("Masukkan berapa jam kerja anda selama sebulan = ");
        jam_lembur.setJam_kerja(sc.nextShort()); // input jam kerja karyawan
        System.out.println("Maka, uang lembur anda = " + jam_lembur.uang_lembur());

        long total_uang;
        double pajak, total_pendapatan;
        // di bawah adalah fungsi untuk menghitung total uang yang didapat dari karyawan selama sebulah
        total_uang = golongan.getGaji() + golongan.getTunjangan() + jam_lembur.uang_lembur();
        // di bawah adalah fungsi untuk menghitung pajak
        pajak = total_uang * 0.005;
        // di bawah adalah fungsi untuk menghitung pendapatan bersih karyawan selama sebulan
        total_pendapatan = total_uang - pajak;
        System.out.println("Total pendapatan anda dalam sebulan adalah = " + total_pendapatan);
    }
}

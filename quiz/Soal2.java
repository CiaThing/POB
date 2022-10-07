package quiz;
import java.util.Scanner;
public class Soal2 {
    /* Membuat app OOP untuk menghitung perkiraan biaya percakapan melalui phonecell
   Di mana waktu awal dan akhir percakapan (hh:mm:ss) diinput dari keyboard
   Keluaran dari app ini adalah lama dan biaya percakapan
   Satu pulsa = 5 detik dan biaya per pulsa adalah Rp 150
    */
    private int jam;
    private int menit;
    private int detik;
    private double harga;

    public Soal2() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jam = ");
        jam = sc.nextInt();
        System.out.print("Masukkan menit = ");
        menit = sc.nextInt();
        System.out.print("Masukkan detik = ");
        detik = sc.nextInt();
    }
    public final double harga(){
        return (3600*jam + 60*menit + detik)*30;
        /* menggunakan harga per detik, di mana per detik seharga Rp 30
           1 jam ada 3600 detik, maka tinggal dikali 3600 dari input jam
           1 menit ada 60 detik, maka tinggal dikali 60 dari input menit
         */
    }

    public static void main(String[] args) {
        Soal2 biaya_pulsa = new Soal2(); // membuat objek " biaya_pulsa " untuk memanggil class constructor Soal2
        System.out.println("Waktu awal percakapan = (" + biaya_pulsa.jam + ":" + biaya_pulsa.menit + ":" + biaya_pulsa.detik+ ")");
        System.out.println("Biaya pulsa untuk percakapan terkahir anda = Rp." + biaya_pulsa.harga());
    }
}

import java.util.Scanner;
class waktu_awal_percakapan{
    byte jam_awal;
    byte menit_awal;
    byte detik_awal;

    public int total_detik(){
        return (jam_awal * 3600 + menit_awal * 60 + detik_awal);
    }
}
class waktu_akhir_percakapan{
    byte jam_akhir;
    byte menit_akhir;
    byte detik_akhir;

    public int total_detik(){
        return (jam_akhir * 3600 + menit_akhir * 60 + detik_akhir);
    }
}

public class UTSNo1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        waktu_awal_percakapan awal = new waktu_awal_percakapan();
        System.out.print("Masukkan jam pada awal percakapan : ");
        awal.jam_awal = sc.nextByte();
        System.out.print("Masukkan menit pada awal percakapan : ");
        awal.menit_awal = sc.nextByte();
        System.out.print("Masukkan detik pada awal percakapan : ");
        awal.detik_awal = sc.nextByte();
        System.out.println("Waktu awal percakapan : (" + awal.jam_awal + ":" + awal.menit_awal +
                ":" + awal.detik_awal + ")");

        waktu_akhir_percakapan akhir = new waktu_akhir_percakapan();

        System.out.print("Masukkan jam pada akhir percakapan : ");
        akhir.jam_akhir = sc.nextByte();
        System.out.print("Masukkan jam pada akhir percakapan : ");
        akhir.menit_akhir = sc.nextByte();
        System.out.print("Masukkan jam pada akhir percakapan : ");
        akhir.detik_akhir = sc.nextByte();
        System.out.println("Waktu akhir percakapan : (" + akhir.jam_akhir + ":" + akhir.menit_akhir +
                ":" + akhir.detik_akhir + ")");

        long harga_pulsa = ( akhir.total_detik() - awal.total_detik() ) * 30;
        System.out.println("Maka harga pulsa selama anda menelepon adalah : " + harga_pulsa);
    }
}
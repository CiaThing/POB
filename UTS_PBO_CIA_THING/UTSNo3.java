import java.util.Scanner;
public class UTSNo3 {
    private int jumlah;

    public UTSNo3() {
        Scanner sc = new Scanner(System.in);
        int[] bil_bulat = new int[10]; // variabel bil_bulat sebagai variabel array dalam loop
        jumlah = 0; // variabel untuk menjumlahkan 10 bilangan bulat, saya deklasari 0 agar variabel
        // jumlah ini saat ditambahkan dengan array bil_bulat hasilnya akan sama dengan jumlah array
        // bil bulat

        // masuk ke looping for, saya deklarasi i yaitu 0 karena untuk index ke-0 pada array bil_bulat
        // lalu saya bataskan i kurang dari panjang array bil_bulat sebagai pembatas agar i tidak
        // mengulang berlebiban.
        for (int i = 0; i < bil_bulat.length; i++) {
            System.out.print("Masukkan bilangan bulat : ");
            bil_bulat[i] = sc.nextInt(); // input bilangan bulat
            jumlah = jumlah + bil_bulat[i];
            // mencari nilai jumlah dari 10 nilai yang sudah diinput ke dalam array
        }
    }

    public static void main(String[] args) {
        UTSNo3 x = new UTSNo3();
        System.out.printf("\nJumlah dari array bil_bulat yang sudah diinput adalah : " + x.jumlah);
    }
}

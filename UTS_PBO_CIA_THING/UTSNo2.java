import java.util.Scanner;
public class UTSNo2 {
    private double tinggi_badan;
    private short berat_badan;

    public double getTinggi_badan() {
        return tinggi_badan;
    }
    public void setTinggi_badan(double tinggi_badan) {
        this.tinggi_badan = tinggi_badan;
    }
    public double getBerat_badan() {
        return berat_badan;
    }
    public void setBerat_badan(short berat_badan) {
        this.berat_badan = berat_badan;
    }

    public UTSNo2(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan berat badan anda ( dalam kg ): ");
        berat_badan = sc.nextShort();
        System.out.print("Masukkan tinggi badan anda ( dalam m ) : ");
        tinggi_badan = sc.nextDouble();
    }
    public double BMI(){
        return berat_badan / (tinggi_badan * tinggi_badan);
    }

    public static void main(String[] args) {
        UTSNo2 BB = new UTSNo2();
        System.out.println("Berat badan anda ( dalam kg ) : " + BB.berat_badan);
        System.out.println("Tinggi badan anda ( dalam m ): " + BB.tinggi_badan);
        if (BB.BMI() < 18.5){
            System.out.println("Anda underweight");
        }
        else if (BB.BMI() >= 18.5 && BB.BMI() <= 22.9 ){
            System.out.println("Anda normal");
        }
        else if (BB.BMI() > 22.9){
            System.out.println("Anda overweight");
        }
        System.out.println("Indeks berat badan anda adalah : " + BB.BMI());
    }
}

import java.util.Scanner;

public class _Latihan_ProgramLuasDanKelilingLingkaran {
    public static void main(String[] args) {
        final double PHI = 3.14;
        System.out.println("PHI : " + PHI);
        Scanner input = new Scanner(System.in);
        System.out.print("Panjang Jari Jari : " );
        int jariJari = input.nextInt();
        double LuasLingkaran = PHI*jariJari*jariJari;
        double KelilingLingkaran = 2*PHI*jariJari;
        System.out.println("\n");
        System.out.println("Luas Lingkaran : " + LuasLingkaran);
        System.out.println("Keliling Lingkaran : " + KelilingLingkaran);
    }
}

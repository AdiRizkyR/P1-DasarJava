import java.io.IOException;
import java.util.Scanner;

public class V_MengkonversiNilaiMasukanDariKeyboardKeTipeTertentuMenggunakanMethodBawaanKelasScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Nama : ");
        String name = input.nextLine();
        System.out.print("Masukan Umur : ");
        int age = input.nextInt();
        System.out.print("Masukan Tinggi Badan : ");
        double height = input.nextDouble();
        System.out.print("Sudah Menikah(true/false) : ");
        boolean married = input.nextBoolean();
        System.out.println(" ");
        System.out.println("Nama : " + name);
        System.out.println("Umur : " + age);
        System.out.println("Tinggi Badan : " + height);
        System.out.println("Sudah Menikah : " + married);
    }
}

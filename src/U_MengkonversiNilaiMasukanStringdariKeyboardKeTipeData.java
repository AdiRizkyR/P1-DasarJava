import java.io.IOException;
import java.util.Scanner;

public class U_MengkonversiNilaiMasukanStringdariKeyboardKeTipeData {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Nama : ");
        String name = input.nextLine();
        System.out.print("Masuakan Umur : ");
        String age = input.nextLine();
        System.out.print("Masukan Tinggi badan : ");
        String height = input.nextLine();
        System.out.print("Sudah Menikah (true/false) : ");

        String married = input.nextLine();
        System.out.println("Nama : " + name);
        System.out.println("Umur : " + Integer.parseInt(age));
        System.out.println("Tinggi Badan : " + Double.parseDouble(height));
        System.out.println("Sudah Menikah : " + Boolean.parseBoolean(married));
    }
}

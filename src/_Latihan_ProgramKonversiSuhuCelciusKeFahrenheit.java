import java.util.Scanner;

public class _Latihan_ProgramKonversiSuhuCelciusKeFahrenheit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Suhu Celcius saat ini : ");
        double Cel = input.nextDouble();
        double Fah = ((Cel*9)/5)+32;
        System.out.println("Suhu setelah dikonversikan dari " + Cel + " Celcius, Menjadi " + Fah + " Fahrenheit");
    }
}

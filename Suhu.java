import java.util.Scanner;

public class Suhu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan suhu dalam Celcius: ");
        double celsius = input.nextDouble();

        double reamur = celsius * 0.8;
        double fahrenheit = (celsius * 9/5) + 32;
        double kelvin = celsius + 273.15;

        System.out.println("Suhu dalam Reamur: " + reamur);
        System.out.println("Suhu dalam Fahrenheit: " + fahrenheit);
        System.out.println("Suhu dalam Kelvin: " + kelvin);

        input.close();
    }
}
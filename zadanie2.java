import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        double a = Math.PI;
        double b = Math.sqrt(a);

        b *= 100;
        b = Math.round(b);
        b /= 100;
        System.out.println("Zaokrąglony pierwiastek kwadratowy liczby pi to: " + b);
    }
}

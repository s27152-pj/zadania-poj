import java.util.Scanner;
public class Main {
    public static int suma(int a) {
        int suma = 1;
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0) {
                suma += i;
                if (i != a / i) {
                    suma += a / i;
                }
            }
        }
        return suma;
    }
    public static void main(String[] args) {
        int a;
        int b;

        Scanner input = new Scanner(System.in);

        System.out.print("Podaj pierwszą liczbę: ");
        a = input.nextInt();
        System.out.print("Podaj drugą liczbę: ");
        b = input.nextInt();

        if (suma(a) == b && suma(b) == a) {
            System.out.println("TAK");
        }
        else {
            System.out.println("NIE");
        }
    }
}

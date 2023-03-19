import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        double a, b, c;

        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj pierwsza:");
        a = scan.nextDouble();
        System.out.println("Podaj druga liczbe:");
        b = scan.nextDouble();
        System.out.println("Podaj trzecia liczbe:");
        c = scan.nextDouble();

        if (a > b & b > c) {
            System.out.println(c + " " + b + " " + a + " " + a + " " + b + " " + c);
        } else if (a > c & c > b) {
            System.out.println(b + " " + c + " " + a + " " + a + " " + c + " " + b);
        } else if (b > a & a > c) {
            System.out.println(c + " " + a + " " + b + " " + b + " " + a + " " + c);
        } else if (b > c & c > a) {
            System.out.println(a + " " + c + " " + b + " " + b + " " + c + " " + a);
        } else if (c > a & a > b) {
            System.out.println(b + " " + a + " " + c + " " + c + " " + a + " " + b);
        } else if (c > b & b > a) {
            System.out.println(a + " " + b + " " + c + " " + c + " " + b + " " + a);
        }
    }
}

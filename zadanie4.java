import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int a, b, c, d;

        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj pierwszy bok:");
        a = scan.nextInt();
        System.out.println("Podaj drugi bok");
        b = scan.nextInt();
        System.out.println("Podaj trzeci bok:");
        c = scan.nextInt();

        if (a + b > c & a + c > b & b + c > a) {
            System.out.println("TAK");
        }
        else {
            System.out.println("BŁĄD");
        }
    }
}

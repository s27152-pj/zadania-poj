import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        int a;
        int b;
        int c;

        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj pierwszy bok:");
        a = scan.nextInt();
        System.out.println("Podaj drugi bok");
        b = scan.nextInt();
        c = a * b;
        System.out.println("Pole prostokonta to: " + c);
    }
}

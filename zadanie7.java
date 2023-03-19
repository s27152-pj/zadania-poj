import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbe naturalna n: ");

        if (!scanner.hasNextInt()) {
            blad();
        }

        int n = scanner.nextInt();
        System.out.print("Podaj liczbe naturalna m: ");
        if (!scanner.hasNextInt()) {
            blad();
        }

        int m = scanner.nextInt();
        if (n <= 0 || m <= 0) {
            blad();
        }

        int[] TAB1 = new int[n];
        int[] TAB2 = new int[m];

        System.out.println("Wczytaj elementy tablicy 1:");
        for (int i = 0; i < n; i++) {
            System.out.print("Podaj " + (i + 1) + " elemnt tablicy 1: ");
            if (!scanner.hasNextInt()) {
                blad();
            }

            TAB1[i] = scanner.nextInt();
        }
        System.out.println("Wczytaj elementy tablicy 2:");

        for (int i = 0; i < m; i++) {
            System.out.print("Podaj " + (i + 1) + " elemnt tablicy 2: ");
            if (!scanner.hasNextInt()) {
                blad();
            }
            TAB2[i] = scanner.nextInt();
        }

        int is = 0;
        int min = Math.min(n, m);
        for (int i = 0; i < min; i++) {
            is += TAB1[i] * TAB2[i];
        }

        System.out.println("Iloczyn skalarny: " + is);
    }
    public static void blad(){
        System.out.print("BLAD");
        return;
    }
}

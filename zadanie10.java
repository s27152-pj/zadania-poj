import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbę wierszy");
        int a = scanner.nextInt();
        System.out.println("Podaj liczbę kolumn");
        int b = scanner.nextInt();

        int[][] tablica = new int[a][b];

        System.out.println("Wypisz macierz");

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                if (!scanner.hasNextInt()) {
                    System.out.print("BLAD");
                    return;
                }
                tablica[i][j] = scanner.nextInt();
            }
        }

        for (int j = 0; j < b; j++) {
            for (int i = 0; i < a; i++) {
                System.out.print(tablica[i][j] + " ");
            }
            System.out.println();
        }
    }
}

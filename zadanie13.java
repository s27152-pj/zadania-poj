import java.util.Scanner;

public class Main {
    public static int Znajdz(int[] arr, int a) {
        if (a == 1) {
            return arr[0];
        }
        return Math.max(arr[a-1], Znajdz(arr, a-1));
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj rozmiar tablicy: ");
        int a = scanner.nextInt();
        int[] arr = new int[a];

        System.out.println("Podaj elementy tablicy:");
        for (int i = 0; i < a; i++ ) {
            arr[i] = scanner.nextInt();
        }

        int maxelement = Znajdz( arr, a);
        System.out.println("Największy element tablicy to: " + maxelement);
    }
}

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbe naturalna n: ");
        if (!scanner.hasNextInt()) {
            System.out.print("BLAD");
            return;
        }

        int n = scanner.nextInt();
        if (n <= 0) {
            System.out.print("BLAD");
            return;
        }
        System.out.print("**\n***\n***\n**\n*\n***\n**\n *\n *\n**\n***\n");
    }
}

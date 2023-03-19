import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj zdanie: ");
        String zdanie = scanner.nextLine();

        Set<Character> litery = new HashSet<>();
        for (char c : zdanie.toLowerCase().toCharArray()) {
            if (Character.isLetter(c)) {
                litery.add(c);
            }
        }
        boolean Pangram = litery.size() == 26;
        System.out.println(Pangram);
    }
}

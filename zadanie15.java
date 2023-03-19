import java.util.Scanner;
import java.util.Stack;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wyrażenie nawiasowe");
        String wartosc = scanner.nextLine();

        Stack<Character> stos = new Stack<>();

        for (int i = 0; i < wartosc.length(); i++) {
            char c = wartosc.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                stos.push(c);
            }
            else if (c == ')' || c == ']' || c == '}') {
                if (stos.isEmpty() || (stos.peek() == '(' && c != ')') || (stos.peek() == '[' && c != ']') || (stos.peek() == '{' && c != '}')) {
                    System.out.println("nie");
                    return;
                }
                stos.pop();
            }
        }

        if(stos.isEmpty()) {
            System.out.println("Tak");
        }
        else {
            System.out.println("Nie");
        }
    }
}

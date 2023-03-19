import java.util.Scanner;

public class Main {
    public static boolean czyPalindrom(char[] wordArray, int count) {
        for (int i = 0; i < count / 2; i++) {
            if (wordArray[i] != wordArray[count - i - 1]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] wordArray = new char[100];
        int j = 0;
        int count = 0;
        System.out.print("Podaj słowo: ");
        String word = scanner.nextLine();
        for (char c : word.toCharArray()) {
            if (j >= wordArray.length) {
                break;
            }
            wordArray[j] = c;
            j++;
        }
        for (char a : wordArray) {
            if (Character.isLetter(a)) {
                count++;
            }
        }
        if (czyPalindrom(wordArray, count)) {
            System.out.println("TAK");
        } 
        else {
            System.out.println("NIE");
        }
    }
}

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Podaj dwa slowa oddzielone spacja: ");
        String s1 = scan.next();
        String s2 = scan.next();
        System.out.print("%" + s2 + " " + s1 + "%");
    }

}

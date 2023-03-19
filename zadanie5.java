import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int a;
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj miesiac z zakrsu 1-12:");
        a = scan.nextInt();

        if (a > 12) {
            System.out.println("BŁĄD");
        }
        switch (a) {
            case 1:
                System.out.println("Styczeń: 31dni");
                break;
            case 2:
                System.out.println("Luty: 31dni");
                break;
            case 3:
                System.out.println("Marzec: 31dni");
                break;
            case 4:
                System.out.println("Kwiecien: 30dni");
                break;
            case 5:
                System.out.println("Maj: 31dni");
                break;
            case 6:
                System.out.println("Czerwiec: 30dni");
                break;
            case 7:
                System.out.println("Lipiec: 31dni");
                break;
            case 8:
                System.out.println("Siepien: 31dni");
                break;
            case 9:
                System.out.println("Wrzesen: 30dni");
                break;
            case 10:
                System.out.println("Pazdziernik: 31dni");
                break;
            case 11:
                System.out.println("Listopad: 31dni");
                break;
            case 12:
                System.out.println("Grudzień: 31dni");
                break;
        }
    }
}

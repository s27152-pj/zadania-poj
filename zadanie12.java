import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj wiek osoby w sekundach: ");
        long Wiek = scanner.nextLong();

        System.out.print("Podaj planetę (Ziemia, Merkury, Wenus, Mars, Jowisz, Saturn, Uran, Neptun): ");
        String planet = scanner.next();

        double Wiekplaneta = Wiek / 31557600.0;

        switch (planet) {
            case "Ziemia":
                System.out.printf("Wiek osoby na Ziemi to %.2f lat", Wiekplaneta);
                break;
            case "Merkury":
                System.out.printf("Wiek osoby na Merkurym to %.2f lat na ziemi", Wiekplaneta / 0.2408467);
                break;
            case "Wenus":
                System.out.printf("Wiek osoby na Wenurze to %.2f lat na ziemi", Wiekplaneta / 0.61519726);
                break;
            case "Mars":
                System.out.printf("Wiek osoby na Marsie to %.2f lat na ziemi", Wiekplaneta / 1.8808158);
                break;
            case "Jowisz":
                System.out.printf("Wiek osoby na Jowiszu to %.2f lat na ziemi", Wiekplaneta / 11.862615);
                break;
            case "Saturn":
                System.out.printf("Wiek osoby na Saturnie to %.2f lat na ziemi", Wiekplaneta / 29.447498);
                break;
            case "Uran":
                System.out.printf("Wiek osoby na Uranie to %.2f lat na ziemi", Wiekplaneta / 84.016846);
                break;
            case "Neptun":
                System.out.printf("Wiek osoby na Neptunie to %.2f lat na ziemi", Wiekplaneta / 164.79132);
                break;
            default:
                System.out.println("Niepoprawna planeta");
        }
    }
}

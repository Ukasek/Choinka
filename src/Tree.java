import java.util.Scanner;

public class Tree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadź liczbę z przedziału 1-20: ");
        int number = scanner.nextInt();

        while (number > 20 || number < 1) {
            System.out.println("Liczba niepoprawna, podaj liczbę z przedziału 1-20: ");
            number = scanner.nextInt();
        }
        for (int numberOfLines = 0; numberOfLines <= number; numberOfLines++) {
            for (int space = 0; space < number - numberOfLines; space++) {
                System.out.print("");
            }
            for (int levels = 1; levels <= (numberOfLines * 2) - 1; levels++) {
                System.out.print("0");
            }
            System.out.println();
        }
    }
}

import java.util.Scanner;

void main() {
        Scanner scanner = new Scanner(System.in);

        IO.print("Litera: ");
        char litera = scanner.next().charAt(0);

        if ((litera >= 'A' && litera <= 'Z') || (litera >= 'a' && litera <= 'z')) {
            IO.println((litera <= 'Z') ? "Duża litera" : "Mała litera");
            IO.println((litera <= 90) ? "Duża litera" : "Mała litera");
            IO.println((litera <= 90.0) ? "Duża litera" : "Mała litera");
            IO.println((litera <= 90.0f) ? "Duża litera" : "Mała litera");
        }
        // Typ char można porównywać z char, int, double, float
}


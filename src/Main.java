import java.util.Scanner;

void main() {

    Scanner scanner = new Scanner(System.in);

//    Przywitanie użytkownika
    IO.print("Nazwa użytkownika: ");
    String name = scanner.next();
    IO.println("Cześć " + name);

//    Wyświetlenie menu + wybór użytkownika
    IO.println("MENU \n 1 -> sortowanie liczb \n 2 -> sortowanie liter");
    IO.print("Wybór: ");
    byte choice = (scanner.hasNextByte()) ? scanner.nextByte() : 0;

//    Działanie aplikacji na podstawie wyboru użytkownika
    switch(choice) {
        case 1:
            IO.print("Liczba 1: ");
            int l1 = (int) scanner.nextDouble();

            IO.print("Liczba 2: ");
            int l2 = (int) scanner.nextDouble();

            IO.print("Liczba 3: ");
            int l3 = (int) scanner.nextDouble();

            numSort(l1, l2, l3);
            break;
        case 2:
            IO.print("Litera 1: ");
            char c1 = scanner.next().charAt(0);

            IO.print("Litera 2: ");
            char c2 = scanner.next().charAt(0);

            IO.print("Litera 3: ");
            char c3 = scanner.next().charAt(0);

            charSort(c1, c2, c3);
            break;
        default:
            IO.println("Invalid input");
    }
}

private static void numSort(int l1, int l2, int l3) {
    if (l1 == l2) {
        IO.println((l1 > l3) ? l3 + "\n" + l2 + "\n" + l1 : l1 + "\n" + l2 + "\n" + l3);
    } else if (l2 == l3) {
        IO.println((l2 > l1) ? l1 + "\n" + l2 + "\n" + l3 : l2 + "\n" + l3 + "\n" + l1);
    } else if (l3 == l1) {
        IO.println((l3 > l2) ? l2 + "\n" + l1 + "\n" + l3 : l1 + "\n" + l3 + "\n" + l2);
    } else if (l1 < l2 && l1 < l3) {
        IO.println(l1 + "\n" + ((l2 > l3) ? l3 + "\n" + l2 : l2 + "\n" + l3));
    } else if (l2 < l1 && l2 < l3) {
        IO.println(l2 + "\n" + ((l1 > l3) ? l3 + "\n" + l1 : l1 + "\n" + l3));
    } else {
        IO.println(l3 + "\n" + ((l1 > l2) ? l2 + "\n" + l1 : l1 + "\n" + l2));
    }
}

private static void charSort(char c1, char c2, char c3) {
    if (c1 == c2) {
        IO.println((c1 > c3) ? c3 + "\n" + c2 + "\n" + c1 : c1 + "\n" + c2 + "\n" + c3);
    } else if (c2 == c3) {
        IO.println((c2 > c1) ? c1 + "\n" + c2 + "\n" + c3 : c2 + "\n" + c3 + "\n" + c1);
    } else if (c3 == c1) {
        IO.println((c3 > c2) ? c2 + "\n" + c1 + "\n" + c3 : c1 + "\n" + c3 + "\n" + c2);
    } else if (c1 < c2 && c1 < c3) {
        IO.println(c1 + "\n" + ((c2 > c3) ? c3 + "\n" + c2 : c2 + "\n" + c3));
    } else if (c2 < c1 && c2 < c3) {
        IO.println(c2 + "\n" + ((c1 > c3) ? c3 + "\n" + c1 : c1 + "\n" + c3));
    } else {
        IO.println(c3 + "\n" + ((c1 > c2) ? c2 + "\n" + c1 : c1 + "\n" + c2));
    }
}


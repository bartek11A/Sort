import java.util.Scanner;

void main() {

    Scanner scanner = new Scanner(System.in);

    IO.print("Liczba 1: ");
    int l1 = (int) scanner.nextDouble();

    IO.print("Liczba 2: ");
    int l2 = (int) scanner.nextDouble();

    IO.print("Liczba 3: ");
    int l3 = (int) scanner.nextDouble();

    numSort(l1, l2, l3);
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


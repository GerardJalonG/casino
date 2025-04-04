import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido al Casino");
        System.out.print("Ingresa tu nombre: ");
        String nombre = scanner.nextLine();
        Jugador jugador = new Jugador(nombre, 1000);

        while (true) {
            System.out.println("\nElige un juego:");
            System.out.println("1. Blackjack");
            System.out.println("2. Salir");

            int opcion = -1;
            while (true) {
                System.out.print("Ingresa tu opción: ");
                if (scanner.hasNextInt()) {
                    opcion = scanner.nextInt();
                    scanner.nextLine();
                    break;
                } else {
                    System.out.println("Por favor, ingresa un número válido.");
                    scanner.nextLine();
                }
            }

            if (opcion == 1) {
                Blackjack blackjack = new Blackjack(jugador);
                blackjack.jugar();
            } else if (opcion == 2) {
                System.out.println("Gracias por jugar.");
                scanner.close();
                break;
            } else {
                System.out.println("Opción no válida. Intenta de nuevo.");
            }
        }
    }
}


import java.util.Scanner;

public class Blackjack {
    private Mazo mazo;
    private Jugador jugador;
    private Jugador crupier;

    public Blackjack(Jugador jugador) {
        this.mazo = new Mazo();
        this.jugador = jugador;
        this.crupier = new Jugador("Crupier Paco", 0);
    }
    
    public void jugar() {
        System.out.println("\nBienvenido a Blackjack, " + jugador.getNombre() + "!");

        jugador.limpiarMano();
        jugador.recibirCarta(mazo.repartirCarta());
        jugador.recibirCarta(mazo.repartirCarta());
        crupier.recibirCarta(mazo.repartirCarta());
        crupier.recibirCarta(mazo.repartirCarta());

        System.out.println("Tu mano:");
        jugador.mostrarMano();

        Scanner sc = new Scanner(System.in);
        while (jugador.calcularPuntos() < 21) {
            System.out.println("\n¿Quieres otra carta? (s/n)");
            String respuesta = sc.nextLine();
            if (respuesta.equalsIgnoreCase("s")) {
                jugador.recibirCarta(mazo.repartirCarta());
                jugador.mostrarMano();
                System.out.println("\n");
            } else {
                break;
            }
        }

        System.out.println("\nMano del crupier:");
        crupier.mostrarMano();

        while (crupier.calcularPuntos() < 17) {
            crupier.recibirCarta(mazo.repartirCarta());
            System.out.println("Crupier toma una carta...\n");
            crupier.mostrarMano();
        }

        determinarGanador();
    }

    private void determinarGanador() {
        int puntosJugador = jugador.calcularPuntos();
        int puntosCrupier = crupier.calcularPuntos();

        if (puntosJugador > 21) {
            System.out.println("Te pasaste de 21, pierdes.");
        } else if (puntosCrupier > 21 || puntosJugador > puntosCrupier) {
            System.out.println("¡Ganaste!");
        } else if (puntosJugador == puntosCrupier) {
            System.out.println("Empate.");
        } else {
            System.out.println("Perdiste.");
        }
    }
}

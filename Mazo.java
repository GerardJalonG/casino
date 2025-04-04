import java.util.*;

public class Mazo {
    private List<Carta> cartas;

    public Mazo() {
        String[] palos = {"Corazones", "Diamantes", "Tréboles", "Picas"};
        String[] valores = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        cartas = new ArrayList<>();

        for (String palo : palos) {
            for (String valor : valores) {
                cartas.add(new Carta(palo, valor));
            }
        }
        barajar();
    }

    public void barajar() {
        Collections.shuffle(cartas);
    }
    public Carta repartirCarta() {
        if (cartas.isEmpty()) {
            return null;
        }
        return cartas.remove(cartas.size() - 1);
    }
}

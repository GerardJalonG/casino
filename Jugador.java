import java.util.ArrayList;
import java.util.List;

public class Jugador {
    private String nombre;
    private double saldo;
    private List<Carta> mano; 
    
    public Jugador(String nombre, double saldo){
        this.nombre = nombre;
        this.saldo = saldo;
        this.mano = new ArrayList<Carta>(); 

    }

    public void limpiarMano() {
        mano.clear();
    }
    
    public void recibirCarta(Carta carta) {
        mano.add(carta);
    }

    public int calcularPuntos() {
        int total = 0;
        int ases = 0;
        for (Carta carta : mano) {
            total += carta.getValorNumerico();
            if (carta.getValorNumerico() == 11) ases++;
        }

        while (total > 21 && ases > 0) {
            total -= 10;
            ases--;
        }
        return total;
    }

    
    public void mostrarMano() {
        for (Carta carta : mano) {
            System.out.println(carta);
        }
        System.out.println("Puntos: " + calcularPuntos());
    }


    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


}

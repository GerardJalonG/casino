public abstract class Juego {
    private String nombre;
    private int numJugadores;
    private int minJugadores;
    private int maxJugadores;

    
    public Juego(String nombre, int numJugadores, int minJugadores, int maxJugadores) {
        this.nombre = nombre;
        this.numJugadores = numJugadores;
        this.minJugadores = minJugadores;
        this.maxJugadores = maxJugadores;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumJugadores() {
        return numJugadores;
    }

    public int getMinJugadores() {
        return minJugadores;
    }

    public int getMaxJugadores() {
        return maxJugadores;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumJugadores(int numJugadores) {
        this.numJugadores = numJugadores;
    }

    public void setMinJugadores(int minJugadores) {
        this.minJugadores = minJugadores;
    }

    public void setMaxJugadores(int maxJugadores) {
        this.maxJugadores = maxJugadores;
    }

    public abstract void inicarJuego(); 

    public abstract void ganador();

}
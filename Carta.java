public class Carta {
    private String palo;
    private String valor;

    public Carta(String palo, String valor) {
        this.palo = palo;
        this.valor = valor;
    }

    public int getValorNumerico(){
        if(valor.equals("A")){
            return 11;
        }else if(valor.equals("K")|| valor.equals("Q") || valor.equals("J")){
            return 10;
        }else{
            return Integer.parseInt(valor);
        }
    }

    @Override
    public String toString() {
        return valor + " de " + palo;
    }

    
}

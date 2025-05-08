/*

 */
package Tercera.Ejercicio08;

public class MazoPalo extends Mazo {
    public static final int POSICIONY = 20;
    int palo;
    
    public MazoPalo(int posX) {
        super(posX, POSICIONY, Carta.ANCHURA, Carta.ALTURA);
    }
    
    public boolean anadir(Carta carta) {
        if(cartas.isEmpty() && carta.getValor()==1) {
            cartas.add(carta);
            palo = carta.getPalo();
            recolocar();
            return true;
        } else {
            if(palo == carta.getPalo() && (carta.getValor()-1 == cartas.get(cartas.size()-1).getValor())) {
                cartas.add(carta);
                recolocar();
                return true;
            }
        }
        return false;
    }
    
    public void recolocar() {
        this.extraer().setPosicion(x, POSICIONY);
    }
}
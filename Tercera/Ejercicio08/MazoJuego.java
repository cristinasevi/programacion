/*

 */
package Tercera.Ejercicio08;

public class MazoJuego extends Mazo {
    public static final int POSICIONY = 170;
    
    public MazoJuego(int posX) {
        super(posX, POSICIONY, Carta.ANCHURA, Carta.ALTURA);
    }
    
    public boolean anadir(Carta carta) {
        if(cartas.isEmpty() || (carta.getColor() != extraer().getColor()) && (carta.getValor()+1 == extraer().getValor())) {
            cartas.add(carta);
            recolocar();
            return true;
        }
        return false;
    }
    
    public void recolocar() {
        if(cartas.size() == 1) {
            extraer().setPosicion(x, y);
        } else {
            extraer().setPosicion(x, this.extraer().y+30);
        }
    }
}
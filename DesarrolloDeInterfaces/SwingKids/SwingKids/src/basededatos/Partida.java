
package basededatos;

/**
 *
 * @author rafaelblancoaranda
 */
public class Partida {
    private int id;
    private int score;
    private Jugador Jugador;
    
    public Partida(){
        
    }

    public Partida(int id, int score, Jugador Jugador) {
        this.id = id;
        this.score = score;
        this.Jugador = Jugador;
    }

    public int getId() {
        return id;
    }

    public int getScore() {
        return score;
    }

    public Jugador getJugador() {
        return Jugador;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setJugador(Jugador Jugador) {
        this.Jugador = Jugador;
    }

    @Override
    public String toString() {
        return this.Jugador.getUserName() +" - "+this.score ;
    }
    
    
}

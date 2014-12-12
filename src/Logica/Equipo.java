/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package Logica;

/**
 *
 * @author Rolando
 */
public class Equipo {
    private Jugador jugadores[] = new Jugador[23];
    
    /* private boolean searchCamisa(int camias){
    for(int i=0; i<contador; i++ ){
    if(jugadores[i])
    }
    }*/
    
    public Jugador searchPlayer(int numCamisa){
        return jugadores[numCamisa-1];
    }
    
    public boolean addJugador(int numCamisa, String nombre, String posicion){
        if(numCamisa<=23 && numCamisa>=1){
            if(jugadores[numCamisa-1] == null){
                jugadores[numCamisa-1] = new Jugador(numCamisa, nombre, posicion);
                return true;
            }
        }
        return false;
    }
    
    public boolean addGoles(int numCamisa, int goles){
        if(jugadores[numCamisa-1] != null){
            jugadores[numCamisa-1].addGoles(goles);
            return true;
        }
        return false;
    }
    
    public String[] getTitles(){
        return new String[] {"Num. Camisa", "Nombre", "Posicion", "Goles Anotados"};
    }
    
    public Object[][] getJugadores(){
        Object[][] players = new Object[jugadores.length][4];
        for (int i = 0; i < this.jugadores.length; i++) {
            if(jugadores[i]!=null){
                players[i][0] = jugadores[i].getNumCamiseta();
                players[i][1] = jugadores[i].getNombre();
                players[i][2] = jugadores[i].getPosicion();
                players[i][3] = jugadores[i].getGolesAnotados();
            }
        }
        return players;
    }
}

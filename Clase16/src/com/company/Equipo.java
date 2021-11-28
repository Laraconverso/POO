package com.company;
import java.util.Set;
import java.util.TreeSet;


public class Equipo {
    private String nombre;
    private Set<Jugador> jugadores;

    public Equipo(String nombre){
        this.nombre = nombre;
        this.jugadores = new TreeSet<>();
    }

    public void addJugador(Jugador jugador){
        this.jugadores.add(jugador);
    }
    
    public void mostrarTitulares(){
        for(Jugador jugaor: this.jugadores){
            if(jugadores.esTitular()){
                System.out.println(jugadores);
            }
        }
    }


    public int getTotalJugadoresLesionados(){
        int total = 0;
        for(Jugador jugador : this.jugadores){
            if(jugador.esTitular() && jugador.estalesionado()){
                total++;
            }
        }
        return total;
    }

}

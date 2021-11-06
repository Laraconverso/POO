package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        UsuarioJuego usuarioJuego = new UsuarioJuego("Demo" , "1" );
        System.out.println(usuarioJuego.getPuntaje());
        usuarioJuego.aumentarPuntaje();
        System.out.println(usuarioJuego.getPuntaje());
        usuarioJuego.bonus(5);
        System.out.println( usuarioJuego.getClave());
        System.out.println(usuarioJuego.getNombre());
        usuarioJuego.setNombre("Grupo 2");
        System.out.println(usuarioJuego.getNombre());
    }
}

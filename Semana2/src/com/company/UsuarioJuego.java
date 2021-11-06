package com.company;

public class UsuarioJuego {
// habla de crear el usuario -> constructor
    private String nombre;
    private String clave;
    private Double puntaje;
    private int nivel;

    public UsuarioJuego(String nombre, String clave) {
        this.setNombre(nombre);
        this.setClave(clave);
        this.setPuntaje(0.0);
        this.setNivel(0);
    }

    public void aumentarPuntaje(){
        this.setPuntaje(this.getPuntaje() + 1);
    }
    public void subirNivel(){
        this.setNivel(this.getNivel() + 1);
    }

    public void bonus(int valor){
        this.setPuntaje(this.getPuntaje() + valor);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public Double getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(Double puntaje) {
        this.puntaje = puntaje;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
}

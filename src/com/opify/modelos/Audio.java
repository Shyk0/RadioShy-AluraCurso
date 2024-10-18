package com.opify.modelos;

public class Audio {
    private String titulo;
    private int totalReproducciones;
    private int totalMegustas;
    private int clasificacion;


    public void meGusta(){
        this.totalReproducciones++;
    }

    public void reproduce(){
        this.totalReproducciones++;
    }

    //Getters

    public int getClasificacion() {
        return clasificacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getTotalMegustas() {
        return totalMegustas;
    }

    public int getTotalReproducciones() {
        return totalReproducciones;
    }

    //Setters

    public void setClasificacion(int clasificacion) {
        this.clasificacion = clasificacion;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setTotalMegustas(int totalMegustas) {
        this.totalMegustas = totalMegustas;
    }

    public void setTotalReproducciones(int totalReproducciones) {
        this.totalReproducciones = totalReproducciones;
    }
}

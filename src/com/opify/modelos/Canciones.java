package com.opify.modelos;

public class Canciones extends Audio{
    private String album;
    private String cantante;
    private String genero;

    // Getter y Setter para el atributo album
    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    // Getter y Setter para el atributo cantante
    public String getCantante() {
        return cantante;
    }

    public void setCantante(String cantante) {
        this.cantante = cantante;
    }

    // Getter y Setter para el atributo genero
    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

}

package com.opify.modelos;

// Clase que permite añadir contenido de audio a favoritos basado en su clasificación
public class Favoritos {
    // Método para adicionar un audio a la lista de favoritos
    public void adicione(Audio audio) {
        if (audio.getClasificacion() >= 8) {
            System.out.println(audio.getTitulo() + " Es popular en estos momentos");
        } else {
            System.out.println(audio.getTitulo() + " Es el favorito en las tierras colombianas");
        }
    }
}

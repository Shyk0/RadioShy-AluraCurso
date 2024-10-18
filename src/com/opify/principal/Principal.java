package com.opify.principal;

import com.opify.modelos.Canciones;
import com.opify.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Canciones miCancion = new Canciones();
        miCancion.setTitulo("Nice to meet you");
        miCancion.setCantante("Imagine Dragons");

        Podcast miPodcast = new Podcast();
        miPodcast.setPresentador("Jordi Wild");
        miPodcast.setDescripcion("The Wild Project");

        for (int i = 0; i < 100; i++) {
            miCancion.meGusta();
        }
        for (int i = 0; i < 5000; i++) {
            miCancion.reproduce();
        }

        System.out.println("Total de reproducciones: " + miCancion.getTotalReproducciones());
        System.out.println("Total de likes " + miCancion.getTotalMegustas()
        );
    }
}

package com.andresfelipe.minetflix.modelos;
import java.util.Scanner;
public class Calculadora {
    public void calcularSerie(){
        System.out.println("Bienvenido a tu calculadora de tiempo (Series)");
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa el nombre de la serie");
        String nombre = teclado.nextLine();
        System.out.println("Ingrese el año de lanzamiento");
        int fechaDeLanzamiento = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Ingrese el numero de temporadas");
        int temporadas = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Ingrese el numero de episodios");
        int episodios = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Ingrese la duracion de minutos por episodio");
        int duracionMinutosPorEpisodio = teclado.nextInt();
        teclado.nextLine();
        Serie serie = new Serie();
        serie.setNombre(nombre);
        serie.setFechaDeLanzamiento(fechaDeLanzamiento);
        serie.setTemporadas(temporadas);
        serie.setEpisodioPorTemporada(episodios);
        serie.setDuracionEnMinutosPorEpisodio(duracionMinutosPorEpisodio);
        System.out.println("------------------------------------------------");
    }
}

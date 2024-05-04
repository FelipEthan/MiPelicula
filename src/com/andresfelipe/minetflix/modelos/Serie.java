package com.andresfelipe.minetflix.modelos;
import java.util.Scanner;
public class Serie extends Titulo {
    private int temporadas;
    private int episodioPorTemporada;
    private int duracionEnMinutosPorEpisodio;
    @Override
    public int getTiempoDeDuracion() {
        return temporadas * episodioPorTemporada * duracionEnMinutosPorEpisodio;
    }
    public int getTemporadas() {
        return temporadas;
    }
    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }
    public int getEpisodioPorTemporada() {
        return episodioPorTemporada;
    }
    public void setEpisodioPorTemporada(int episodioPorTemporada) {
        this.episodioPorTemporada = episodioPorTemporada;
    }
    public int getDuracionEnMinutosPorEpisodio() {
        return duracionEnMinutosPorEpisodio;
    }
    public void setDuracionEnMinutosPorEpisodio(int duracionEnMinutosPorEpisodio) {
        this.duracionEnMinutosPorEpisodio = duracionEnMinutosPorEpisodio;
    }
    @Override
    public void muestraTecnica() {
        super.muestraTecnica();
        System.out.println("El numero de temporadas es de: " + getTemporadas());
        System.out.println("El numero de episodios por temporada es de: " + getEpisodioPorTemporada());
        System.out.println("El calculo para ver la serie completa es de : " + getTiempoDeDuracion());
    }
    public void crearSerie() {
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
        System.out.println("");
        System.out.println("Serie creada con exito!!!....");
        serie.muestraTecnica();
        System.out.println("------------------------------------------------");
    }
}

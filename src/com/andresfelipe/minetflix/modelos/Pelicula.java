package com.andresfelipe.minetflix.modelos;
import java.util.Scanner;
public class Pelicula extends Titulo {
    private String director;
    public String getDirector() {
        return director;
    }
    public void setDirector(String director) {
        this.director = director;
    }
    public void fichaPelicula() {
        System.out.println("Sinopsis " + getSinopsis());
    }
    @Override
    public void muestraTecnica() {
        super.muestraTecnica();
        System.out.println("El nombre del director es " + director);
    }
    public void crearPelicula() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa el nombre de la pelicula");
        String nombre = teclado.nextLine();
        System.out.println("Ingresa el nombre del director");
        String nombreDirector = teclado.nextLine();
        System.out.println("Ingresa el año de lanzamiento");
        int añoDeLanzamiento = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Ingresa la duración en minutos");
        int tiempoDeDuracion = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Ingresa la sinopsis");
        String sinopsis = teclado.nextLine();

        Pelicula pelicula = new Pelicula();
        pelicula.setNombre(nombre);
        pelicula.setDirector(nombreDirector);
        pelicula.setFechaDeLanzamiento(añoDeLanzamiento);
        pelicula.setTiempoDeDuracion(tiempoDeDuracion);
        pelicula.setSinopsis(sinopsis);
        System.out.println("");
        System.out.println("Pelicula creada con exito!!!....");
        pelicula.muestraTecnica();
        pelicula.fichaPelicula();
        System.out.println("-------------------------------");
    }
}

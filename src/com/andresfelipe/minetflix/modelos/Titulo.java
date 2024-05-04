package com.andresfelipe.minetflix.modelos;

public class Titulo {
    private String nombre;
    private int tiempoDeDuracion;
    private int fechaDeLanzamiento;
    private boolean incluidoEnElPlan;
    private int evaluacion;
    private String sinopsis;



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTiempoDeDuracion() {
        return tiempoDeDuracion;
    }

    public void setTiempoDeDuracion(int tiempoDeDuracion) {
        this.tiempoDeDuracion = tiempoDeDuracion;
    }

    public int getFechaDeLanzamiento() {
        return fechaDeLanzamiento;
    }

    public void setFechaDeLanzamiento(int fechaDeLanzamiento) {
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public boolean isIncluidoEnElPlan() {
        return incluidoEnElPlan;
    }

    public void setIncluidoEnElPlan(boolean incluidoEnElPlan) {
        this.incluidoEnElPlan = incluidoEnElPlan;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public void muestraTecnica(){
        System.out.println("----------FICHA TECNICA---------");
        System.out.println("El nombre del titulo es: " + getNombre());
        System.out.println("El año de lanzamiento es: " +getFechaDeLanzamiento());
        System.out.println("El tiempo de duracion es: " + getTiempoDeDuracion());
    }
}

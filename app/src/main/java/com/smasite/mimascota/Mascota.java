package com.smasite.mimascota;

/**
 * Created by macbookretina on 30/04/17.
 */

public class Mascota {
    private String nombre;
    private String raick;
    private int foto;

    public Mascota(int foto, String nombre, String raick) {
        this.nombre = nombre;
        this.raick = raick;
        this.foto = foto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaick() {
        return raick;
    }

    public void setRaick(String raick) {
        this.raick = raick;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }
}

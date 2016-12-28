package com.androidbolivia.naviapp;
import java.io.Serializable;
/**
 * Created by and on 23-12-16.
 */

public class Regalo implements Serializable {
    private String Nombre;
    private String Descripcion;
    private String Precio;
    private int Imagen;

    public Regalo(){

    }

    public Regalo(String nombre, String descripcion, String precio, int imagen) {
        this.Nombre = nombre;
        this.Descripcion = descripcion;
        this.Precio = precio;
        this.Imagen = imagen;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public String getPrecio() {
        return Precio;
    }

    public void setPrecio(String precio) {
        Precio = precio;
    }

    public int getImagen() {
        return Imagen;
    }

    public void setImagen(int imagen) {
        Imagen = imagen;
    }
}

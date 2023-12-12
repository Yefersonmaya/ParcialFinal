package Bibliotecas.modelos;

import Bibliotecas.interfaces.ShowObjects;

public class LibroElectronico extends Libro implements ShowObjects {

    private String formato;

    public LibroElectronico(String titulo, String autor, String año, String formato) {
        super(titulo, autor, año);
        this.formato = formato;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    @Override
    public void showInfo(){
        System.out.println("Titulo: " + getTitulo());
        System.out.println("Autor: " + getAutor());
        System.out.println("Año: " + getAño());
        System.out.println("Formato: " + this.formato);
        System.out.println("");
    }
}


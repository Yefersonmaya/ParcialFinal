package Bibliotecas.modelos;

public class Libro {
    private String titulo;
    private String autor;
    private String año;

    public Libro(String titulo, String autor, String año) {
        this.titulo = titulo;
        this.autor = autor;
        this.año = año;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

    public void showLibro(){
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Año: " +this.año);
        System.out.println("");
    }
}
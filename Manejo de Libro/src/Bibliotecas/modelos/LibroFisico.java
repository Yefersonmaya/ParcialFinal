package Bibliotecas.modelos;

import Bibliotecas.interfaces.ShowObjects;

public class LibroFisico extends Libro implements ShowObjects {
    private int paginas;

    public LibroFisico(String titulo, String autor, String año, int paginas) {
        super(titulo, autor, año);
        this.paginas = paginas;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    @Override
    public void showInfo(){
        System.out.println("Titulo: " + getTitulo());
        System.out.println("Autor: " + getAutor());
        System.out.println("Año: " + getAño());
        System.out.println("Paginas: " + this.paginas);
        System.out.println("");
    }
}

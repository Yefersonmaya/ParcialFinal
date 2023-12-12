package Bibliotecas;

import Bibliotecas.modelos.LibroElectronico;
import Bibliotecas.modelos.LibroFisico;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    List<LibroFisico> libroFisicoList;
    List<LibroElectronico> libroElectronicoList;

    public void iniciarListas(){
       libroFisicoList = new ArrayList<>();
       libroElectronicoList = new ArrayList<>();
    }

    public void mostrarLibrosPorCategoria(String categoria){
        if(categoria.equals("Todos")){
            System.out.println("Libros fisicos: ");
            System.out.println("");
            for(LibroFisico libro : libroFisicoList){
                libro.showInfo();
            }
            System.out.println("Libros electronicos: ");
            System.out.println("");
            for(LibroElectronico libro : libroElectronicoList){
                libro.showInfo();
            }
        }

        if(categoria.equals("Fisicos")) {
            System.out.println("Libros fisicos: ");
            System.out.println("");
            for(LibroFisico libro : libroFisicoList){
                libro.showInfo();
            }
        }

        if(categoria.equals("Electronicos")) {
            System.out.println("Libros electronicos: ");
            System.out.println("");
            for(LibroElectronico libro : libroElectronicoList){
                libro.showInfo();
            }
        }

    }

    public void mostrarLibrosSinFormato(){
        for(LibroFisico libro : libroFisicoList){
            libro.showLibro();
        }
        for(LibroElectronico libro : libroElectronicoList){
            libro.showLibro();
        }
    }
}